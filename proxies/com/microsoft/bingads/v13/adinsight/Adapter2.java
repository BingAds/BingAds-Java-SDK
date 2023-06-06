
package com.microsoft.bingads.v13.adinsight;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, Collection<AuctionInsightKpiAdditionalField>>
{


    public Collection<AuctionInsightKpiAdditionalField> unmarshal(String value) {
        return (com.microsoft.bingads.v13.adinsight.AuctionInsightKpiAdditionalFieldConverter.convertToList(value));
    }

    public String marshal(Collection<AuctionInsightKpiAdditionalField> value) {
        return (com.microsoft.bingads.v13.adinsight.AuctionInsightKpiAdditionalFieldConverter.convertToString(value));
    }

}
