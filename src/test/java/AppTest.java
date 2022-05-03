import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class AppTest {

    @Test
    public void getExcelData() throws IOException, CsvException {
        CSVReader reader = new CSVReader(new FileReader("C:\\Users\\Scarlet Solutions\\Downloads\\2022 e-Asia - Assign and Assess Configuration v6.0 2.csv"));
        List <String[]> myEntries = reader.readAll();




    }
}
