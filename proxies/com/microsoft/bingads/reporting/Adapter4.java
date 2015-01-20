
package com.microsoft.bingads.reporting;

import java.util.List;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter4
    extends XmlAdapter<String, List<ChangeEntityReportFilter>>
{


    public List<ChangeEntityReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.reporting.ChangeEntityReportFilterConverter.convertToList(value));
    }

    public String marshal(List<ChangeEntityReportFilter> value) {
        return (com.microsoft.bingads.reporting.ChangeEntityReportFilterConverter.convertToString(value));
    }

}
