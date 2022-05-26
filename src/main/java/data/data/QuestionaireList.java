package data.data;

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

    public void setQuestionaires(String line) {

    }
}
