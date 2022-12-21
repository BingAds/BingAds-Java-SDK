package com.microsoft.bingads.v13.api.test.entities.ad_group_hotel_group.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.ad_group_hotel_group.BulkAdGroupHotelListingGroupTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupHotelListingGroup;
import com.microsoft.bingads.v13.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.v13.campaignmanagement.HotelGroup;

public class WriteFusTest extends BulkAdGroupHotelListingGroupTest {
    @Parameterized.Parameter(value = 1)
    public String propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                    {"delete_value", ""},
                    {null, null},
                    {"Final Url Suffix", "Final Url Suffix"},
                    {"?src=bing&param=123", "?src=bing&param=123"},
                }
        );
    }


    @Test
    public void testWriteNotExcluded() {
        testWriteProperty(
                "Final Url Suffix",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupHotelListingGroup, String>() {
                    @Override
                    public void accept(BulkAdGroupHotelListingGroup c, String v) {
                        HotelGroup criterion = new HotelGroup();

                        BiddableAdGroupCriterion adGroupCriterion = new BiddableAdGroupCriterion();

                        adGroupCriterion.setCriterion(criterion);
                        adGroupCriterion.setFinalUrlSuffix(v);
                        adGroupCriterion.setId(100L);

                        c.setAdGroupCriterion(adGroupCriterion);
                    }
                }
        );
    }
}
