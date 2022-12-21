package com.microsoft.bingads.v13.api.test.entities.ad_group_hotel_group.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.ad_group_hotel_group.BulkAdGroupHotelListingGroupTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupHotelListingGroup;
import com.microsoft.bingads.v13.campaignmanagement.AdGroupCriterion;
import com.microsoft.bingads.v13.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.v13.campaignmanagement.NegativeAdGroupCriterion;
import com.microsoft.bingads.v13.campaignmanagement.HotelGroup;

public class WriteIsExcludedTest extends BulkAdGroupHotelListingGroupTest {

    @Parameterized.Parameter(value = 1)
    public Boolean propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"True", true},
                        {"False", false},
                }
        );
    }

    @Test
    public void testWriteExcluded() {
        testWriteProperty(
                "Is Excluded",
                datum,
                propertyValue, new BiConsumer<BulkAdGroupHotelListingGroup, Boolean>() {
                    @Override
                    public void accept(BulkAdGroupHotelListingGroup c, Boolean v) {
                        if (v) {
                            HotelGroup criterion = new HotelGroup();

                            AdGroupCriterion adGroupCriterion = new NegativeAdGroupCriterion();

                            adGroupCriterion.setCriterion(criterion);

                            c.setAdGroupCriterion(adGroupCriterion);
                        } else {
                            HotelGroup criterion = new HotelGroup();

                            AdGroupCriterion adGroupCriterion = new BiddableAdGroupCriterion();

                            adGroupCriterion.setCriterion(criterion);

                            c.setAdGroupCriterion(adGroupCriterion);
                        }
                    }
                }
        );
    }

}
