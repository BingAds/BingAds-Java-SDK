
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter19
    extends XmlAdapter<String, Collection<AssetGroupAdditionalField>>
{


    public Collection<AssetGroupAdditionalField> unmarshal(String value) {
        return (com.microsoft.bingads.v13.campaignmanagement.AssetGroupAdditionalFieldConverter.convertToList(value));
    }

    public String marshal(Collection<AssetGroupAdditionalField> value) {
        return (com.microsoft.bingads.v13.campaignmanagement.AssetGroupAdditionalFieldConverter.convertToString(value));
    }

}
