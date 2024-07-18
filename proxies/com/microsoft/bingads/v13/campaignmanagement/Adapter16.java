
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter16
    extends XmlAdapter<String, Collection<BMCStoreAdditionalField>>
{


    public Collection<BMCStoreAdditionalField> unmarshal(String value) {
        return (com.microsoft.bingads.v13.campaignmanagement.BMCStoreAdditionalFieldConverter.convertToList(value));
    }

    public String marshal(Collection<BMCStoreAdditionalField> value) {
        return (com.microsoft.bingads.v13.campaignmanagement.BMCStoreAdditionalFieldConverter.convertToString(value));
    }

}
