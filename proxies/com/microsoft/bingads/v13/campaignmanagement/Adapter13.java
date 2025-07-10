
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter13
    extends XmlAdapter<String, Collection<MediaAdditionalField>>
{


    public Collection<MediaAdditionalField> unmarshal(String value) {
        return (com.microsoft.bingads.v13.campaignmanagement.MediaAdditionalFieldConverter.convertToList(value));
    }

    public String marshal(Collection<MediaAdditionalField> value) {
        return (com.microsoft.bingads.v13.campaignmanagement.MediaAdditionalFieldConverter.convertToString(value));
    }

}
