package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class DeviceTypeConverter {

    public static Collection<DeviceType> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<DeviceType> result = new ArrayList<DeviceType>();

        for (String value : values) {
            result.add(DeviceType.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<DeviceType> enums) {
        String result = "";

        for (DeviceType entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}