
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter12
    extends XmlAdapter<String, Collection<MediaEnabledEntityFilter>>
{


    public Collection<MediaEnabledEntityFilter> unmarshal(String value) {
        return (com.microsoft.bingads.v13.campaignmanagement.MediaEnabledEntityFilterConverter.convertToList(value));
    }

    public String marshal(Collection<MediaEnabledEntityFilter> value) {
        return (com.microsoft.bingads.v13.campaignmanagement.MediaEnabledEntityFilterConverter.convertToString(value));
    }

}
