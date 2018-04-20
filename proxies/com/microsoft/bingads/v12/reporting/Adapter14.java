
package com.microsoft.bingads.v12.reporting;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter14
    extends XmlAdapter<String, Collection<AdGroupStatusReportFilter>>
{


    public Collection<AdGroupStatusReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.v12.reporting.AdGroupStatusReportFilterConverter.convertToList(value));
    }

    public String marshal(Collection<AdGroupStatusReportFilter> value) {
        return (com.microsoft.bingads.v12.reporting.AdGroupStatusReportFilterConverter.convertToString(value));
    }

}
