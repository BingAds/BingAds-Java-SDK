
package com.microsoft.bingads.v13.reporting;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter16
    extends XmlAdapter<String, Collection<AdDistributionReportFilter>>
{


    public Collection<AdDistributionReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.v13.reporting.AdDistributionReportFilterConverter.convertToList(value));
    }

    public String marshal(Collection<AdDistributionReportFilter> value) {
        return (com.microsoft.bingads.v13.reporting.AdDistributionReportFilterConverter.convertToString(value));
    }

}
