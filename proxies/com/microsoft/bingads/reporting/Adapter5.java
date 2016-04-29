
package com.microsoft.bingads.reporting;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter5
    extends XmlAdapter<String, Collection<ChangeEntityReportFilter>>
{


    public Collection<ChangeEntityReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.reporting.ChangeEntityReportFilterConverter.convertToList(value));
    }

    public String marshal(Collection<ChangeEntityReportFilter> value) {
        return (com.microsoft.bingads.reporting.ChangeEntityReportFilterConverter.convertToString(value));
    }

}
