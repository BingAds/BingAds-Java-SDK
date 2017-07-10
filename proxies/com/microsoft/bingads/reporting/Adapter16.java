
package com.microsoft.bingads.reporting;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter16
    extends XmlAdapter<String, Collection<DeliveredMatchTypeReportFilter>>
{


    public Collection<DeliveredMatchTypeReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.reporting.DeliveredMatchTypeReportFilterConverter.convertToList(value));
    }

    public String marshal(Collection<DeliveredMatchTypeReportFilter> value) {
        return (com.microsoft.bingads.reporting.DeliveredMatchTypeReportFilterConverter.convertToString(value));
    }

}
