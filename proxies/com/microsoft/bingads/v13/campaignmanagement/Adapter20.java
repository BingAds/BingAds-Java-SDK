
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter20
    extends XmlAdapter<String, Collection<SharedEntityAssociationAdditionalField>>
{


    public Collection<SharedEntityAssociationAdditionalField> unmarshal(String value) {
        return (com.microsoft.bingads.v13.campaignmanagement.SharedEntityAssociationAdditionalFieldConverter.convertToList(value));
    }

    public String marshal(Collection<SharedEntityAssociationAdditionalField> value) {
        return (com.microsoft.bingads.v13.campaignmanagement.SharedEntityAssociationAdditionalFieldConverter.convertToString(value));
    }

}
