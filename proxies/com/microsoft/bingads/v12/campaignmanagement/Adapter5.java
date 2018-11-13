
package com.microsoft.bingads.v12.campaignmanagement;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter5
    extends XmlAdapter<String, Collection<AdExtensionsTypeFilter>>
{


    public Collection<AdExtensionsTypeFilter> unmarshal(String value) {
        return (com.microsoft.bingads.v12.campaignmanagement.AdExtensionsTypeFilterConverter.convertToList(value));
    }

    public String marshal(Collection<AdExtensionsTypeFilter> value) {
        return (com.microsoft.bingads.v12.campaignmanagement.AdExtensionsTypeFilterConverter.convertToString(value));
    }

}
