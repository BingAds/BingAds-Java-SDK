
package com.microsoft.bingads.v13.reporting;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter4
    extends XmlAdapter<String, Collection<ChangeEntityReportFilter>>
{


    public Collection<ChangeEntityReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.v13.reporting.ChangeEntityReportFilterConverter.convertToList(value));
    }

    public String marshal(Collection<ChangeEntityReportFilter> value) {
        return (com.microsoft.bingads.v13.reporting.ChangeEntityReportFilterConverter.convertToString(value));
    }

}
