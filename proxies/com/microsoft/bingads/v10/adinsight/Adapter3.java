
package com.microsoft.bingads.v10.adinsight;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter3
    extends XmlAdapter<String, Collection<BidOpportunityType>>
{


    public Collection<BidOpportunityType> unmarshal(String value) {
        return (com.microsoft.bingads.v10.adinsight.BidOpportunityTypeConverter.convertToList(value));
    }

    public String marshal(Collection<BidOpportunityType> value) {
        return (com.microsoft.bingads.v10.adinsight.BidOpportunityTypeConverter.convertToString(value));
    }

}
