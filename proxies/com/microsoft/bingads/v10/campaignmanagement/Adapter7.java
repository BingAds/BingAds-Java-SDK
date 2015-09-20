
package com.microsoft.bingads.v10.campaignmanagement;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter7
    extends XmlAdapter<String, Collection<CriterionType>>
{


    public Collection<CriterionType> unmarshal(String value) {
        return (com.microsoft.bingads.v10.campaignmanagement.CriterionTypeConverter.convertToList(value));
    }

    public String marshal(Collection<CriterionType> value) {
        return (com.microsoft.bingads.v10.campaignmanagement.CriterionTypeConverter.convertToString(value));
    }

}
