
package com.microsoft.bingads.v10.campaignmanagement;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter4
    extends XmlAdapter<String, Collection<RemarketingListAdditionalField>>
{


    public Collection<RemarketingListAdditionalField> unmarshal(String value) {
        return (com.microsoft.bingads.v10.campaignmanagement.RemarketingListAdditionalFieldConverter.convertToList(value));
    }

    public String marshal(Collection<RemarketingListAdditionalField> value) {
        return (com.microsoft.bingads.v10.campaignmanagement.RemarketingListAdditionalFieldConverter.convertToString(value));
    }

}
