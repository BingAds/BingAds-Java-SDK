
package com.microsoft.bingads.reporting;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, Collection<BidMatchTypeReportFilter>>
{


    public Collection<BidMatchTypeReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.reporting.BidMatchTypeReportFilterConverter.convertToList(value));
    }

    public String marshal(Collection<BidMatchTypeReportFilter> value) {
        return (com.microsoft.bingads.reporting.BidMatchTypeReportFilterConverter.convertToString(value));
    }

}
