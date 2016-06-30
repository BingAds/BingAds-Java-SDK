
package com.microsoft.bingads.reporting;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter13
    extends XmlAdapter<String, Collection<DeviceTypeReportFilter>>
{


    public Collection<DeviceTypeReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.reporting.DeviceTypeReportFilterConverter.convertToList(value));
    }

    public String marshal(Collection<DeviceTypeReportFilter> value) {
        return (com.microsoft.bingads.reporting.DeviceTypeReportFilterConverter.convertToString(value));
    }

}
