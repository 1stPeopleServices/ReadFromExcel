package data.data;

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

}
