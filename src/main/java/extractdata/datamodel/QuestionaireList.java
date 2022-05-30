package extractdata.datamodel;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class QuestionaireList {

    private String[] title;
    private List <Questionaire> questionaireList;

    public QuestionaireList()
    {
        questionaireList = new ArrayList <>();
    }

    public void addQuestionaire(String[] line) {
        Questionaire questionaire =
                new Questionaire();
        if(title==null)
            title = line;
        else
            questionaireList.add(questionaire.addData(title, line));
    }
}
