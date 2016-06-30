
package com.microsoft.bingads.reporting;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter17
    extends XmlAdapter<String, Collection<AdDistributionReportFilter>>
{


    public Collection<AdDistributionReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.reporting.AdDistributionReportFilterConverter.convertToList(value));
    }

    public String marshal(Collection<AdDistributionReportFilter> value) {
        return (com.microsoft.bingads.reporting.AdDistributionReportFilterConverter.convertToString(value));
    }

}
