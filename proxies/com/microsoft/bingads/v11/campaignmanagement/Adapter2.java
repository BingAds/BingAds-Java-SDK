
package com.microsoft.bingads.v11.campaignmanagement;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, Collection<AdGroupAdditionalField>>
{


    public Collection<AdGroupAdditionalField> unmarshal(String value) {
        return (com.microsoft.bingads.v11.campaignmanagement.AdGroupAdditionalFieldConverter.convertToList(value));
    }

    public String marshal(Collection<AdGroupAdditionalField> value) {
        return (com.microsoft.bingads.v11.campaignmanagement.AdGroupAdditionalFieldConverter.convertToString(value));
    }

}
