
package com.microsoft.bingads.reporting;

import java.util.List;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter5
    extends XmlAdapter<String, List<AdTypeReportFilter>>
{


    public List<AdTypeReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.reporting.AdTypeReportFilterConverter.convertToList(value));
    }

    public String marshal(List<AdTypeReportFilter> value) {
        return (com.microsoft.bingads.reporting.AdTypeReportFilterConverter.convertToString(value));
    }

}
