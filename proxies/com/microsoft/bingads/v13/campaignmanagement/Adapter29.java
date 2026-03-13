
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter29
    extends XmlAdapter<String, Collection<OfflineConversionUploadChannel>>
{


    public Collection<OfflineConversionUploadChannel> unmarshal(String value) {
        return (com.microsoft.bingads.v13.campaignmanagement.OfflineConversionUploadChannelConverter.convertToList(value));
    }

    public String marshal(Collection<OfflineConversionUploadChannel> value) {
        return (com.microsoft.bingads.v13.campaignmanagement.OfflineConversionUploadChannelConverter.convertToString(value));
    }

}
