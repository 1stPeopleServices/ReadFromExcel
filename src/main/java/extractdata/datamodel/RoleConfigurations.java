package extractdata.datamodel;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class RoleConfigurations {

    private String[] title;
    private List <RoleConfiguration> roleConfigurationList;

    public RoleConfigurations()
    {
        roleConfigurationList = new ArrayList <>();
    }

    public void addRoleConfiguration(String[] line)
    {
        RoleConfiguration roleConfiguration =
                new RoleConfiguration();
        if(title==null)
            title = line;
        else
            roleConfigurationList.add(roleConfiguration.addData(title,
                line));
    }

}
