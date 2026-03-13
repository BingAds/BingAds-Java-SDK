
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter30
    extends XmlAdapter<String, Collection<ExperimentAdditionalField>>
{


    public Collection<ExperimentAdditionalField> unmarshal(String value) {
        return (com.microsoft.bingads.v13.campaignmanagement.ExperimentAdditionalFieldConverter.convertToList(value));
    }

    public String marshal(Collection<ExperimentAdditionalField> value) {
        return (com.microsoft.bingads.v13.campaignmanagement.ExperimentAdditionalFieldConverter.convertToString(value));
    }

}
