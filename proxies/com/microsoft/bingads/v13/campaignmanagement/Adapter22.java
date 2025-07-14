
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter22
    extends XmlAdapter<String, Collection<AudienceGroupAdditionalField>>
{


    public Collection<AudienceGroupAdditionalField> unmarshal(String value) {
        return (com.microsoft.bingads.v13.campaignmanagement.AudienceGroupAdditionalFieldConverter.convertToList(value));
    }

    public String marshal(Collection<AudienceGroupAdditionalField> value) {
        return (com.microsoft.bingads.v13.campaignmanagement.AudienceGroupAdditionalFieldConverter.convertToString(value));
    }

}
