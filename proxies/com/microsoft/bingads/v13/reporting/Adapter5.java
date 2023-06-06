
package com.microsoft.bingads.v13.reporting;

import java.util.Collection;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter5
    extends XmlAdapter<String, Collection<DeviceTypeReportFilter>>
{


    public Collection<DeviceTypeReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.v13.reporting.DeviceTypeReportFilterConverter.convertToList(value));
    }

    public String marshal(Collection<DeviceTypeReportFilter> value) {
        return (com.microsoft.bingads.v13.reporting.DeviceTypeReportFilterConverter.convertToString(value));
    }

}
