
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter17
    extends XmlAdapter<String, Collection<AudienceAdditionalField>>
{


    public Collection<AudienceAdditionalField> unmarshal(String value) {
        return (com.microsoft.bingads.v13.campaignmanagement.AudienceAdditionalFieldConverter.convertToList(value));
    }

    public String marshal(Collection<AudienceAdditionalField> value) {
        return (com.microsoft.bingads.v13.campaignmanagement.AudienceAdditionalFieldConverter.convertToString(value));
    }

}
