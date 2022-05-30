package extractdata.datamodel;

import lombok.Data;

@Data
public class AssessmentSharing {
    private String assessorRole;
    private String indigenousAssessor;
    private String questionToTick;

    public AssessmentSharing addData(
            String[] title, String[] line)
    {
        for(int i=1; i<line.length; i++ )
            processKeyPair(title[i], line[i]);

        return this;
    }

    public void processKeyPair(String keyValue,
                               String pairValue)
    {
        if (keyValue.trim().equalsIgnoreCase("Assessor Role"))
            setAssessorRole(pairValue);
        if (keyValue.trim().equalsIgnoreCase("Indigenous Assessor"))
            setIndigenousAssessor(pairValue);
        if (keyValue.trim().equalsIgnoreCase("Question to Tick"))
            setQuestionToTick(pairValue);
    }
}
