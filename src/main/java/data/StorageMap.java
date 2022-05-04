package data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class StorageMap {

    private String title;
    private Map <String, String> attributesInfo;
    private List <Map<String, String>> attributesList;

    public StorageMap()
    {
        attributesInfo = new TreeMap <String, String>();
        attributesList = new ArrayList <Map <String, String>>();
    }

    public void addValue(String key, String textValue)
    {
        attributesInfo.put(key, textValue);
    }

    public StorageMap getData(String key)
    {
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Map <String, String> getAttributesInfo() {
        return attributesInfo;
    }

    public void setAttributesInfo(Map <String, String> attributesInfo) {
        this.attributesInfo = attributesInfo;
    }

    public List <Map <String, String>> getAttributesList() {
        return attributesList;
    }

    public void addAttributes(Map <String, String> attributesInfo) {
        attributesList.add(attributesInfo);
    }
}
