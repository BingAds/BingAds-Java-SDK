
package com.microsoft.bingads.campaignmanagement;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter4
    extends XmlAdapter<String, Collection<MediaEnabledEntityFilter>>
{


    public Collection<MediaEnabledEntityFilter> unmarshal(String value) {
        return (com.microsoft.bingads.campaignmanagement.MediaEnabledEntityFilterConverter.convertToList(value));
    }

    public String marshal(Collection<MediaEnabledEntityFilter> value) {
        return (com.microsoft.bingads.campaignmanagement.MediaEnabledEntityFilterConverter.convertToString(value));
    }

}
