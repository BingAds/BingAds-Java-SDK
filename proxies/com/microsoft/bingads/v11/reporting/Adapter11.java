
package com.microsoft.bingads.v11.reporting;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter11
    extends XmlAdapter<String, Collection<DeviceTypeReportFilter>>
{


    public Collection<DeviceTypeReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.v11.reporting.DeviceTypeReportFilterConverter.convertToList(value));
    }

    public String marshal(Collection<DeviceTypeReportFilter> value) {
        return (com.microsoft.bingads.v11.reporting.DeviceTypeReportFilterConverter.convertToString(value));
    }

}
