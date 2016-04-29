
package com.microsoft.bingads.reporting;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter4
    extends XmlAdapter<String, Collection<PricingModelReportFilter>>
{


    public Collection<PricingModelReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.reporting.PricingModelReportFilterConverter.convertToList(value));
    }

    public String marshal(Collection<PricingModelReportFilter> value) {
        return (com.microsoft.bingads.reporting.PricingModelReportFilterConverter.convertToString(value));
    }

}
