package data;

import com.aspose.cells.NameCollection;
import com.aspose.cells.SaveFormat;
import com.aspose.cells.Workbook;
import com.opencsv.CSVReader;

import java.io.*;
import java.util.List;

public class ReadExcelFile {

    private String fileName;
    private int pageIndex;

    public ReadExcelFile(String fileName, int pageIndex)
    {
        this.fileName = fileName;
        this.pageIndex = pageIndex;
    }

    private String convertToCSV(String operationName) throws Exception {
        File file = new File(fileName);
        String path = file.getPath();
        Workbook workbook = new Workbook(fileName);
        String newFileName = fileName.replace(".xlsx", ".csv");
        int numberOfSheets =  workbook.getWorksheets().getCount();
        if(numberOfSheets >1)
        {
            NameCollection worksheetNames = workbook.getWorksheets().getNames();
            for(int i=0; i<numberOfSheets; i++)
            {
                // stop when the worksheet is reached
            }
        }

        workbook.save( newFileName, SaveFormat.CSV);
        return newFileName;
    }


    public List <String[]> getData() throws Exception {

        CSVReader reader = new CSVReader(new FileReader("yourfile.csv"));
        List <String[]> myEntries = reader.readAll();
        return myEntries;
    }


}
