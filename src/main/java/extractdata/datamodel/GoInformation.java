package extractdata.datamodel;

import lombok.Data;

@Data
public class GoInformation {
    private String grantOpportunityName;
    private String schemeInSapphire;
    private String assessOpen;
    private String reviewStart;
    private String duration;

    public void processLine(String[] line) {

        processData(line[1], line[2]);
    }

    public void processData(String keyValue, String pairValue)
    {
        if (keyValue.trim().equalsIgnoreCase("Grant Opportunity Name"))
            setGrantOpportunityName(pairValue);
        if (keyValue.trim().equalsIgnoreCase("Scheme in Sapphire"))
            setSchemeInSapphire(pairValue);
        if (keyValue.trim().equalsIgnoreCase("Assess Open"))
            setAssessOpen(pairValue);
        if (keyValue.trim().equalsIgnoreCase("Review Start"))
            setReviewStart(pairValue);
        if (keyValue.trim().equalsIgnoreCase("Duration"))
            setDuration(pairValue);
    }

}
