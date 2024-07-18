
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, Collection<AdSubType>>
{


    public Collection<AdSubType> unmarshal(String value) {
        return (com.microsoft.bingads.v13.campaignmanagement.AdSubTypeConverter.convertToList(value));
    }

    public String marshal(Collection<AdSubType> value) {
        return (com.microsoft.bingads.v13.campaignmanagement.AdSubTypeConverter.convertToString(value));
    }

}
