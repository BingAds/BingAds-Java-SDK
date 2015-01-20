
package com.microsoft.bingads.reporting;

import java.util.List;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter11
    extends XmlAdapter<String, List<ChangeTypeReportFilter>>
{


    public List<ChangeTypeReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.reporting.ChangeTypeReportFilterConverter.convertToList(value));
    }

    public String marshal(List<ChangeTypeReportFilter> value) {
        return (com.microsoft.bingads.reporting.ChangeTypeReportFilterConverter.convertToString(value));
    }

}
