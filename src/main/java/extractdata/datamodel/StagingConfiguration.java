package extractdata.datamodel;

import lombok.Data;

@Data
public class StagingConfiguration {

    private String title;
    private String copyStageConfigurationFromExisting;
    private String predecessorStage;
    private String copyResponsesFromPredecessor;
    private String finalScore;
    private String sendEmail;
    private String immediatelyPerformAssessment;
    private String allowBulkDownload;


    public void processLine(String[] line) {
        if(line[1].trim().length()>1)
            processData(line[1], line[2]);
    }

    public void processData(String keyValue, String pairValue)
    {
        if (keyValue.trim().equalsIgnoreCase("Title"))
            setTitle(pairValue);
        if (keyValue.trim().equalsIgnoreCase("Copy stage configuration from existing"))
            setCopyStageConfigurationFromExisting(pairValue);
        if (keyValue.trim().equalsIgnoreCase("Predecessor Stage"))
            setPredecessorStage(pairValue);
        if (keyValue.trim().equalsIgnoreCase("Copy responses from Predecessor"))
            setCopyResponsesFromPredecessor(pairValue);
        if (keyValue.trim().equalsIgnoreCase("Send email?"))
            setSendEmail(pairValue);
        if (keyValue.trim().equalsIgnoreCase("Immediately Perform Assessment"))
            setImmediatelyPerformAssessment(pairValue);
        if (keyValue.trim().equalsIgnoreCase("Allow Bulk Download"))
            setAllowBulkDownload(pairValue);
    }
}
