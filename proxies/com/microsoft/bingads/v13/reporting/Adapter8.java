
package com.microsoft.bingads.v13.reporting;

import java.util.Collection;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter8
    extends XmlAdapter<String, Collection<AdStatusReportFilter>>
{


    public Collection<AdStatusReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.v13.reporting.AdStatusReportFilterConverter.convertToList(value));
    }

    public String marshal(Collection<AdStatusReportFilter> value) {
        return (com.microsoft.bingads.v13.reporting.AdStatusReportFilterConverter.convertToString(value));
    }

}
