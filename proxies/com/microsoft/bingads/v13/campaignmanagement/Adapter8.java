
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter8
    extends XmlAdapter<String, Collection<AdExtensionsTypeFilter>>
{


    public Collection<AdExtensionsTypeFilter> unmarshal(String value) {
        return (com.microsoft.bingads.v13.campaignmanagement.AdExtensionsTypeFilterConverter.convertToList(value));
    }

    public String marshal(Collection<AdExtensionsTypeFilter> value) {
        return (com.microsoft.bingads.v13.campaignmanagement.AdExtensionsTypeFilterConverter.convertToString(value));
    }

}
