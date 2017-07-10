
package com.microsoft.bingads.reporting;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter3
    extends XmlAdapter<String, Collection<AdStatusReportFilter>>
{


    public Collection<AdStatusReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.reporting.AdStatusReportFilterConverter.convertToList(value));
    }

    public String marshal(Collection<AdStatusReportFilter> value) {
        return (com.microsoft.bingads.reporting.AdStatusReportFilterConverter.convertToString(value));
    }

}
