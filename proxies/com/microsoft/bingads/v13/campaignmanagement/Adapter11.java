
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter11
    extends XmlAdapter<String, Collection<CriterionAdditionalField>>
{


    public Collection<CriterionAdditionalField> unmarshal(String value) {
        return (com.microsoft.bingads.v13.campaignmanagement.CriterionAdditionalFieldConverter.convertToList(value));
    }

    public String marshal(Collection<CriterionAdditionalField> value) {
        return (com.microsoft.bingads.v13.campaignmanagement.CriterionAdditionalFieldConverter.convertToString(value));
    }

}
