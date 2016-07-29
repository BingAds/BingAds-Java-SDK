
package com.microsoft.bingads.v10.campaignmanagement;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter10
    extends XmlAdapter<String, Collection<ConversionGoalType>>
{


    public Collection<ConversionGoalType> unmarshal(String value) {
        return (com.microsoft.bingads.v10.campaignmanagement.ConversionGoalTypeConverter.convertToList(value));
    }

    public String marshal(Collection<ConversionGoalType> value) {
        return (com.microsoft.bingads.v10.campaignmanagement.ConversionGoalTypeConverter.convertToString(value));
    }

}
