
package com.microsoft.bingads.bulk;

import java.util.List;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, List<DataScope>>
{


    public List<DataScope> unmarshal(String value) {
        return (com.microsoft.bingads.bulk.DataScopeConverter.convertToList(value));
    }

    public String marshal(List<DataScope> value) {
        return (com.microsoft.bingads.bulk.DataScopeConverter.convertToString(value));
    }

}
