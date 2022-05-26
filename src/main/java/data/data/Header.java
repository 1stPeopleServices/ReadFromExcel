package data.data;

import lombok.Data;

@Data
public class Header {
    private String goName;
    private String openProcess;
    private String zohoTicket;
    private String steward;

    public void processLine(String[] line) {

        processData(line[1], line[2]);
    }

    public void processData(String keyValue, String pairValue)
    {
        if (keyValue.trim().equalsIgnoreCase("Go Name"))
            setGoName(pairValue);
        if (keyValue.trim().equalsIgnoreCase("Open Process"))
            setOpenProcess(pairValue);
        if (keyValue.trim().equalsIgnoreCase("Zoho Ticket"))
            setZohoTicket(pairValue);
        if (keyValue.trim().equalsIgnoreCase("Steward"))
            setSteward(pairValue);
    }
}
