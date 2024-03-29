
package com.microsoft.bingads.v13.reporting;

import java.util.Collection;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter12
    extends XmlAdapter<String, Collection<BidMatchTypeReportFilter>>
{


    public Collection<BidMatchTypeReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.v13.reporting.BidMatchTypeReportFilterConverter.convertToList(value));
    }

    public String marshal(Collection<BidMatchTypeReportFilter> value) {
        return (com.microsoft.bingads.v13.reporting.BidMatchTypeReportFilterConverter.convertToString(value));
    }

}
