
package com.microsoft.bingads.v13.reporting;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter15
    extends XmlAdapter<String, Collection<AdGroupStatusReportFilter>>
{


    public Collection<AdGroupStatusReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.v13.reporting.AdGroupStatusReportFilterConverter.convertToList(value));
    }

    public String marshal(Collection<AdGroupStatusReportFilter> value) {
        return (com.microsoft.bingads.v13.reporting.AdGroupStatusReportFilterConverter.convertToString(value));
    }

}
