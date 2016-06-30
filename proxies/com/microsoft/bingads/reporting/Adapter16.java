
package com.microsoft.bingads.reporting;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter16
    extends XmlAdapter<String, Collection<AdGroupStatusReportFilter>>
{


    public Collection<AdGroupStatusReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.reporting.AdGroupStatusReportFilterConverter.convertToList(value));
    }

    public String marshal(Collection<AdGroupStatusReportFilter> value) {
        return (com.microsoft.bingads.reporting.AdGroupStatusReportFilterConverter.convertToString(value));
    }

}
