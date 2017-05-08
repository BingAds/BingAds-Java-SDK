
package com.microsoft.bingads.v11.reporting;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, Collection<AccountStatusReportFilter>>
{


    public Collection<AccountStatusReportFilter> unmarshal(String value) {
        return (com.microsoft.bingads.v11.reporting.AccountStatusReportFilterConverter.convertToList(value));
    }

    public String marshal(Collection<AccountStatusReportFilter> value) {
        return (com.microsoft.bingads.v11.reporting.AccountStatusReportFilterConverter.convertToString(value));
    }

}
