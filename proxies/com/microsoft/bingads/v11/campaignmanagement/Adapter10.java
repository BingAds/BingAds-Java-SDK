
package com.microsoft.bingads.v11.campaignmanagement;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter10
    extends XmlAdapter<String, Collection<ProductAudienceType>>
{


    public Collection<ProductAudienceType> unmarshal(String value) {
        return (com.microsoft.bingads.v11.campaignmanagement.ProductAudienceTypeConverter.convertToList(value));
    }

    public String marshal(Collection<ProductAudienceType> value) {
        return (com.microsoft.bingads.v11.campaignmanagement.ProductAudienceTypeConverter.convertToString(value));
    }

}
