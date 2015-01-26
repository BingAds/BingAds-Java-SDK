
package com.microsoft.bingads.campaignmanagement;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, Collection<CampaignType>>
{


    public Collection<CampaignType> unmarshal(String value) {
        return (com.microsoft.bingads.campaignmanagement.CampaignTypeConverter.convertToList(value));
    }

    public String marshal(Collection<CampaignType> value) {
        return (com.microsoft.bingads.campaignmanagement.CampaignTypeConverter.convertToString(value));
    }

}
