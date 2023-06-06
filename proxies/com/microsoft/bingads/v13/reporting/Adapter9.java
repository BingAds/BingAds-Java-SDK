
package com.microsoft.bingads.v13.reporting;

import java.util.Collection;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter9
    extends XmlAdapter<String, Collection<AdTypeReportFilter>>
{


    public Collection<AdTypeReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.v13.reporting.AdTypeReportFilterConverter.convertToList(value));
    }

    public String marshal(Collection<AdTypeReportFilter> value) {
        return (com.microsoft.bingads.v13.reporting.AdTypeReportFilterConverter.convertToString(value));
    }

}
