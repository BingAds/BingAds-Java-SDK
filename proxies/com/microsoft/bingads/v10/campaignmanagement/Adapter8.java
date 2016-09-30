
package com.microsoft.bingads.v10.campaignmanagement;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter8
    extends XmlAdapter<String, Collection<AdExtensionAdditionalField>>
{


    public Collection<AdExtensionAdditionalField> unmarshal(String value) {
        return (com.microsoft.bingads.v10.campaignmanagement.AdExtensionAdditionalFieldConverter.convertToList(value));
    }

    public String marshal(Collection<AdExtensionAdditionalField> value) {
        return (com.microsoft.bingads.v10.campaignmanagement.AdExtensionAdditionalFieldConverter.convertToString(value));
    }

}
