
package com.microsoft.bingads.v13.adinsight;

import java.util.Collection;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter3
    extends XmlAdapter<String, Collection<KeywordOpportunityType>>
{


    public Collection<KeywordOpportunityType> unmarshal(String value) {
        return (com.microsoft.bingads.v13.adinsight.KeywordOpportunityTypeConverter.convertToList(value));
    }

    public String marshal(Collection<KeywordOpportunityType> value) {
        return (com.microsoft.bingads.v13.adinsight.KeywordOpportunityTypeConverter.convertToString(value));
    }

}
