package extractdata.datamodel;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class DocumentPackages {

    private String[] title;
    private List <DocumentPackage> documentPackageList;

    public DocumentPackages()
    {
        documentPackageList = new ArrayList <>();
    }

    public void addDocumentPackage(String[] line)
    {
        DocumentPackage documentPackage =
                new DocumentPackage();

        if(title==null)
            title = line;
        else
            documentPackage.addData(title, line);
    }
}
