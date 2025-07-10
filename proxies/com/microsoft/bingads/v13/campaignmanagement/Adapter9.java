
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter9
    extends XmlAdapter<String, Collection<KeywordAdditionalField>>
{


    public Collection<KeywordAdditionalField> unmarshal(String value) {
        return (com.microsoft.bingads.v13.campaignmanagement.KeywordAdditionalFieldConverter.convertToList(value));
    }

    public String marshal(Collection<KeywordAdditionalField> value) {
        return (com.microsoft.bingads.v13.campaignmanagement.KeywordAdditionalFieldConverter.convertToString(value));
    }

}
