
package com.microsoft.bingads.v11.reporting;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter5
    extends XmlAdapter<String, Collection<AdTypeReportFilter>>
{


    public Collection<AdTypeReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.v11.reporting.AdTypeReportFilterConverter.convertToList(value));
    }

    public String marshal(Collection<AdTypeReportFilter> value) {
        return (com.microsoft.bingads.v11.reporting.AdTypeReportFilterConverter.convertToString(value));
    }

}
