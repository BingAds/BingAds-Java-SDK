
package com.microsoft.bingads.v12.campaignmanagement;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter11
    extends XmlAdapter<String, Collection<AdAdditionalField>>
{


    public Collection<AdAdditionalField> unmarshal(String value) {
        return (com.microsoft.bingads.v12.campaignmanagement.AdAdditionalFieldConverter.convertToList(value));
    }

    public String marshal(Collection<AdAdditionalField> value) {
        return (com.microsoft.bingads.v12.campaignmanagement.AdAdditionalFieldConverter.convertToString(value));
    }

}
