
package com.microsoft.bingads.campaignmanagement;

import java.util.List;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter4
    extends XmlAdapter<String, List<CriterionType>>
{


    public List<CriterionType> unmarshal(String value) {
        return (com.microsoft.bingads.campaignmanagement.CriterionTypeConverter.convertToList(value));
    }

    public String marshal(List<CriterionType> value) {
        return (com.microsoft.bingads.campaignmanagement.CriterionTypeConverter.convertToString(value));
    }

}
