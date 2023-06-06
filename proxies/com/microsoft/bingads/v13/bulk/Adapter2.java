
package com.microsoft.bingads.v13.bulk;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, Collection<DataScope>>
{


    public Collection<DataScope> unmarshal(String value) {
        return (com.microsoft.bingads.v13.bulk.DataScopeConverter.convertToList(value));
    }

    public String marshal(Collection<DataScope> value) {
        return (com.microsoft.bingads.v13.bulk.DataScopeConverter.convertToString(value));
    }

}
