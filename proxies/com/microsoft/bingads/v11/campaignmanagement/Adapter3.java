
package com.microsoft.bingads.v11.campaignmanagement;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter3
    extends XmlAdapter<String, Collection<CampaignCriterionType>>
{


    public Collection<CampaignCriterionType> unmarshal(String value) {
        return (com.microsoft.bingads.v11.campaignmanagement.CampaignCriterionTypeConverter.convertToList(value));
    }

    public String marshal(Collection<CampaignCriterionType> value) {
        return (com.microsoft.bingads.v11.campaignmanagement.CampaignCriterionTypeConverter.convertToString(value));
    }

}
