
package com.microsoft.bingads.campaignmanagement;

import java.util.List;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter3
    extends XmlAdapter<String, List<MediaEnabledEntityFilter>>
{


    public List<MediaEnabledEntityFilter> unmarshal(String value) {
        return (com.microsoft.bingads.campaignmanagement.MediaEnabledEntityFilterConverter.convertToList(value));
    }

    public String marshal(List<MediaEnabledEntityFilter> value) {
        return (com.microsoft.bingads.campaignmanagement.MediaEnabledEntityFilterConverter.convertToString(value));
    }

}
