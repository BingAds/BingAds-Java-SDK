
package com.microsoft.bingads.reporting;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter8
    extends XmlAdapter<String, Collection<ComponentTypeFilter>>
{


    public Collection<ComponentTypeFilter> unmarshal(String value) {
        return (com.microsoft.bingads.reporting.ComponentTypeFilterConverter.convertToList(value));
    }

    public String marshal(Collection<ComponentTypeFilter> value) {
        return (com.microsoft.bingads.reporting.ComponentTypeFilterConverter.convertToString(value));
    }

}
