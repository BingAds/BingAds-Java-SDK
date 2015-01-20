
package com.microsoft.bingads.reporting;

import java.util.List;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, List<BidMatchTypeReportFilter>>
{


    public List<BidMatchTypeReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.reporting.BidMatchTypeReportFilterConverter.convertToList(value));
    }

    public String marshal(List<BidMatchTypeReportFilter> value) {
        return (com.microsoft.bingads.reporting.BidMatchTypeReportFilterConverter.convertToString(value));
    }

}
