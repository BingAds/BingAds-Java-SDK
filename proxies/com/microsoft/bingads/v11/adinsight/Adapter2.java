
package com.microsoft.bingads.v11.adinsight;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, Collection<BidOpportunityType>>
{


    public Collection<BidOpportunityType> unmarshal(String value) {
        return (com.microsoft.bingads.v11.adinsight.BidOpportunityTypeConverter.convertToList(value));
    }

    public String marshal(Collection<BidOpportunityType> value) {
        return (com.microsoft.bingads.v11.adinsight.BidOpportunityTypeConverter.convertToString(value));
    }

}
