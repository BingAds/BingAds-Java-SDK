
package com.microsoft.bingads.v13.customerbilling;

import java.util.Collection;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, Collection<InsertionOrderAdditionalField>>
{


    public Collection<InsertionOrderAdditionalField> unmarshal(String value) {
        return (com.microsoft.bingads.v13.customerbilling.InsertionOrderAdditionalFieldConverter.convertToList(value));
    }

    public String marshal(Collection<InsertionOrderAdditionalField> value) {
        return (com.microsoft.bingads.v13.customerbilling.InsertionOrderAdditionalFieldConverter.convertToString(value));
    }

}
