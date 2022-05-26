package data;

import com.aspose.cells.Workbook;
import com.opencsv.CSVReader;
import data.data.Header;

import java.io.*;
import java.util.*;

public class ReadExcelFile {

    private String fileName;
    private int pageIndex;

    public ReadExcelFile(String fileName, int pageIndex)
    {
        this.fileName = fileName;
        this.pageIndex = pageIndex;
    }

    public String convertToCSV() throws Exception {
        File file = new File(fileName);
        Workbook workbook = new Workbook(fileName);
        String newFile = file.getParent() + "\\" +
                file.getName().replace(".xlsx", ".csv");
        workbook.save(newFile);
        return newFile;
    }


    public List <String[]> getData(String fileName) throws Exception {
        CSVReader reader = new CSVReader(new FileReader(fileName));
        List <String[]> myEntries = reader.readAll();
        return myEntries;
    }


    public Map <String, List <List <String>>> writeData(List <String[]> entriesCollecction)
    {
        Map<String, List<List<String>>> testData = new LinkedHashMap <>();

        List <String[]> listWithoutSpace = new ArrayList <>();
        for(int i=0; i<entriesCollecction.size(); i++)
        {
            String[] entries = entriesCollecction.get(i);
            if(!entries[0].trim().isEmpty())
            {
                if(entries.length>1)
                {
                    if(!entries[1].trim().isEmpty())
                        listWithoutSpace.add(entries);
//                    System.out.println(String.join(",", entries));
                }
                else{
                    listWithoutSpace.add(entries);
//                    System.out.println(String.join(",", entries));
                }
            }

              else
            {
                if(entries.length > 1)
                {
                    listWithoutSpace.add(entries);
                    System.out.println(String.join(",", entries));
                }
            }

        }

        String header = "";
        List<String> line = new ArrayList <>();
        List<List<String>> lines = new ArrayList <>();

        for(int i=0; i<entriesCollecction.size(); i++) {
            String[] entries = entriesCollecction.get(i);

            if (isAlphaNumeric(entries[0]))
            {
                if(i>0)
                {
                    if(!entries[0].trim().isEmpty())
                    {
                        if(entries.length>1)
                        {
                            if(entries[1].trim().isEmpty())
                            {
                                header = entries[0];
                            }
                        }
                        else
                            header = entries[0];
                    }

                    if(testData.containsKey(header))
                        header = header + "1";
                    testData.put(header, lines);
                    lines.clear();
                }
                else
                    header = entries[0];


            }

            for (int j = 1; j > entries.length; j++) {
                line.add(entries[j]);
            }
            lines.add(line);
            line.clear();
        }

        return testData;

    }

    public boolean isAlphaNumeric(String textValue)
    {
        textValue = textValue.trim();

        for(int i=0; i<textValue.length(); i++)
        {
            char myChar =  textValue.charAt(i);
            if (!Character.isSpaceChar(myChar) && !Character.isLetterOrDigit(myChar)) {
                return false;
            }
        }
        return true;
    }

    public GoData writeDataAsObject(List<String[]> testData)
    {
        GoData goData = new GoData();

        String headerText="";
        for(int i=0; i<testData.size(); i++)
        {

            String[] line = testData.get(i);
            if(headerText.equalsIgnoreCase("")
                   && line[0].length()>1)
            {
                headerText = line[0];
                System.out.println(headerText);
            }


            if(line.length==1) {
                headerText = "";
            }
            else
            {
                switch (headerText)
                {
                    case "Header":
                        goData.setHeader(line);
                        continue;
                    case "Scoring Configuration":
                        goData.setScoringConfiguration1(line);

                }


            }



        }
        return goData;
    }



}
