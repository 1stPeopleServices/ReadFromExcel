package extractdata.datamodel;

import lombok.Data;

@Data
public class ScoringConfiguration {

    private String scoringComponent;
    private String irec;
    private String peerReviewer;
    private String secretariat;

    public ScoringConfiguration addData(String[] title, String[] line) {

        for(int i=1; i<title.length; i++)
            processKeyPair(title[i], line[i]);

        return this;
    }

    public void processKeyPair(String keyValue,
                               String pairValue)
    {
        if (keyValue.trim().equalsIgnoreCase("Scoring Component"))
            setScoringComponent(pairValue);
        if (keyValue.trim().equalsIgnoreCase("IREC"))
            setIrec(pairValue);
        if (keyValue.trim().equalsIgnoreCase("Peer Reviewer"))
            setPeerReviewer(pairValue);
        if (keyValue.trim().equalsIgnoreCase("Secretariat"))
            setSecretariat(pairValue);
    }

}
