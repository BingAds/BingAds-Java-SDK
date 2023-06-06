
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter5
    extends XmlAdapter<String, Collection<CampaignType>>
{


    public Collection<CampaignType> unmarshal(String value) {
        return (com.microsoft.bingads.v13.campaignmanagement.CampaignTypeConverter.convertToList(value));
    }

    public String marshal(Collection<CampaignType> value) {
        return (com.microsoft.bingads.v13.campaignmanagement.CampaignTypeConverter.convertToString(value));
    }

}
