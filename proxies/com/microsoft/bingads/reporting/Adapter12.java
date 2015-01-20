
package com.microsoft.bingads.reporting;

import java.util.List;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter12
    extends XmlAdapter<String, List<DeviceTypeReportFilter>>
{


    public List<DeviceTypeReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.reporting.DeviceTypeReportFilterConverter.convertToList(value));
    }

    public String marshal(List<DeviceTypeReportFilter> value) {
        return (com.microsoft.bingads.reporting.DeviceTypeReportFilterConverter.convertToString(value));
    }

}
