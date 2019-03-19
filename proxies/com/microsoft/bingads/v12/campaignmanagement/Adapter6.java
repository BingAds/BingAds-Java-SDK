
package com.microsoft.bingads.v12.campaignmanagement;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter6
    extends XmlAdapter<String, Collection<AdGroupCriterionAdditionalField>>
{


    public Collection<AdGroupCriterionAdditionalField> unmarshal(String value) {
        return (com.microsoft.bingads.v12.campaignmanagement.AdGroupCriterionAdditionalFieldConverter.convertToList(value));
    }

    public String marshal(Collection<AdGroupCriterionAdditionalField> value) {
        return (com.microsoft.bingads.v12.campaignmanagement.AdGroupCriterionAdditionalFieldConverter.convertToString(value));
    }

}
