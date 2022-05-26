package data.model;

import lombok.Data;

import java.util.*;

@Data
public class ListOfMaps {
    private  List <Map <String, String>> mapsList;
    public ListOfMaps()
    {
        mapsList = new ArrayList <>();
    }


    public List <Map <String, String>> setListOfMapValues(List <List <String>> lines)

    {
        List<String> header = new ArrayList<>();
        for(int i=0; i<lines.size(); i++)
        {
            Map<String, String> map = new LinkedHashMap <>();
            if(i==0)
                header = lines.get(i);
            else
            {
                List<String> values = lines.get(i);
                for(int j=1; j<values.size(); j++ )
                {
                    map.put(header.get(j), values.get(j));
                }
                mapsList.add(map);
            }

        }

        return mapsList;
    }


    public List <Map <String, String>> getListOfMaps()
    {
        return mapsList;
    }

}
