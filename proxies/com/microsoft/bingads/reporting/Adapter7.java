
package com.microsoft.bingads.reporting;

import java.util.List;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter7
    extends XmlAdapter<String, List<ComponentTypeFilter>>
{


    public List<ComponentTypeFilter> unmarshal(String value) {
        return (com.microsoft.bingads.reporting.ComponentTypeFilterConverter.convertToList(value));
    }

    public String marshal(List<ComponentTypeFilter> value) {
        return (com.microsoft.bingads.reporting.ComponentTypeFilterConverter.convertToString(value));
    }

}
