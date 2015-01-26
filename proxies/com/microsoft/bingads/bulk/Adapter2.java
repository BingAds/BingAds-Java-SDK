
package com.microsoft.bingads.bulk;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, Collection<DataScope>>
{


    public Collection<DataScope> unmarshal(String value) {
        return (com.microsoft.bingads.bulk.DataScopeConverter.convertToList(value));
    }

    public String marshal(Collection<DataScope> value) {
        return (com.microsoft.bingads.bulk.DataScopeConverter.convertToString(value));
    }

}
