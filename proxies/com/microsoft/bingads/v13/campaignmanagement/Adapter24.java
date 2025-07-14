
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter24
    extends XmlAdapter<String, Collection<ProductAudienceType>>
{


    public Collection<ProductAudienceType> unmarshal(String value) {
        return (com.microsoft.bingads.v13.campaignmanagement.ProductAudienceTypeConverter.convertToList(value));
    }

    public String marshal(Collection<ProductAudienceType> value) {
        return (com.microsoft.bingads.v13.campaignmanagement.ProductAudienceTypeConverter.convertToString(value));
    }

}
