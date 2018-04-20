
package com.microsoft.bingads.v12.adinsight;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter3
    extends XmlAdapter<String, Collection<KeywordOpportunityType>>
{


    public Collection<KeywordOpportunityType> unmarshal(String value) {
        return (com.microsoft.bingads.v12.adinsight.KeywordOpportunityTypeConverter.convertToList(value));
    }

    public String marshal(Collection<KeywordOpportunityType> value) {
        return (com.microsoft.bingads.v12.adinsight.KeywordOpportunityTypeConverter.convertToString(value));
    }

}
