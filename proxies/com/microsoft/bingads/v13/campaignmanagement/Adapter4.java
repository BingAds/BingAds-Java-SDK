
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter4
    extends XmlAdapter<String, Collection<AppStore>>
{


    public Collection<AppStore> unmarshal(String value) {
        return (com.microsoft.bingads.v13.campaignmanagement.AppStoreConverter.convertToList(value));
    }

    public String marshal(Collection<AppStore> value) {
        return (com.microsoft.bingads.v13.campaignmanagement.AppStoreConverter.convertToString(value));
    }

}
