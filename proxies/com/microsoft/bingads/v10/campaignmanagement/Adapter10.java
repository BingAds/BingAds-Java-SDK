
package com.microsoft.bingads.v10.campaignmanagement;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter10
    extends XmlAdapter<String, Collection<AdDistribution>>
{


    public Collection<AdDistribution> unmarshal(String value) {
        return (com.microsoft.bingads.v10.campaignmanagement.AdDistributionConverter.convertToList(value));
    }

    public String marshal(Collection<AdDistribution> value) {
        return (com.microsoft.bingads.v10.campaignmanagement.AdDistributionConverter.convertToString(value));
    }

}
