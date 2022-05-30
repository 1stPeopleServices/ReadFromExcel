package extractdata;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * Uses Apache POI api
 * Reads Excel data
 * returns excel data as a list of String array
 */

/**
 * The type Excel manager.
 */
public class ReadFromExcel {

    private String fileName;
    public ReadFromExcel(String fileName)
    {
        this.fileName = fileName;
    }
    public List <String[]> getData() throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook(fileName);
        XSSFSheet sheet = workbook.getSheetAt(0);
        DataFormatter dataFormatter = new DataFormatter();

        int rowCount = sheet.getPhysicalNumberOfRows();
        System.out.println("No.of Rows " + rowCount);
        List<String> headers = new ArrayList <>();
        String headerText="";
        List<String[]> excelData = new ArrayList <>();
        String cellValue="";
        for(int i=0; i<rowCount; i++) {
            if (!(sheet.getRow(i) == null)) {
                String firstColumnValue = sheet.getRow(i).getCell(0).getStringCellValue().toLowerCase();

                if(firstColumnValue.contains("Header".toLowerCase()))
                {
                    if (headers.contains(firstColumnValue))
                        firstColumnValue = firstColumnValue + "1";

                    headerText = firstColumnValue;
                    headers.add(firstColumnValue);
                }

                if(firstColumnValue.contains("GO Information".toLowerCase())) {
                    if (headers.contains(firstColumnValue))
                        firstColumnValue = firstColumnValue + "1";

                    headerText = firstColumnValue;
                    headers.add(firstColumnValue);
                }

                if(firstColumnValue.contains("Staging Configuration".toLowerCase())) {
                    if (headers.contains(firstColumnValue))
                        firstColumnValue = firstColumnValue + "1";

                    headerText = firstColumnValue;
                    headers.add(firstColumnValue);
                }

                if(firstColumnValue.contains("Scoring Configuration".toLowerCase())) {
                    if (headers.contains(firstColumnValue))
                        firstColumnValue = firstColumnValue + "1";

                    headerText = firstColumnValue;
                    headers.add(firstColumnValue);
                }


                if(firstColumnValue.contains("Role Configuration".toLowerCase())) {
                    if (headers.contains(firstColumnValue))
                        firstColumnValue = firstColumnValue + "1";

                    headerText = firstColumnValue;
                    headers.add(firstColumnValue);
                }

                if(firstColumnValue.contains("Assessment Sharing".toLowerCase())) {
                    if (headers.contains(firstColumnValue))
                        firstColumnValue = firstColumnValue + "1";

                    headerText = firstColumnValue;
                    headers.add(firstColumnValue);
                }

                if(firstColumnValue.contains("Document Package".toLowerCase())) {
                    if (headers.contains(firstColumnValue))
                        firstColumnValue = firstColumnValue + "1";

                    headerText = firstColumnValue;
                    headers.add(firstColumnValue);
                }

                if(firstColumnValue.contains("Questionnaire".toLowerCase())) {
                    if (headers.contains(firstColumnValue))
                        firstColumnValue = firstColumnValue + "1";

                    headerText = firstColumnValue;
                    headers.add(firstColumnValue);
                }

                if(firstColumnValue.contains("Template Types".toLowerCase())) {
                    if (headers.contains(firstColumnValue))
                        firstColumnValue = firstColumnValue + "1";

                    headerText = firstColumnValue;
                    headers.add(firstColumnValue);
                }

                if(firstColumnValue.contains("Changes".toLowerCase())) {
                    headerText = firstColumnValue;
                }

                int numberOfCols = sheet.getRow(i).getPhysicalNumberOfCells();
                String[] testData = new String[numberOfCols];
                for (int j = 0; j < numberOfCols; j++) {
                        cellValue = dataFormatter.formatCellValue(sheet.getRow(i).getCell(j));
                        if(j==0)
                                testData[j] = headerText;
                        else
                            testData[j] = dataFormatter.formatCellValue(sheet.getRow(i).getCell(j));
                }
                excelData.add(testData);
            }
        }
        excelData = removeBlankLines(excelData);
        return excelData;
    }

    public GoData createGoData(List<String[]> excelData)
    {
        GoData goData = new GoData();

        String headerText="";
        for(int i=0; i<excelData.size(); i++)
        {
            String[] line = excelData.get(i);
            headerText = line[0].toLowerCase();
            switch (headerText)
            {
                case "header":
                    if(!(line[1].trim().equals("")))
                        goData.setHeader(line);
                    break;
                case "go information":
                    if(!(line[1].trim().equals("")))
                        goData.setGoInformation(line);
                    break;
                case "staging configuration":
                    if(!(line[1].trim().equals("")))
                        goData.setStagingConfiguration1(line);
                    break;
                case "staging configuration1":
                    if(!(line[1].trim().equals("")))
                        goData.setStagingConfiguration2(line);
                    break;
                case "scoring configuration":
                    if(!(line[1].trim().equals("")))
                        goData.setScoringConfiguration1(line);
                    break;
                case "scoring configuration1":
                    if(!(line[1].trim().equals("")))
                        goData.setScoringConfiguration2(line);
                    break;
                case "role configuration":
                    if(!(line[1].trim().equals("")))
                        goData.setRoleConfiguration1(line);
                    break;
                case "role configuration1":
                    if(!(line[1].trim().equals("")))
                        goData.setRoleConfiguration2(line);
                    break;
                case "assessment sharing":
                    if(!(line[1].trim().equals("")))
                        goData.setAssessmentConfiguration1(line);
                    break;
                case "assessment sharing1":
                    if(!(line[1].trim().equals("")))
                        goData.setAssessmentConfiguration2(line);
                    break;
                case "document package":
                    if(!(line[1].trim().equals("")))
                        goData.setDocumentPackages1(line);
                    break;
                case "document package1":
                    if(!(line[1].trim().equals("")))
                        goData.setDocumentPackages2(line);
                    break;
                case "questionnaire":
                    if(!(line[1].trim().equals("")))
                        goData.setQuestionaireList1(line);
                    break;
                case "questionnaire1":
                    if(!(line[1].trim().equals("")))
                        goData.setQuestionaireList2(line);
                    break;
                case "template types":
                    if(!(line[1].trim().equals("")))
                        goData.setTemplateType(line);
                    break;
                case "changes":
                    break;
        }


        }

        return goData;
    }
    public List <String[]> removeBlankLines(List<String[]> dataList)
    {
        List<String[]> listWithoutBlanks = new ArrayList <>();
        for(int i=0; i<dataList.size(); i++)
        {
            String[] temp = dataList.get(i);
            String tempVar = String.join("", temp);
            if(!(tempVar.trim().equals("")))
                listWithoutBlanks.add(temp);

        }

        return listWithoutBlanks;
    }

    public static void main(String args[]) throws IOException {
        String fileName = "C:\\Users\\Scarlet Solutions\\Downloads\\2022 e-Asia - Assign and Assess Configuration v6.0 (2).xlsx";
        ReadFromExcel readFromExcel = new ReadFromExcel(fileName);
        List<String[]> myString= readFromExcel.getData();
        List<String[]> myStringWithoutBlank = readFromExcel.removeBlankLines(myString);
        System.out.println("");
    }
}

