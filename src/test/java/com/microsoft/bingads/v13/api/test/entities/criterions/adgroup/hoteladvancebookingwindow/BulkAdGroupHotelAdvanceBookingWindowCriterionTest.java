package com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.hoteladvancebookingwindow;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupHotelAdvanceBookingWindowCriterion;
import com.microsoft.bingads.v13.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.v13.campaignmanagement.HotelAdvanceBookingWindowCriterion;

public abstract class BulkAdGroupHotelAdvanceBookingWindowCriterionTest extends BulkEntityTest<BulkAdGroupHotelAdvanceBookingWindowCriterion> {

    @Override
    protected void onEntityCreation(BulkAdGroupHotelAdvanceBookingWindowCriterion entity) {
        HotelAdvanceBookingWindowCriterion genderCriterion = new HotelAdvanceBookingWindowCriterion();
        genderCriterion.setType("HotelAdvanceBookingWindow");

        BiddableAdGroupCriterion biddableAdGroupCriterion = new BiddableAdGroupCriterion();
        biddableAdGroupCriterion.setCriterion(genderCriterion);

        entity.setBiddableAdGroupCriterion(biddableAdGroupCriterion);
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue,
            TProperty propertyValue,
            BiConsumer<BulkAdGroupHotelAdvanceBookingWindowCriterion, TProperty> setFunc
    ) {
        testWriteProperty(
                header,
                expectedRowValue,
                propertyValue,
                setFunc,
                new Supplier<BulkAdGroupHotelAdvanceBookingWindowCriterion>() {
                    @Override
                    public BulkAdGroupHotelAdvanceBookingWindowCriterion get() {
                        return new BulkAdGroupHotelAdvanceBookingWindowCriterion();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkAdGroupHotelAdvanceBookingWindowCriterion, TProperty> actualValueFunc
    ) {
        testReadProperty(
                header,
                input,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkAdGroupHotelAdvanceBookingWindowCriterion>() {
                    @Override
                    public BulkAdGroupHotelAdvanceBookingWindowCriterion get() {
                        return new BulkAdGroupHotelAdvanceBookingWindowCriterion();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkAdGroupHotelAdvanceBookingWindowCriterion, TProperty> actualValueFunc
    ) {
        testReadProperty(
                rowValues,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkAdGroupHotelAdvanceBookingWindowCriterion>() {
                    @Override
                    public BulkAdGroupHotelAdvanceBookingWindowCriterion get() {
                        return new BulkAdGroupHotelAdvanceBookingWindowCriterion();
                    }
                }
        );
    }
}
