package com.microsoft.bingads.v13.api.test.entities.adgroup.read;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.ObjectComparer;
import com.microsoft.bingads.v13.api.test.entities.adgroup.BulkAdGroupTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroup;
import com.microsoft.bingads.v13.campaignmanagement.HotelAdGroupType;
import com.microsoft.bingads.v13.campaignmanagement.HotelSetting;

@RunWith(Parameterized.class)
public class BulkAdgroupReadFromRowValuesHotelAdGroupTypeTest extends BulkAdGroupTest {

    @Parameter(value = 0)
    public String datum;

    @Parameterized.Parameter(value = 1)
    public Collection<HotelAdGroupType> expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        List<HotelAdGroupType> list = new ArrayList<HotelAdGroupType>();
        list.add(HotelAdGroupType.HOTEL_AD);
        list.add(HotelAdGroupType.PROPERTY_AD);
        return Arrays.asList(
                new Object[][]{
                        {"HotelAd", Collections.singletonList(HotelAdGroupType.HOTEL_AD)},
                        {"PropertyAd", Collections.singletonList(HotelAdGroupType.PROPERTY_AD)},
                        {"HotelAd,PropertyAd", list}
                }
        );
    }

    @Test
    public void testRead() {
        testReadProperty(
                "Hotel Ad Group Type",
                datum,
                expectedResult,
                new Function<BulkAdGroup, Collection<HotelAdGroupType>>() {
                    @Override
                    public Collection<HotelAdGroupType> apply(BulkAdGroup c) {
                        HotelSetting setting = (HotelSetting) c.getSetting(HotelSetting.class);
                        return setting.getHotelAdGroupType();
                    }
                },
                new ObjectComparer<Collection<HotelAdGroupType>>()
        );
    }
}
