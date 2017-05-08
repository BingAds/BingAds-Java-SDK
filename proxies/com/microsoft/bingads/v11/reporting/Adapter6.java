
package com.microsoft.bingads.v11.reporting;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter6
    extends XmlAdapter<String, Collection<DeviceOSReportFilter>>
{


    public Collection<DeviceOSReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.v11.reporting.DeviceOSReportFilterConverter.convertToList(value));
    }

    public String marshal(Collection<DeviceOSReportFilter> value) {
        return (com.microsoft.bingads.v11.reporting.DeviceOSReportFilterConverter.convertToString(value));
    }

}
