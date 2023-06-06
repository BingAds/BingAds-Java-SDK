
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter13
    extends XmlAdapter<String, Collection<AdGroupCriterionType>>
{


    public Collection<AdGroupCriterionType> unmarshal(String value) {
        return (com.microsoft.bingads.v13.campaignmanagement.AdGroupCriterionTypeConverter.convertToList(value));
    }

    public String marshal(Collection<AdGroupCriterionType> value) {
        return (com.microsoft.bingads.v13.campaignmanagement.AdGroupCriterionTypeConverter.convertToString(value));
    }

}
