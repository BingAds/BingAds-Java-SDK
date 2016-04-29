
package com.microsoft.bingads.reporting;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter11
    extends XmlAdapter<String, Collection<RichAdSubTypeFilter>>
{


    public Collection<RichAdSubTypeFilter> unmarshal(String value) {
        return (com.microsoft.bingads.reporting.RichAdSubTypeFilterConverter.convertToList(value));
    }

    public String marshal(Collection<RichAdSubTypeFilter> value) {
        return (com.microsoft.bingads.reporting.RichAdSubTypeFilterConverter.convertToString(value));
    }

}
