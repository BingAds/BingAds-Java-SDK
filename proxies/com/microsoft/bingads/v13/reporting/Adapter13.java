
package com.microsoft.bingads.v13.reporting;

import java.util.Collection;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter13
    extends XmlAdapter<String, Collection<BidStrategyTypeReportFilter>>
{


    public Collection<BidStrategyTypeReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.v13.reporting.BidStrategyTypeReportFilterConverter.convertToList(value));
    }

    public String marshal(Collection<BidStrategyTypeReportFilter> value) {
        return (com.microsoft.bingads.v13.reporting.BidStrategyTypeReportFilterConverter.convertToString(value));
    }

}
