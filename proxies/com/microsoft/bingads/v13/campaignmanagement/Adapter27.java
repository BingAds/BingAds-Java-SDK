
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter27
    extends XmlAdapter<String, Collection<DeviceType>>
{


    public Collection<DeviceType> unmarshal(String value) {
        return (com.microsoft.bingads.v13.campaignmanagement.DeviceTypeConverter.convertToList(value));
    }

    public String marshal(Collection<DeviceType> value) {
        return (com.microsoft.bingads.v13.campaignmanagement.DeviceTypeConverter.convertToString(value));
    }

}
