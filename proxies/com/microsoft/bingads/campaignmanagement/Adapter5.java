
package com.microsoft.bingads.campaignmanagement;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter5
    extends XmlAdapter<String, Collection<CriterionType>>
{


    public Collection<CriterionType> unmarshal(String value) {
        return (com.microsoft.bingads.campaignmanagement.CriterionTypeConverter.convertToList(value));
    }

    public String marshal(Collection<CriterionType> value) {
        return (com.microsoft.bingads.campaignmanagement.CriterionTypeConverter.convertToString(value));
    }

}
