
package com.microsoft.bingads.v11.campaignmanagement;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter5
    extends XmlAdapter<String, Collection<AudienceAdditionalField>>
{


    public Collection<AudienceAdditionalField> unmarshal(String value) {
        return (com.microsoft.bingads.v11.campaignmanagement.AudienceAdditionalFieldConverter.convertToList(value));
    }

    public String marshal(Collection<AudienceAdditionalField> value) {
        return (com.microsoft.bingads.v11.campaignmanagement.AudienceAdditionalFieldConverter.convertToString(value));
    }

}
