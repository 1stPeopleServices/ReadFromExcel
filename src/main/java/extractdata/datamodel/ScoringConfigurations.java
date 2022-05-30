package extractdata.datamodel;

import java.util.ArrayList;
import java.util.List;

public class ScoringConfigurations {

    private String[] title;
    private List <ScoringConfiguration> scoringConfigurationList;

    public ScoringConfigurations()
    {
        scoringConfigurationList = new ArrayList <>();

    }

    public void addScoringConfiguration(String[] line)
    {
        ScoringConfiguration scoringConfiguration =
                new ScoringConfiguration();
        if(title==null)
        {
            title = line;
            System.out.println(title);
        }
        else
            scoringConfigurationList.add(scoringConfiguration.addData(title,line));
    }

    public List <ScoringConfiguration> getScoringConfigurations()
    {
        return scoringConfigurationList;
    }
}
