
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter21
    extends XmlAdapter<String, Collection<PortfolioBidStrategyAdditionalField>>
{


    public Collection<PortfolioBidStrategyAdditionalField> unmarshal(String value) {
        return (com.microsoft.bingads.v13.campaignmanagement.PortfolioBidStrategyAdditionalFieldConverter.convertToList(value));
    }

    public String marshal(Collection<PortfolioBidStrategyAdditionalField> value) {
        return (com.microsoft.bingads.v13.campaignmanagement.PortfolioBidStrategyAdditionalFieldConverter.convertToString(value));
    }

}
