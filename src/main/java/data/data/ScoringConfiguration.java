package data.data;

import lombok.Data;

@Data
public class ScoringConfiguration {
    private String scoringComponent;
    private String weighting;
    private String quorum;
    private String plenum;

    public void processLine(String[] line)
    {
            processKeyPair(line[1], line[2]);
    }

    public void processKeyPair(String keyValue,
                                            String pairValue)
    {
        if (keyValue.trim().equalsIgnoreCase("Scoring Component"))
            setScoringComponent(pairValue);
        if (keyValue.trim().equalsIgnoreCase("Weighting"))
            setWeighting(pairValue);
        if (keyValue.trim().equalsIgnoreCase("Quorum"))
            setQuorum(pairValue);
        if (keyValue.trim().equalsIgnoreCase("Plenum"))
            setPlenum(pairValue);
    }

}
