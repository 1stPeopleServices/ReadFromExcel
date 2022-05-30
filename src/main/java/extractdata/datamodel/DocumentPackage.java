package extractdata.datamodel;

import lombok.Data;

@Data
public class DocumentPackage {

    private String assessorRole;
    private String documents;

    public DocumentPackage addData(
            String[] title, String[] line)
    {
        for(int i=1; i<line.length; i++ )
            processKeyPair(title[i], line[1]);

        return this;
    }

    private void processKeyPair(String keyValue,
                               String pairValue)
    {
        if (keyValue.trim().equalsIgnoreCase("Assessor Role"))
            setAssessorRole(pairValue);
        if (keyValue.trim().equalsIgnoreCase("Documents"))
            setDocuments(pairValue);
    }

}
