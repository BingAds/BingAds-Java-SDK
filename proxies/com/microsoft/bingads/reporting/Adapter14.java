
package com.microsoft.bingads.reporting;

import java.util.List;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter14
    extends XmlAdapter<String, List<AdGroupStatusReportFilter>>
{


    public List<AdGroupStatusReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.reporting.AdGroupStatusReportFilterConverter.convertToList(value));
    }

    public String marshal(List<AdGroupStatusReportFilter> value) {
        return (com.microsoft.bingads.reporting.AdGroupStatusReportFilterConverter.convertToString(value));
    }

}
