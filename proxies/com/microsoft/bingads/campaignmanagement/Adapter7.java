
package com.microsoft.bingads.campaignmanagement;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter7
    extends XmlAdapter<String, Collection<AdDistribution>>
{


    public Collection<AdDistribution> unmarshal(String value) {
        return (com.microsoft.bingads.campaignmanagement.AdDistributionConverter.convertToList(value));
    }

    public String marshal(Collection<AdDistribution> value) {
        return (com.microsoft.bingads.campaignmanagement.AdDistributionConverter.convertToString(value));
    }

}
