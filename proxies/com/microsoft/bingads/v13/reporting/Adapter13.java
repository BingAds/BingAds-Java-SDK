
package com.microsoft.bingads.v13.reporting;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter13
    extends XmlAdapter<String, Collection<ChangeTypeReportFilter>>
{


    public Collection<ChangeTypeReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.v13.reporting.ChangeTypeReportFilterConverter.convertToList(value));
    }

    public String marshal(Collection<ChangeTypeReportFilter> value) {
        return (com.microsoft.bingads.v13.reporting.ChangeTypeReportFilterConverter.convertToString(value));
    }

}
