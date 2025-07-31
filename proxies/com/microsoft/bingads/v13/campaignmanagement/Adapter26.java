
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter26
    extends XmlAdapter<String, Collection<UetTagAdditionalField>>
{


    public Collection<UetTagAdditionalField> unmarshal(String value) {
        return (com.microsoft.bingads.v13.campaignmanagement.UetTagAdditionalFieldConverter.convertToList(value));
    }

    public String marshal(Collection<UetTagAdditionalField> value) {
        return (com.microsoft.bingads.v13.campaignmanagement.UetTagAdditionalFieldConverter.convertToString(value));
    }

}
