import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import data.ReadExcelFile;
import data.GoData;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class AppTest {

    @Test
    public void getExcelData() throws Exception {
        String fileName = "C:\\Users\\Scarlet Solutions\\Downloads\\2021 CARDIOVASCULAR.xlsx";
        ReadExcelFile readExcelFile = new ReadExcelFile(fileName, 0);
        String newFile = readExcelFile.convertToCSV();
        List <String[]> dataInFile = readExcelFile.getData(newFile);
        GoData goData = readExcelFile.writeDataAsObject(dataInFile);

        System.out.println("Test");


    }


    @Test
    public void testFile() throws Exception {
        String filename = "C:\\Users\\Scarlet Solutions\\Downloads\\2021 MUSCULOSKELETAL- Assess Configuration v5.0.xlsx";
        ReadExcelFile readExcelFile = new ReadExcelFile(filename,0);
        readExcelFile.convertToCSV();
    }
}
