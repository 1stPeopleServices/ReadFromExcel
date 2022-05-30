//import data.ReadExcelFile;
import extractdata.GoData;
import extractdata.ReadFromExcel;
import extractdata.datamodel.*;
import org.junit.Test;

import java.util.List;

public class AppTest {

    @Test
    public void getExcelData() throws Exception {
        String fileName = "C:\\Users\\Scarlet Solutions\\Downloads\\2022 e-Asia - Assign and Assess Configuration v6.0 (2).xlsx";
        ReadFromExcel readFromExcel = new ReadFromExcel(fileName);
        List <String[]> dataInFile = readFromExcel.getData();
        GoData goData = readFromExcel.createGoData(dataInFile);

        Header header = goData.getHeader();
        System.out.println(header.getGoName()); // Print Go Name
        System.out.println(header.getOpenProcess()); // Print Open Process
        System.out.println(header.getZohoTicket()); // Print Zoho Ticket
        System.out.println(header.getSteward()); // Print Steward

        StagingConfiguration stagingConfiguration1 = goData.getStagingConfiguration1();
        System.out.println(stagingConfiguration1.getTitle()); // Print Title
        System.out.println(stagingConfiguration1.getCopyStageConfigurationFromExisting()); // Print Copy Stage Configuration From Exsiting
        System.out.println(stagingConfiguration1.getPredecessorStage()); // Print Predecessor Stage
        System.out.println(stagingConfiguration1.getCopyResponsesFromPredecessor()); // Print Copy Responses From Predecessor
        System.out.println(stagingConfiguration1.getFinalScore()); // Print Final Score
        System.out.println(stagingConfiguration1.getSendEmail()); // Print Send Email
        System.out.println(stagingConfiguration1.getImmediatelyPerformAssessment()); // Print Immediately Perform Assessment
        System.out.println(stagingConfiguration1.getAllowBulkDownload()); // Print Allow Bulk Download

        ScoringConfigurations scoringConfigurations1 = goData.getScoringConfiguration1();
        List<ScoringConfiguration> scoringConfigurationList = scoringConfigurations1.getScoringConfigurations();
        for(int i=0; i<scoringConfigurationList.size(); i++)
        {
            ScoringConfiguration scoringConfiguration = scoringConfigurationList.get(i);
            System.out.println(scoringConfiguration.getScoringComponent()); // Print Scoring Component
            System.out.println(scoringConfiguration.getIrec()); // Print IREC
            System.out.println(scoringConfiguration.getPeerReviewer()); // Print Peer Reviewer
        }


        ScoringConfigurations scoringConfigurations2 = goData.getScoringConfiguration1();
        List<ScoringConfiguration> scoringConfigurationList2 = scoringConfigurations2.getScoringConfigurations();
        for(int i=0; i<scoringConfigurationList2.size(); i++)
        {
            ScoringConfiguration scoringConfiguration = scoringConfigurationList2.get(i);
            System.out.println(scoringConfiguration.getScoringComponent()); // Print Scoring Component
            System.out.println(scoringConfiguration.getSecretariat()); // Print Secretarariat
        }



    }


    @Test
    public void testFile() throws Exception {
        String filename = "C:\\Users\\Scarlet Solutions\\Downloads\\2021 MUSCULOSKELETAL- Assess Configuration v5.0.xlsx";
//        ReadExcelFile readExcelFile = new ReadExcelFile(filename,0);
//        readExcelFile.convertToCSV();
    }
}
