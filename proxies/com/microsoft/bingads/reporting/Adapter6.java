
package com.microsoft.bingads.reporting;

import java.util.List;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter6
    extends XmlAdapter<String, List<DeviceOSReportFilter>>
{


    public List<DeviceOSReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.reporting.DeviceOSReportFilterConverter.convertToList(value));
    }

    public String marshal(List<DeviceOSReportFilter> value) {
        return (com.microsoft.bingads.reporting.DeviceOSReportFilterConverter.convertToString(value));
    }

}
