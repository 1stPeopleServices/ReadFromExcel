package extractdata.datamodel;

import lombok.Data;

@Data
public class RoleConfiguration {

    private String assessorRoles;
    private String scoringComponent;
    private String assessmentForm;

    public RoleConfiguration addData(String[] title, String[] line) {

        for(int i=1; i<title.length; i++)
            processKeyPair(title[i], line[i]);

        return this;
    }

    public void processKeyPair(String keyValue,
                                               String pairValue)
    {
        if (keyValue.trim().equalsIgnoreCase("Assesor Roles"))
            setAssessorRoles(pairValue);
        if (keyValue.trim().equalsIgnoreCase("Scoring Component"))
            setScoringComponent(pairValue);
        if (keyValue.trim().equalsIgnoreCase("Assessment Form"))
            setAssessmentForm(pairValue);
    }


}
