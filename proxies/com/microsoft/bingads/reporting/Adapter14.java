
package com.microsoft.bingads.reporting;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter14
    extends XmlAdapter<String, Collection<ChangeTypeReportFilter>>
{


    public Collection<ChangeTypeReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.reporting.ChangeTypeReportFilterConverter.convertToList(value));
    }

    public String marshal(Collection<ChangeTypeReportFilter> value) {
        return (com.microsoft.bingads.reporting.ChangeTypeReportFilterConverter.convertToString(value));
    }

}
