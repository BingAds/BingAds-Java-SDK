
package com.microsoft.bingads.reporting;

import java.util.List;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter13
    extends XmlAdapter<String, List<DeliveredMatchTypeReportFilter>>
{


    public List<DeliveredMatchTypeReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.reporting.DeliveredMatchTypeReportFilterConverter.convertToList(value));
    }

    public String marshal(List<DeliveredMatchTypeReportFilter> value) {
        return (com.microsoft.bingads.reporting.DeliveredMatchTypeReportFilterConverter.convertToString(value));
    }

}
