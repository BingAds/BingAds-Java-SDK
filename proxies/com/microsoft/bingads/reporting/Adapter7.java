
package com.microsoft.bingads.reporting;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter7
    extends XmlAdapter<String, Collection<AccountStatusReportFilter>>
{


    public Collection<AccountStatusReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.reporting.AccountStatusReportFilterConverter.convertToList(value));
    }

    public String marshal(Collection<AccountStatusReportFilter> value) {
        return (com.microsoft.bingads.reporting.AccountStatusReportFilterConverter.convertToString(value));
    }

}
