
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter11
    extends XmlAdapter<String, Collection<AdExtensionAdditionalField>>
{


    public Collection<AdExtensionAdditionalField> unmarshal(String value) {
        return (com.microsoft.bingads.v13.campaignmanagement.AdExtensionAdditionalFieldConverter.convertToList(value));
    }

    public String marshal(Collection<AdExtensionAdditionalField> value) {
        return (com.microsoft.bingads.v13.campaignmanagement.AdExtensionAdditionalFieldConverter.convertToString(value));
    }

}
