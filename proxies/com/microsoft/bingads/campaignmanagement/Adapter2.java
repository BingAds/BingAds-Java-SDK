
package com.microsoft.bingads.campaignmanagement;

import java.util.List;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, List<AdExtensionsTypeFilter>>
{


    public List<AdExtensionsTypeFilter> unmarshal(String value) {
        return (com.microsoft.bingads.campaignmanagement.AdExtensionsTypeFilterConverter.convertToList(value));
    }

    public String marshal(List<AdExtensionsTypeFilter> value) {
        return (com.microsoft.bingads.campaignmanagement.AdExtensionsTypeFilterConverter.convertToString(value));
    }

}
