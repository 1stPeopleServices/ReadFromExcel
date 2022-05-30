package extractdata.datamodel;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class AssessmentSharings {

    private String[] title;
    private List <AssessmentSharing> assessmentSharingList;

    public AssessmentSharings()
    {
        assessmentSharingList = new ArrayList <>();
    }

    public void addAssessmentSharing(String[] line)
    {
        AssessmentSharing assessmentSharing = new AssessmentSharing();

        if(title==null)
            title = line;
        else
            assessmentSharingList.add(assessmentSharing.addData(title, line));
    }
}
