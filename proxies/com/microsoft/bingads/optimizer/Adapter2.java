
package com.microsoft.bingads.optimizer;

import java.util.List;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, List<KeywordOpportunityType>>
{


    public List<KeywordOpportunityType> unmarshal(String value) {
        return (com.microsoft.bingads.optimizer.KeywordOpportunityTypeConverter.convertToList(value));
    }

    public String marshal(List<KeywordOpportunityType> value) {
        return (com.microsoft.bingads.optimizer.KeywordOpportunityTypeConverter.convertToString(value));
    }

}
