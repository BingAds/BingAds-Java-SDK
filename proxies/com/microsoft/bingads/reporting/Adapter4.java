
package com.microsoft.bingads.reporting;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter4
    extends XmlAdapter<String, Collection<BidStrategyTypeReportFilter>>
{


    public Collection<BidStrategyTypeReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.reporting.BidStrategyTypeReportFilterConverter.convertToList(value));
    }

    public String marshal(Collection<BidStrategyTypeReportFilter> value) {
        return (com.microsoft.bingads.reporting.BidStrategyTypeReportFilterConverter.convertToString(value));
    }

}
