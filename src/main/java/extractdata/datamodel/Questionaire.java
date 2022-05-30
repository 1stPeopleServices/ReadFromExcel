package extractdata.datamodel;

import lombok.Data;

@Data
public class Questionaire {

    private String questionaire;
    private String copyFrom;
    private String matrix;

    public Questionaire addData(String[] title, String[] line) {

        for(int i=1; i<title.length; i++)
            processKeyPair(title[i], line[i]);

        return this;
    }

    public void processKeyPair(String keyValue,
                                            String pairValue)
    {
        if (keyValue.trim().equalsIgnoreCase("Questionnaire"))
            setQuestionaire(pairValue);
        if (keyValue.trim().equalsIgnoreCase("Copy from"))
            setCopyFrom(pairValue);
        if (keyValue.trim().equalsIgnoreCase("Matrix"))
            setMatrix(pairValue);

    }

}
