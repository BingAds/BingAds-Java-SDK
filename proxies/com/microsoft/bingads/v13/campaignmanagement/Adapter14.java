
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter14
    extends XmlAdapter<String, Collection<LogicalOperator>>
{


    public Collection<LogicalOperator> unmarshal(String value) {
        return (com.microsoft.bingads.v13.campaignmanagement.LogicalOperatorConverter.convertToList(value));
    }

    public String marshal(Collection<LogicalOperator> value) {
        return (com.microsoft.bingads.v13.campaignmanagement.LogicalOperatorConverter.convertToString(value));
    }

}
