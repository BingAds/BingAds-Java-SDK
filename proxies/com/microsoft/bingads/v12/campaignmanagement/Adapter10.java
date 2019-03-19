
package com.microsoft.bingads.v12.campaignmanagement;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter10
    extends XmlAdapter<String, Collection<AudienceType>>
{


    public Collection<AudienceType> unmarshal(String value) {
        return (com.microsoft.bingads.v12.campaignmanagement.AudienceTypeConverter.convertToList(value));
    }

    public String marshal(Collection<AudienceType> value) {
        return (com.microsoft.bingads.v12.campaignmanagement.AudienceTypeConverter.convertToString(value));
    }

}
