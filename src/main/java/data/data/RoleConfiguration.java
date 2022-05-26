package data.data;

import lombok.Data;

@Data
public class RoleConfiguration {

    private String assessorRoles;
    private String assessmentForm;

    public RoleConfiguration processLine(String[] line, String[] title)
    {
        for(int i=1; i<title.length; i++)
            processKeyPair(title[i], line[i]);

        return this;
    }

    public RoleConfiguration processKeyPair(String keyValue,
                                               String pairValue)
    {
        if (keyValue.trim().equalsIgnoreCase("Assesor Roles"))
            setAssessorRoles(pairValue);
        if (keyValue.trim().equalsIgnoreCase("Assessment Form"))
            setAssessmentForm(pairValue);
        return this;
    }

}
