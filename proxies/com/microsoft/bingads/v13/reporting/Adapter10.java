
package com.microsoft.bingads.v13.reporting;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter10
    extends XmlAdapter<String, Collection<DynamicAdTargetStatusReportFilter>>
{


    public Collection<DynamicAdTargetStatusReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.v13.reporting.DynamicAdTargetStatusReportFilterConverter.convertToList(value));
    }

    public String marshal(Collection<DynamicAdTargetStatusReportFilter> value) {
        return (com.microsoft.bingads.v13.reporting.DynamicAdTargetStatusReportFilterConverter.convertToString(value));
    }

}
