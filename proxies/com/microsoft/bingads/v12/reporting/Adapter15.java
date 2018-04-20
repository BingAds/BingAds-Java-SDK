
package com.microsoft.bingads.v12.reporting;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter15
    extends XmlAdapter<String, Collection<AdDistributionReportFilter>>
{


    public Collection<AdDistributionReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.v12.reporting.AdDistributionReportFilterConverter.convertToList(value));
    }

    public String marshal(Collection<AdDistributionReportFilter> value) {
        return (com.microsoft.bingads.v12.reporting.AdDistributionReportFilterConverter.convertToString(value));
    }

}
