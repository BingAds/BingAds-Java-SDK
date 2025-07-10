
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter28
    extends XmlAdapter<String, Collection<ImportAdditionalField>>
{


    public Collection<ImportAdditionalField> unmarshal(String value) {
        return (com.microsoft.bingads.v13.campaignmanagement.ImportAdditionalFieldConverter.convertToList(value));
    }

    public String marshal(Collection<ImportAdditionalField> value) {
        return (com.microsoft.bingads.v13.campaignmanagement.ImportAdditionalFieldConverter.convertToString(value));
    }

}
