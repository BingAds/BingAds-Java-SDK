
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter18
    extends XmlAdapter<String, Collection<AdAdditionalField>>
{


    public Collection<AdAdditionalField> unmarshal(String value) {
        return (com.microsoft.bingads.v13.campaignmanagement.AdAdditionalFieldConverter.convertToList(value));
    }

    public String marshal(Collection<AdAdditionalField> value) {
        return (com.microsoft.bingads.v13.campaignmanagement.AdAdditionalFieldConverter.convertToString(value));
    }

}
