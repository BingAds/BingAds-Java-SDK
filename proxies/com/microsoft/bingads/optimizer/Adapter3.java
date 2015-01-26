
package com.microsoft.bingads.optimizer;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter3
    extends XmlAdapter<String, Collection<BidOpportunityType>>
{


    public Collection<BidOpportunityType> unmarshal(String value) {
        return (com.microsoft.bingads.optimizer.BidOpportunityTypeConverter.convertToList(value));
    }

    public String marshal(Collection<BidOpportunityType> value) {
        return (com.microsoft.bingads.optimizer.BidOpportunityTypeConverter.convertToString(value));
    }

}
