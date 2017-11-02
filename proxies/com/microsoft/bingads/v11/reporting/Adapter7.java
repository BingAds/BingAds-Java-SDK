
package com.microsoft.bingads.v11.reporting;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter7
    extends XmlAdapter<String, Collection<CampaignStatusReportFilter>>
{


    public Collection<CampaignStatusReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.v11.reporting.CampaignStatusReportFilterConverter.convertToList(value));
    }

    public String marshal(Collection<CampaignStatusReportFilter> value) {
        return (com.microsoft.bingads.v11.reporting.CampaignStatusReportFilterConverter.convertToString(value));
    }

}
