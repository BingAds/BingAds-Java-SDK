
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter18
    extends XmlAdapter<String, Collection<CampaignCriterionType>>
{


    public Collection<CampaignCriterionType> unmarshal(String value) {
        return (com.microsoft.bingads.v13.campaignmanagement.CampaignCriterionTypeConverter.convertToList(value));
    }

    public String marshal(Collection<CampaignCriterionType> value) {
        return (com.microsoft.bingads.v13.campaignmanagement.CampaignCriterionTypeConverter.convertToString(value));
    }

}
