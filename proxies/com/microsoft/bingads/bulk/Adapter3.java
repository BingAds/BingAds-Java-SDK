
package com.microsoft.bingads.bulk;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter3
    extends XmlAdapter<String, Collection<BulkDownloadEntity>>
{


    public Collection<BulkDownloadEntity> unmarshal(String value) {
        return (com.microsoft.bingads.bulk.BulkDownloadEntityConverter.convertToList(value));
    }

    public String marshal(Collection<BulkDownloadEntity> value) {
        return (com.microsoft.bingads.bulk.BulkDownloadEntityConverter.convertToString(value));
    }

}
