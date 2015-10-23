package com.microsoft.bingads.v10.bulk;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class BulkDownloadEntityConverter {

    public static Collection<BulkDownloadEntity> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<BulkDownloadEntity> result = new ArrayList<BulkDownloadEntity>();

        for (String value : values) {
            result.add(BulkDownloadEntity.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<BulkDownloadEntity> enums) {
        String result = "";

        for (BulkDownloadEntity entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}