package data;

import java.util.Map;
import java.util.TreeMap;

public class StorageMap {

    private Map <String, String> attributesInfo;

    public StorageMap()
    {
        attributesInfo = new TreeMap <String, String>();
    }

    public void addKey(String textValue)
    {
        attributesInfo.put(textValue, "");
    }

    public void addValue(String key, String textValue)
    {
        attributesInfo.put(key, textValue);
    }

    public Map <String, String> getData(String key)
    {
        return attributesInfo;
    }


}
