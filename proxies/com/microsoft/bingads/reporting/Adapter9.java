
package com.microsoft.bingads.reporting;

import java.util.List;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter9
    extends XmlAdapter<String, List<AdStatusReportFilter>>
{


    public List<AdStatusReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.reporting.AdStatusReportFilterConverter.convertToList(value));
    }

    public String marshal(List<AdStatusReportFilter> value) {
        return (com.microsoft.bingads.reporting.AdStatusReportFilterConverter.convertToString(value));
    }

}
