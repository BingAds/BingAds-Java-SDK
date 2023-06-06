
package com.microsoft.bingads.v13.reporting;

import java.util.Collection;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter6
    extends XmlAdapter<String, Collection<CampaignStatusReportFilter>>
{


    public Collection<CampaignStatusReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.v13.reporting.CampaignStatusReportFilterConverter.convertToList(value));
    }

    public String marshal(Collection<CampaignStatusReportFilter> value) {
        return (com.microsoft.bingads.v13.reporting.CampaignStatusReportFilterConverter.convertToString(value));
    }

}
