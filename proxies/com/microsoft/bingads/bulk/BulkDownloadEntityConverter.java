package com.microsoft.bingads.bulk;

import java.util.ArrayList;
import java.util.List;

public class BulkDownloadEntityConverter {

    public static List<BulkDownloadEntity> convertToList(String entityString) {
        String[] values = entityString.split(" ");

        List<BulkDownloadEntity> result = new ArrayList<BulkDownloadEntity>();

        for (String value : values) {
            result.add(BulkDownloadEntity.fromValue(value));
        }

        return result;
    }

    public static String convertToString(List<BulkDownloadEntity> list) {
        String result = "";

        for (BulkDownloadEntity entity : list) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}