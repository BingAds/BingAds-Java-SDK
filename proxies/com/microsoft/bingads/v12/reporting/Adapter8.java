
package com.microsoft.bingads.v12.reporting;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter8
    extends XmlAdapter<String, Collection<AdStatusReportFilter>>
{


    public Collection<AdStatusReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.v12.reporting.AdStatusReportFilterConverter.convertToList(value));
    }

    public String marshal(Collection<AdStatusReportFilter> value) {
        return (com.microsoft.bingads.v12.reporting.AdStatusReportFilterConverter.convertToString(value));
    }

}
