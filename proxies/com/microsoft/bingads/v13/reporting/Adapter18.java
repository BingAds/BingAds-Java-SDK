
package com.microsoft.bingads.v13.reporting;

import java.util.Collection;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter18
    extends XmlAdapter<String, Collection<CampaignTypeReportFilter>>
{


    public Collection<CampaignTypeReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.v13.reporting.CampaignTypeReportFilterConverter.convertToList(value));
    }

    public String marshal(Collection<CampaignTypeReportFilter> value) {
        return (com.microsoft.bingads.v13.reporting.CampaignTypeReportFilterConverter.convertToString(value));
    }

}
