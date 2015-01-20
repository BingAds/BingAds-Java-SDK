
package com.microsoft.bingads.optimizer;

import java.util.List;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter3
    extends XmlAdapter<String, List<BidOpportunityType>>
{


    public List<BidOpportunityType> unmarshal(String value) {
        return (com.microsoft.bingads.optimizer.BidOpportunityTypeConverter.convertToList(value));
    }

    public String marshal(List<BidOpportunityType> value) {
        return (com.microsoft.bingads.optimizer.BidOpportunityTypeConverter.convertToString(value));
    }

}
