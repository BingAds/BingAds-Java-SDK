
package com.microsoft.bingads.v12.campaignmanagement;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter13
    extends XmlAdapter<String, Collection<KeywordAdditionalField>>
{


    public Collection<KeywordAdditionalField> unmarshal(String value) {
        return (com.microsoft.bingads.v12.campaignmanagement.KeywordAdditionalFieldConverter.convertToList(value));
    }

    public String marshal(Collection<KeywordAdditionalField> value) {
        return (com.microsoft.bingads.v12.campaignmanagement.KeywordAdditionalFieldConverter.convertToString(value));
    }

}
