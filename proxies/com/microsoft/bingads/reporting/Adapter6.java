
package com.microsoft.bingads.reporting;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter6
    extends XmlAdapter<String, Collection<AdTypeReportFilter>>
{


    public Collection<AdTypeReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.reporting.AdTypeReportFilterConverter.convertToList(value));
    }

    public String marshal(Collection<AdTypeReportFilter> value) {
        return (com.microsoft.bingads.reporting.AdTypeReportFilterConverter.convertToString(value));
    }

}
