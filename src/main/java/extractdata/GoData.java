package extractdata;

import extractdata.datamodel.*;
import lombok.Data;

@Data
public class GoData {

    private Header header;
    private GoInformation goInformation;
    private StagingConfiguration stagingConfiguration1;
    private StagingConfiguration stagingConfiguration2;
    private ScoringConfigurations scoringConfiguration1;
    private ScoringConfigurations scoringConfiguration2;
    private RoleConfigurations roleConfigurations1;
    private RoleConfigurations roleConfigurations2;
    private AssessmentSharings assessmentSharings1;
    private AssessmentSharings assessmentSharings2;
    private DocumentPackages documentPacakages1;
    private DocumentPackages documentPacakages2;
    private QuestionaireList questionaires1;
    private QuestionaireList questionaires2;
    private TemplateTypeList templateTypes;

    public GoData()
    {
        header = new Header();
        goInformation = new GoInformation();
        stagingConfiguration1= new StagingConfiguration();
        stagingConfiguration2= new StagingConfiguration();
        scoringConfiguration1 = new ScoringConfigurations();
        scoringConfiguration2 = new ScoringConfigurations();
        roleConfigurations1 = new RoleConfigurations();
        roleConfigurations2 = new RoleConfigurations();
        assessmentSharings1 = new AssessmentSharings();
        assessmentSharings2 = new AssessmentSharings();
        documentPacakages1 = new DocumentPackages();
        documentPacakages2 = new DocumentPackages();
        questionaires1 = new QuestionaireList();
        questionaires2 = new QuestionaireList();
        templateTypes = new TemplateTypeList();
    }


    public void setHeader(String[] line)
    {
        header.processLine(line);
    }

    public void setGoInformation(String[] line){
        goInformation.processLine(line);
    }

    public void setStagingConfiguration1(String[] line)
    {
        stagingConfiguration1.processLine(line);
    }

    public void setStagingConfiguration2(String[] line)
    {
        stagingConfiguration2.processLine(line);
    }

    public void setScoringConfiguration1(String[] line)
    {
        scoringConfiguration1.addScoringConfiguration((line));
    }

    public ScoringConfigurations getScoringConfiguration1()
    {
        return scoringConfiguration1;
    }


    public void setScoringConfiguration2(String[] line)
    {
        scoringConfiguration2.addScoringConfiguration((line));
    }

    public void setRoleConfiguration1(String[] line)
    {
        roleConfigurations1.addRoleConfiguration(line);
    }

    public void setRoleConfiguration2(String[] line)
    {
        roleConfigurations2.addRoleConfiguration(line);
    }

    public void setAssessmentConfiguration1(String[] line)
    {
        assessmentSharings1.addAssessmentSharing(line);
    }

    public void setAssessmentConfiguration2(String[] line)
    {
        assessmentSharings2.addAssessmentSharing(line);
    }

    public void setDocumentPackages1(String[] line)
    {
        documentPacakages1.addDocumentPackage(line);
    }

    public void setDocumentPackages2(String[] line)
    {
        documentPacakages2.addDocumentPackage(line);
    }

    public void setQuestionaireList1(String[] line)
    {
        questionaires1.addQuestionaire(line);
    }

    public void setQuestionaireList2(String[] line)
    {
        questionaires2.addQuestionaire(line);
    }

    public void setTemplateType(String[] line)
    {
        templateTypes.addTemplateTypes(line);
    }



}
