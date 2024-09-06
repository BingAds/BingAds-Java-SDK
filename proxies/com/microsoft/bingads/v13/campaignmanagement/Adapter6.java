
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter6
    extends XmlAdapter<String, Collection<CampaignAdditionalField>>
{


    public Collection<CampaignAdditionalField> unmarshal(String value) {
        return (com.microsoft.bingads.v13.campaignmanagement.CampaignAdditionalFieldConverter.convertToList(value));
    }

    public String marshal(Collection<CampaignAdditionalField> value) {
        return (com.microsoft.bingads.v13.campaignmanagement.CampaignAdditionalFieldConverter.convertToString(value));
    }

}
