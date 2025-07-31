
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter27
    extends XmlAdapter<String, Collection<ConversionGoalType>>
{


    public Collection<ConversionGoalType> unmarshal(String value) {
        return (com.microsoft.bingads.v13.campaignmanagement.ConversionGoalTypeConverter.convertToList(value));
    }

    public String marshal(Collection<ConversionGoalType> value) {
        return (com.microsoft.bingads.v13.campaignmanagement.ConversionGoalTypeConverter.convertToString(value));
    }

}
