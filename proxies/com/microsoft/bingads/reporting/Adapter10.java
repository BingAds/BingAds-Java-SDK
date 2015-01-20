
package com.microsoft.bingads.reporting;

import java.util.List;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter10
    extends XmlAdapter<String, List<RichAdSubTypeFilter>>
{


    public List<RichAdSubTypeFilter> unmarshal(String value) {
        return (com.microsoft.bingads.reporting.RichAdSubTypeFilterConverter.convertToList(value));
    }

    public String marshal(List<RichAdSubTypeFilter> value) {
        return (com.microsoft.bingads.reporting.RichAdSubTypeFilterConverter.convertToString(value));
    }

}
