package com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.hotelcheckindate;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupHotelCheckInDateCriterion;
import com.microsoft.bingads.v13.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.v13.campaignmanagement.HotelCheckInDateCriterion;

public abstract class BulkAdGroupHotelCheckInDateTest extends BulkEntityTest<BulkAdGroupHotelCheckInDateCriterion> {

    @Override
    protected void onEntityCreation(BulkAdGroupHotelCheckInDateCriterion entity) {
        HotelCheckInDateCriterion genderCriterion = new HotelCheckInDateCriterion();
        genderCriterion.setType("HotelCheckInDate");

        BiddableAdGroupCriterion biddableAdGroupCriterion = new BiddableAdGroupCriterion();
        biddableAdGroupCriterion.setCriterion(genderCriterion);

        entity.setBiddableAdGroupCriterion(biddableAdGroupCriterion);
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue,
            TProperty propertyValue,
            BiConsumer<BulkAdGroupHotelCheckInDateCriterion, TProperty> setFunc
    ) {
        testWriteProperty(
                header,
                expectedRowValue,
                propertyValue,
                setFunc,
                new Supplier<BulkAdGroupHotelCheckInDateCriterion>() {
                    @Override
                    public BulkAdGroupHotelCheckInDateCriterion get() {
                        return new BulkAdGroupHotelCheckInDateCriterion();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkAdGroupHotelCheckInDateCriterion, TProperty> actualValueFunc
    ) {
        testReadProperty(
                header,
                input,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkAdGroupHotelCheckInDateCriterion>() {
                    @Override
                    public BulkAdGroupHotelCheckInDateCriterion get() {
                        return new BulkAdGroupHotelCheckInDateCriterion();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkAdGroupHotelCheckInDateCriterion, TProperty> actualValueFunc
    ) {
        testReadProperty(
                rowValues,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkAdGroupHotelCheckInDateCriterion>() {
                    @Override
                    public BulkAdGroupHotelCheckInDateCriterion get() {
                        return new BulkAdGroupHotelCheckInDateCriterion();
                    }
                }
        );
    }
}
