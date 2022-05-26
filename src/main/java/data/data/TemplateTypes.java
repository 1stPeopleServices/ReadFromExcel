package data.data;

import lombok.Data;

@Data
public class TemplateTypes {

    private String emailTemplates;
    private String reminderTemplates;
    private String reminderDays;


    public TemplateTypes processLine(String[] line, String[] title)
    {
        for(int i=1; i<title.length; i++)
            processKeyPair(title[i], line[i]);

        return this;
    }

    public TemplateTypes processKeyPair(String keyValue,
                                            String pairValue)
    {
        if (keyValue.trim().equalsIgnoreCase("Email Templates"))
            setEmailTemplates(pairValue);
        if (keyValue.trim().equalsIgnoreCase("Reminder Templates"))
            setReminderTemplates(pairValue);
        if (keyValue.trim().equalsIgnoreCase("Reminder Days"))
            setReminderDays(pairValue);

        return this;
    }
}
