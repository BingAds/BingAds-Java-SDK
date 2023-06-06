
package com.microsoft.bingads.v13.reporting;

import java.util.Collection;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter10
    extends XmlAdapter<String, Collection<KeywordStatusReportFilter>>
{


    public Collection<KeywordStatusReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.v13.reporting.KeywordStatusReportFilterConverter.convertToList(value));
    }

    public String marshal(Collection<KeywordStatusReportFilter> value) {
        return (com.microsoft.bingads.v13.reporting.KeywordStatusReportFilterConverter.convertToString(value));
    }

}
