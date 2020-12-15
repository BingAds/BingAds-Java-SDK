
package com.microsoft.bingads.v13.customermanagement;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, Collection<AccountAdditionalField>>
{


    public Collection<AccountAdditionalField> unmarshal(String value) {
        return (com.microsoft.bingads.v13.customermanagement.AccountAdditionalFieldConverter.convertToList(value));
    }

    public String marshal(Collection<AccountAdditionalField> value) {
        return (com.microsoft.bingads.v13.customermanagement.AccountAdditionalFieldConverter.convertToString(value));
    }

}
