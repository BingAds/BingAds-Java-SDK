
package com.microsoft.bingads.reporting;

import java.util.List;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter15
    extends XmlAdapter<String, List<AdDistributionReportFilter>>
{


    public List<AdDistributionReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.reporting.AdDistributionReportFilterConverter.convertToList(value));
    }

    public String marshal(List<AdDistributionReportFilter> value) {
        return (com.microsoft.bingads.reporting.AdDistributionReportFilterConverter.convertToString(value));
    }

}
