
package com.microsoft.bingads.v10.adinsight;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, Collection<KeywordOpportunityType>>
{


    public Collection<KeywordOpportunityType> unmarshal(String value) {
        return (com.microsoft.bingads.v10.adinsight.KeywordOpportunityTypeConverter.convertToList(value));
    }

    public String marshal(Collection<KeywordOpportunityType> value) {
        return (com.microsoft.bingads.v10.adinsight.KeywordOpportunityTypeConverter.convertToString(value));
    }

}
