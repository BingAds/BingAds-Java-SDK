
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter28
    extends XmlAdapter<String, Collection<BrandKitAdditionalField>>
{


    public Collection<BrandKitAdditionalField> unmarshal(String value) {
        return (com.microsoft.bingads.v13.campaignmanagement.BrandKitAdditionalFieldConverter.convertToList(value));
    }

    public String marshal(Collection<BrandKitAdditionalField> value) {
        return (com.microsoft.bingads.v13.campaignmanagement.BrandKitAdditionalFieldConverter.convertToString(value));
    }

}
