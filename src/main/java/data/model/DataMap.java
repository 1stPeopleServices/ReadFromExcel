package data.model;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DataMap {

    private Map <String,String> mapValues;

    public DataMap()
    {
        mapValues = new LinkedHashMap <>();
    }

    public void setMapValues(List <List <String>> lines)
    {
        for(List<String> line: lines)
            if(line.size()>0)
            mapValues.put(line.get(1), line.get(2));
    }

    public Map <String, String> getMap()
    {
        return mapValues;
    }

}
