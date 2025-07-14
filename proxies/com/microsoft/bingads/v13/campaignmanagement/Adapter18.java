
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter18
    extends XmlAdapter<String, Collection<AssetGroupListingGroupAdditionalField>>
{


    public Collection<AssetGroupListingGroupAdditionalField> unmarshal(String value) {
        return (com.microsoft.bingads.v13.campaignmanagement.AssetGroupListingGroupAdditionalFieldConverter.convertToList(value));
    }

    public String marshal(Collection<AssetGroupListingGroupAdditionalField> value) {
        return (com.microsoft.bingads.v13.campaignmanagement.AssetGroupListingGroupAdditionalFieldConverter.convertToString(value));
    }

}
