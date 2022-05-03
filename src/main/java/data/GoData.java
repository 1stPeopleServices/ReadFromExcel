package data;

import java.util.ArrayList;
import java.util.List;

public class GoData {

    private StorageMap header;

    private StorageMap goInformation;

    private List <StorageMap> stagingConfigCollection;

    private List<StorageMap> scoringConfigCollection;

    private List<List<StorageMap>> roleConfigurationCollection;

    private List<List<StorageMap>> assessmentSharingCollection;

    private List<List<StorageMap>> documentPackageCollection;

    private List<StorageMap> questionaireCollection;

    private List<StorageMap> templateType;

    private StorageMap changes;

    public GoData()
    {
        header = new StorageMap();

        goInformation = new StorageMap();

        stagingConfigCollection = new ArrayList <StorageMap>();

        scoringConfigCollection= new ArrayList <StorageMap>();

        roleConfigurationCollection= new ArrayList <List <StorageMap>>();

        assessmentSharingCollection= new ArrayList <List <StorageMap>>();

        documentPackageCollection= new ArrayList <List <StorageMap>>();

        questionaireCollection= new ArrayList <StorageMap>();

        templateType= new ArrayList <StorageMap>();

        changes = new StorageMap();

    }


    public StorageMap getHeader() {
        return header;
    }

    public StorageMap getGoInformation() {
        return goInformation;
    }

    public List <StorageMap> getStagingConfigCollection() {
        return stagingConfigCollection;
    }

    public List  <StorageMap> getScoringConfigCollection() {
        return scoringConfigCollection;
    }

    public List <List <StorageMap>> getRoleConfigurationCollection() {
        return roleConfigurationCollection;
    }

    public List <List <StorageMap>> getAssessmentSharingCollection() {
        return assessmentSharingCollection;
    }

    public List <List <StorageMap>> getDocumentPackageCollection() {
        return documentPackageCollection;
    }

    public List <StorageMap> getQuestionaireCollection() {
        return questionaireCollection;
    }

    public List <StorageMap> getTemplateType() {
        return templateType;
    }

    public StorageMap getChanges() {
        return changes;
    }


    public void setHeader(StorageMap header) {

        this.header = header;
    }

    public void setGoInformation(StorageMap goInformation) {
        this.goInformation = goInformation;
    }

    public void addStagingConfig(StorageMap stagingConfig) {
        stagingConfigCollection.add(stagingConfig);
    }

    public void addScoringConfig(StorageMap scoringConfig) {
        scoringConfigCollection.add(scoringConfig);
    }

    public void addRoleConfig(List <StorageMap> roleConfig) {
        roleConfigurationCollection.add(roleConfig);
    }

    public void addAssessmentSharing(List <StorageMap> assessmentSharing) {
        assessmentSharingCollection.add(assessmentSharing);
    }

    public void addDocumentPackage(List <StorageMap> documentPackage) {
        documentPackageCollection.add(documentPackage);
    }

    public void addQuestionaire(StorageMap questionaire) {
        questionaireCollection.add(questionaire);
    }

    public void setTemplateType(List<StorageMap> templateType) {
        this.templateType = templateType;
    }

    public void setChanges(StorageMap changes) {
        this.changes = changes;
    }
}
