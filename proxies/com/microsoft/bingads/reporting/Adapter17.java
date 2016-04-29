
package com.microsoft.bingads.reporting;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter17
    extends XmlAdapter<String, Collection<KeywordStatusReportFilter>>
{


    public Collection<KeywordStatusReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.reporting.KeywordStatusReportFilterConverter.convertToList(value));
    }

    public String marshal(Collection<KeywordStatusReportFilter> value) {
        return (com.microsoft.bingads.reporting.KeywordStatusReportFilterConverter.convertToString(value));
    }

}
