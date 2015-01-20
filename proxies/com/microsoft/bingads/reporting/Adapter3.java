
package com.microsoft.bingads.reporting;

import java.util.List;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter3
    extends XmlAdapter<String, List<PricingModelReportFilter>>
{


    public List<PricingModelReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.reporting.PricingModelReportFilterConverter.convertToList(value));
    }

    public String marshal(List<PricingModelReportFilter> value) {
        return (com.microsoft.bingads.reporting.PricingModelReportFilterConverter.convertToString(value));
    }

}
