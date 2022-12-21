package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class HotelAdGroupTypeConverter {

    public static Collection<HotelAdGroupType> convertToList(String enums) {
        String[] values = enums.split(" ");

        Collection<HotelAdGroupType> result = new ArrayList<HotelAdGroupType>();

        for (String value : values) {
            result.add(HotelAdGroupType.fromValue(value));
        }

        return result;
    }

    public static String convertToString(Collection<HotelAdGroupType> enums) {
        String result = "";

        for (HotelAdGroupType entity : enums) {
            result += (entity.value() + " ");
        }

        result = result.substring(0, result.length() - 1);

        return result;
    }
}