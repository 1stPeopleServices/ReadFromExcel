package extractdata.datamodel;

import lombok.Data;

@Data
public class TemplateTypes {

    private String description;
    private String emailTemplates;
    private String reminderTemplates;
    private String reminderDays;


    public TemplateTypes addData(String[] title, String[] line) {
        if(line[0].trim().length()>1)
            setDescription(line[0]);

        for(int i=1; i<title.length; i++)
            processKeyPair(title[i], line[i]);

        return this;
    }

    public void processKeyPair(String keyValue,
                               String pairValue)
    {

        if (keyValue.trim().equalsIgnoreCase("Email Templates"))
            setEmailTemplates(pairValue);
        if (keyValue.trim().equalsIgnoreCase("Reminder Templates"))
            setReminderTemplates(pairValue);
        if (keyValue.trim().equalsIgnoreCase("Reminder Days"))
            setReminderDays(pairValue);
    }
}
