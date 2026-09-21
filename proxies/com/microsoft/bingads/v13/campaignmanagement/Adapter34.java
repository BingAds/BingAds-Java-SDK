
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter34
    extends XmlAdapter<String, Collection<LinkedInSegmentType>>
{


    public Collection<LinkedInSegmentType> unmarshal(String value) {
        return (com.microsoft.bingads.v13.campaignmanagement.LinkedInSegmentTypeConverter.convertToList(value));
    }

    public String marshal(Collection<LinkedInSegmentType> value) {
        return (com.microsoft.bingads.v13.campaignmanagement.LinkedInSegmentTypeConverter.convertToString(value));
    }

}
