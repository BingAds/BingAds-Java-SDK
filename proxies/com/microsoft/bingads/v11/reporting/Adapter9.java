
package com.microsoft.bingads.v11.reporting;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter9
    extends XmlAdapter<String, Collection<DynamicAdTargetStatusReportFilter>>
{


    public Collection<DynamicAdTargetStatusReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.v11.reporting.DynamicAdTargetStatusReportFilterConverter.convertToList(value));
    }

    public String marshal(Collection<DynamicAdTargetStatusReportFilter> value) {
        return (com.microsoft.bingads.v11.reporting.DynamicAdTargetStatusReportFilterConverter.convertToString(value));
    }

}
