
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter7
    extends XmlAdapter<String, Collection<AdGroupAdditionalField>>
{


    public Collection<AdGroupAdditionalField> unmarshal(String value) {
        return (com.microsoft.bingads.v13.campaignmanagement.AdGroupAdditionalFieldConverter.convertToList(value));
    }

    public String marshal(Collection<AdGroupAdditionalField> value) {
        return (com.microsoft.bingads.v13.campaignmanagement.AdGroupAdditionalFieldConverter.convertToString(value));
    }

}
