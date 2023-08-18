
package com.microsoft.bingads.v13.reporting;

import java.util.Collection;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter15
    extends XmlAdapter<String, Collection<AssetGroupStatusReportFilter>>
{


    public Collection<AssetGroupStatusReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.v13.reporting.AssetGroupStatusReportFilterConverter.convertToList(value));
    }

    public String marshal(Collection<AssetGroupStatusReportFilter> value) {
        return (com.microsoft.bingads.v13.reporting.AssetGroupStatusReportFilterConverter.convertToString(value));
    }

}
