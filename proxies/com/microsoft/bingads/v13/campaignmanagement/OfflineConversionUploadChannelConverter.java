package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class OfflineConversionUploadChannelConverter {

    public static Collection<OfflineConversionUploadChannel> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<OfflineConversionUploadChannel> result = new ArrayList<OfflineConversionUploadChannel>();

        for (String value : values) {
            result.add(OfflineConversionUploadChannel.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<OfflineConversionUploadChannel> enums) {
        String result = "";

        for (OfflineConversionUploadChannel entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}