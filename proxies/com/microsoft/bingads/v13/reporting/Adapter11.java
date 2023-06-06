
package com.microsoft.bingads.v13.reporting;

import java.util.Collection;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter11
    extends XmlAdapter<String, Collection<LanguageReportFilter>>
{


    public Collection<LanguageReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.v13.reporting.LanguageReportFilterConverter.convertToList(value));
    }

    public String marshal(Collection<LanguageReportFilter> value) {
        return (com.microsoft.bingads.v13.reporting.LanguageReportFilterConverter.convertToString(value));
    }

}
