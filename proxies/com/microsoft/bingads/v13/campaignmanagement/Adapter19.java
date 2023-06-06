
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter19
    extends XmlAdapter<String, Collection<ConversionGoalAdditionalField>>
{


    public Collection<ConversionGoalAdditionalField> unmarshal(String value) {
        return (com.microsoft.bingads.v13.campaignmanagement.ConversionGoalAdditionalFieldConverter.convertToList(value));
    }

    public String marshal(Collection<ConversionGoalAdditionalField> value) {
        return (com.microsoft.bingads.v13.campaignmanagement.ConversionGoalAdditionalFieldConverter.convertToString(value));
    }

}
