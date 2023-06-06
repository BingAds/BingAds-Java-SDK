
package com.microsoft.bingads.v13.adinsight;

import java.util.Collection;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, Collection<BidOpportunityType>>
{


    public Collection<BidOpportunityType> unmarshal(String value) {
        return (com.microsoft.bingads.v13.adinsight.BidOpportunityTypeConverter.convertToList(value));
    }

    public String marshal(Collection<BidOpportunityType> value) {
        return (com.microsoft.bingads.v13.adinsight.BidOpportunityTypeConverter.convertToString(value));
    }

}
