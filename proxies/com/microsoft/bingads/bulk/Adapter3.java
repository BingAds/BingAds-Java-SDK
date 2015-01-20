
package com.microsoft.bingads.bulk;

import java.util.List;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter3
    extends XmlAdapter<String, List<BulkDownloadEntity>>
{


    public List<BulkDownloadEntity> unmarshal(String value) {
        return (com.microsoft.bingads.bulk.BulkDownloadEntityConverter.convertToList(value));
    }

    public String marshal(List<BulkDownloadEntity> value) {
        return (com.microsoft.bingads.bulk.BulkDownloadEntityConverter.convertToString(value));
    }

}
