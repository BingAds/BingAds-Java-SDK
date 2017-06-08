
package com.microsoft.bingads.v11.reporting;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter12
    extends XmlAdapter<String, Collection<ChangeTypeReportFilter>>
{


    public Collection<ChangeTypeReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.v11.reporting.ChangeTypeReportFilterConverter.convertToList(value));
    }

    public String marshal(Collection<ChangeTypeReportFilter> value) {
        return (com.microsoft.bingads.v11.reporting.ChangeTypeReportFilterConverter.convertToString(value));
    }

}
