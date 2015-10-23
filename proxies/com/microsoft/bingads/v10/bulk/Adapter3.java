
package com.microsoft.bingads.v10.bulk;

import java.util.Collection;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter3
    extends XmlAdapter<String, Collection<BulkDownloadEntity>>
{


    public Collection<BulkDownloadEntity> unmarshal(String value) {
        return (com.microsoft.bingads.v10.bulk.BulkDownloadEntityConverter.convertToList(value));
    }

    public String marshal(Collection<BulkDownloadEntity> value) {
        return (com.microsoft.bingads.v10.bulk.BulkDownloadEntityConverter.convertToString(value));
    }

}
