
package com.microsoft.bingads.v13.reporting;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter14
    extends XmlAdapter<String, Collection<DeliveredMatchTypeReportFilter>>
{


    public Collection<DeliveredMatchTypeReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.v13.reporting.DeliveredMatchTypeReportFilterConverter.convertToList(value));
    }

    public String marshal(Collection<DeliveredMatchTypeReportFilter> value) {
        return (com.microsoft.bingads.v13.reporting.DeliveredMatchTypeReportFilterConverter.convertToString(value));
    }

}
