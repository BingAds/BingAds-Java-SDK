package com.microsoft.bingads.v13.api.test.entities.ad_group_hotel_group.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.ad_group_hotel_group.BulkAdGroupHotelListingGroupTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupHotelListingGroup;
import com.microsoft.bingads.v13.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.v13.campaignmanagement.HotelGroup;

public class WriteTrackingTemplateTest extends BulkAdGroupHotelListingGroupTest {
	@Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {null, null},
            {"delete_value", ""},
            {"template", "template"},
        });
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Tracking Template",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupHotelListingGroup, String>() {
                    @Override
                    public void accept(BulkAdGroupHotelListingGroup c, String v) {
                        HotelGroup criterion = new HotelGroup();

                        BiddableAdGroupCriterion adGroupCriterion = new BiddableAdGroupCriterion();

                        adGroupCriterion.setCriterion(criterion);
                        adGroupCriterion.setId(100L);
                        c.setAdGroupCriterion(adGroupCriterion);

                        adGroupCriterion.setTrackingUrlTemplate(v);
                    }
                }
        );
    }

}
