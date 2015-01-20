
package com.microsoft.bingads.campaignmanagement;

import java.util.List;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter5
    extends XmlAdapter<String, List<AdDistribution>>
{


    public List<AdDistribution> unmarshal(String value) {
        return (com.microsoft.bingads.campaignmanagement.AdDistributionConverter.convertToList(value));
    }

    public String marshal(List<AdDistribution> value) {
        return (com.microsoft.bingads.campaignmanagement.AdDistributionConverter.convertToString(value));
    }

}
