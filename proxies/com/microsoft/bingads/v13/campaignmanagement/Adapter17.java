
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter17
    extends XmlAdapter<String, Collection<ProfileType>>
{


    public Collection<ProfileType> unmarshal(String value) {
        return (com.microsoft.bingads.v13.campaignmanagement.ProfileTypeConverter.convertToList(value));
    }

    public String marshal(Collection<ProfileType> value) {
        return (com.microsoft.bingads.v13.campaignmanagement.ProfileTypeConverter.convertToString(value));
    }

}
