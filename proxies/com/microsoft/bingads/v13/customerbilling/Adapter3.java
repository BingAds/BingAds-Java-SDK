
package com.microsoft.bingads.v13.customerbilling;

import java.util.Collection;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter3
    extends XmlAdapter<String, Collection<AccountAdditionalField>>
{


    public Collection<AccountAdditionalField> unmarshal(String value) {
        return (com.microsoft.bingads.v13.customerbilling.AccountAdditionalFieldConverter.convertToList(value));
    }

    public String marshal(Collection<AccountAdditionalField> value) {
        return (com.microsoft.bingads.v13.customerbilling.AccountAdditionalFieldConverter.convertToString(value));
    }

}
