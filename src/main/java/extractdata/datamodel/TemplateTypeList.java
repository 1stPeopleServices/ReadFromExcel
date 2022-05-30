package extractdata.datamodel;

import java.util.ArrayList;
import java.util.List;

public class TemplateTypeList {

    private String[] title;
    private List <TemplateTypes> templateTypesList;

    public TemplateTypeList()
    {
        templateTypesList = new ArrayList <>();
    }

    public void addTemplateTypes(String[] line)
    {
        TemplateTypes templateTypes =
                new TemplateTypes();
        if(title==null)
            title = line;
        else
            templateTypesList.add(templateTypes.addData(title,line));
    }

}
