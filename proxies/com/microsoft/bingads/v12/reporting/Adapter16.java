
package com.microsoft.bingads.v12.reporting;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter16
    extends XmlAdapter<String, Collection<KeywordStatusReportFilter>>
{


    public Collection<KeywordStatusReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.v12.reporting.KeywordStatusReportFilterConverter.convertToList(value));
    }

    public String marshal(Collection<KeywordStatusReportFilter> value) {
        return (com.microsoft.bingads.v12.reporting.KeywordStatusReportFilterConverter.convertToString(value));
    }

}
