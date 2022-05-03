import data.GoData;
import data.ReadExcelFile;
import data.StorageMap;

import java.util.ArrayList;
import java.util.List;

public class ProcessExcelData {

    private GoData goData;
    private String fileName;
    private int sheetindex;
    private int dataIndex;
    private List<String[]> testData;

    public ProcessExcelData(String fileName, int sheetIndex) throws Exception {
        goData = new GoData();
        this.fileName = fileName;
        this.sheetindex = sheetIndex;
        testData = new ReadExcelFile("", 1).getData();
    }

    public GoData parseExcelFile() throws Exception {
        for(dataIndex=0; dataIndex<testData.size(); dataIndex ++)
           addData(testData.get(dataIndex)[0]);
        return goData;
    }

    private void addData(String textValue) throws Exception {
        switch (textValue)
        {
            case "Header":
                goData.setHeader(getKeyValuePair());break;
            case "GO Information":
                goData.setGoInformation(getKeyValuePair());break;
            case "Staging Configuration":
                goData.addStagingConfig(getKeyValuePair());break;
            case "Scoring Configuration":
                goData.addScoringConfig(getKeyValuePair());break;
            case "Role Configuration":
                goData.addRoleConfig(getKeyValuePairList());break;
            case "Assessment Sharing":
                goData.addAssessmentSharing(getKeyValuePairList()); break;
            case "Document Package":
                goData.addDocumentPackage(getKeyValuePairList());break;
            case "Questionnaire":
                goData.addQuestionaire(getKeyValuePair()); break;
            case "Template":
                goData.setTemplateType(getKeyValuePairList()); break;
            case "Changes":
                goData.setChanges(getKeyValuePair()); break;
            default:
                throw new Exception("Unknown Header : " + textValue + " found. Please verify");
        }
    }

    /*
     * returns the key value pair
     */
    private StorageMap getKeyValuePair() {

        StorageMap storageData = new StorageMap();

        storageData.addValue("", "");
        int blankCount=0;

        do
        {
            String header = testData.get(dataIndex)[0].trim();
            String keyValue = testData.get(dataIndex)[1].trim();
            String pairValue = testData.get(dataIndex)[2].trim();

        }
        while (blankCount < 3);

            if(!testData.get(dataIndex)[1].trim().equals(""))
                storageData.addValue("3","3");

        return storageData;
    }

    /*
     * returns array of key value pairs
     */
    private List <StorageMap> getKeyValuePairList()
    {
        List<StorageMap> testData = new ArrayList <>();
        /*

         */
        return testData;
    }

}
