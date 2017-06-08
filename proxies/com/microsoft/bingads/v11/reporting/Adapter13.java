
package com.microsoft.bingads.v11.reporting;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter13
    extends XmlAdapter<String, Collection<DeliveredMatchTypeReportFilter>>
{


    public Collection<DeliveredMatchTypeReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.v11.reporting.DeliveredMatchTypeReportFilterConverter.convertToList(value));
    }

    public String marshal(Collection<DeliveredMatchTypeReportFilter> value) {
        return (com.microsoft.bingads.v11.reporting.DeliveredMatchTypeReportFilterConverter.convertToString(value));
    }

}
