
package com.microsoft.bingads.reporting;

import java.util.List;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter8
    extends XmlAdapter<String, List<CampaignStatusReportFilter>>
{


    public List<CampaignStatusReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.reporting.CampaignStatusReportFilterConverter.convertToList(value));
    }

    public String marshal(List<CampaignStatusReportFilter> value) {
        return (com.microsoft.bingads.reporting.CampaignStatusReportFilterConverter.convertToString(value));
    }

}
