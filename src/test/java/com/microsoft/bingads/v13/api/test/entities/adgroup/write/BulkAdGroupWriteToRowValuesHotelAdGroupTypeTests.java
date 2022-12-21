package com.microsoft.bingads.v13.api.test.entities.adgroup.write;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.adgroup.BulkAdGroupTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroup;
import com.microsoft.bingads.v13.campaignmanagement.HotelAdGroupType;
import com.microsoft.bingads.v13.campaignmanagement.HotelSetting;

@RunWith(Parameterized.class)
public class BulkAdGroupWriteToRowValuesHotelAdGroupTypeTests extends BulkAdGroupTest {

    @Parameter(value = 1)
    public Collection<HotelAdGroupType> propertyValue;
    
    @Parameters
    public static Collection<Object[]> data() {
        // In this example, the parameter generator returns a List of
        // arrays.  Each array has two elements: { datum, expected }.
        // These data are hard-coded into the class, but they could be
        // generated or loaded in any way you like.
        List<HotelAdGroupType> list = new ArrayList<HotelAdGroupType>();
        list.add(HotelAdGroupType.HOTEL_AD);
        list.add(HotelAdGroupType.PROPERTY_AD);
        return Arrays.asList(new Object[][]{
            {"HotelAd", Collections.singletonList(HotelAdGroupType.HOTEL_AD)},
            {"PropertyAd", Collections.singletonList(HotelAdGroupType.PROPERTY_AD)},
            {"HotelAd,PropertyAd", list}
        });
    }

    @Test
    public void testWrite() {
        this.<Collection<HotelAdGroupType>>testWriteProperty("Hotel Ad Group Type", this.datum, this.propertyValue, new BiConsumer<BulkAdGroup, Collection<HotelAdGroupType>>() {
            @Override
            public void accept(BulkAdGroup c, Collection<HotelAdGroupType> v) {
                HotelSetting setting = new HotelSetting();
                setting.setHotelAdGroupType(v);
                c.addAdGroupSetting(setting);
            }
        });
    }
}
