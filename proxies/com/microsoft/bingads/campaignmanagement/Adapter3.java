
package com.microsoft.bingads.campaignmanagement;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter3
    extends XmlAdapter<String, Collection<AdExtensionsTypeFilter>>
{


    public Collection<AdExtensionsTypeFilter> unmarshal(String value) {
        return (com.microsoft.bingads.campaignmanagement.AdExtensionsTypeFilterConverter.convertToList(value));
    }

    public String marshal(Collection<AdExtensionsTypeFilter> value) {
        return (com.microsoft.bingads.campaignmanagement.AdExtensionsTypeFilterConverter.convertToString(value));
    }

}
