package data;

import data.data.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class GoData {

    private Header header;
    private GoInformation goInformation;
    private StagingConfiguration stagingConfiguration1;
    private StagingConfiguration stagingConfiguration2;
    private ScoringConfiguration scoringConfiguration1;
    private ScoringConfiguration scoringConfiguration2;
    private RoleConfigurations roleConfigurations1;
    private RoleConfigurations roleConfigurations2;
    private AssessmentSharings assessmentSharings1;
    private AssessmentSharings assessmentSharings2;
    private DocumentPackages documentPacakages1;
    private DocumentPackages documentPacakages2;
    private QuestionaireList questionaires1;
    private QuestionaireList questionaires2;
    private TemplateTypes templateTypes;

    public GoData()
    {
        header = new Header();
        goInformation = new GoInformation();
        stagingConfiguration1= new StagingConfiguration();
        stagingConfiguration2= new StagingConfiguration();
        scoringConfiguration1 = new ScoringConfiguration();
        scoringConfiguration2 = new ScoringConfiguration();
        roleConfigurations1 = new RoleConfigurations();
        roleConfigurations2 = new RoleConfigurations();
        assessmentSharings1 = new AssessmentSharings();
        assessmentSharings2 = new AssessmentSharings();
        documentPacakages1 = new DocumentPackages();
        documentPacakages2 = new DocumentPackages();
        questionaires1 = new QuestionaireList();
        templateTypes = new TemplateTypes();
    }


    public void setScoringConfiguration1(String[] line)
    {
        scoringConfiguration1.processLine(line);
    }

    public void setScoringConfiguration2(String[] line)
    {
        scoringConfiguration2.processLine(line);
    }

    public void setDocumentPackages(String[] line)
    {
    }



    public void setHeader(String[] line)
    {
        header.processLine(line);
    }
}
