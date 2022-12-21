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
import com.microsoft.bingads.v13.campaignmanagement.HotelGroup;
import com.microsoft.bingads.v13.campaignmanagement.HotelListing;
import com.microsoft.bingads.v13.campaignmanagement.NegativeAdGroupCriterion;

public class WriteOperandTest extends BulkAdGroupHotelListingGroupTest {
    @Parameterized.Parameter(value = 1)
    public String propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"123", "123"},
                        {"XXX YYY", "XXX YYY"},
                        {"", ""},
                        {null, null}
                }
        );
    }

    @Test
    public void testWriteExcluded() {
        testWriteProperty(
                "Hotel Attribute",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupHotelListingGroup, String>() {
                    @Override
                    public void accept(BulkAdGroupHotelListingGroup c, String v) {
                        
                        HotelListing listing = new HotelListing();
                        listing.setOperand(v);
                        
                        HotelGroup criterion = new HotelGroup();
                        criterion.setListing(listing);

                        AdGroupCriterion adGroupCriterion = new NegativeAdGroupCriterion();

                        adGroupCriterion.setCriterion(criterion);

                        c.setAdGroupCriterion(adGroupCriterion);
                    }
                }
        );
    }

    @Test
    public void testWriteNotExcluded() {
        testWriteProperty(
                "Ad Group",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupHotelListingGroup, String>() {
                    @Override
                    public void accept(BulkAdGroupHotelListingGroup c, String v) {
                        HotelGroup criterion = new HotelGroup();

                        AdGroupCriterion adGroupCriterion = new BiddableAdGroupCriterion();

                        adGroupCriterion.setCriterion(criterion);

                        c.setAdGroupCriterion(adGroupCriterion);

                        c.setAdGroupName(v);
                    }
                }
        );
    }
}
