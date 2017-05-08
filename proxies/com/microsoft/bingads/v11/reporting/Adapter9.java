
package com.microsoft.bingads.v11.reporting;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter9
    extends XmlAdapter<String, Collection<BidStrategyTypeReportFilter>>
{


    public Collection<BidStrategyTypeReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.v11.reporting.BidStrategyTypeReportFilterConverter.convertToList(value));
    }

    public String marshal(Collection<BidStrategyTypeReportFilter> value) {
        return (com.microsoft.bingads.v11.reporting.BidStrategyTypeReportFilterConverter.convertToString(value));
    }

}
