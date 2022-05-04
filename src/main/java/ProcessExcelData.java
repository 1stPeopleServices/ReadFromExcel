import data.GoData;
import data.ReadExcelFile;
import data.StorageMap;

import java.util.ArrayList;
import java.util.List;

public class ProcessExcelData {

    private GoData goData;
    private String fileName;
    private int dataIndex;
    private List<String[]> testData;

    public ProcessExcelData(String fileName) throws Exception {
        goData = new GoData();
        this.fileName = fileName;
        testData = new ReadExcelFile("", 1).getData();
    }

    public GoData parseExcelFile() throws Exception {
        for(dataIndex=1; dataIndex<testData.size(); dataIndex ++)
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
        int blankCount = 0;
        do
        {
            String header = testData.get(dataIndex)[0].trim();
            if(header.isEmpty())
            {
                dataIndex++;
                blankCount ++;
            }
            else
            {
                storageData.setTitle(header);
                do
                {
                    String keyValue = testData.get(dataIndex)[1].trim();
                    String pairValue = testData.get(dataIndex)[2].trim();
                    storageData.addValue(keyValue, pairValue);
                    dataIndex++;
                }
                while (!testData.get(dataIndex)[1].isEmpty());
            }
        }

        //

        while (blankCount < 2);



        return storageData;
    }

    /*
     * returns array of key value pairs
     */
    private List <StorageMap> getKeyValuePairList()
    {
        List<StorageMap> testData = new ArrayList <>();


        return testData;
    }

}
