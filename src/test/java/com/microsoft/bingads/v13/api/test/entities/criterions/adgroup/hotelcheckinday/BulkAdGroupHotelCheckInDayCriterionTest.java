package com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.hotelcheckinday;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupHotelCheckInDayCriterion;
import com.microsoft.bingads.v13.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.v13.campaignmanagement.HotelCheckInDayCriterion;

public abstract class BulkAdGroupHotelCheckInDayCriterionTest extends BulkEntityTest<BulkAdGroupHotelCheckInDayCriterion> {

    @Override
    protected void onEntityCreation(BulkAdGroupHotelCheckInDayCriterion entity) {
        HotelCheckInDayCriterion genderCriterion = new HotelCheckInDayCriterion();
        genderCriterion.setType("HotelCheckInDay");

        BiddableAdGroupCriterion biddableAdGroupCriterion = new BiddableAdGroupCriterion();
        biddableAdGroupCriterion.setCriterion(genderCriterion);

        entity.setBiddableAdGroupCriterion(biddableAdGroupCriterion);
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue,
            TProperty propertyValue,
            BiConsumer<BulkAdGroupHotelCheckInDayCriterion, TProperty> setFunc
    ) {
        testWriteProperty(
                header,
                expectedRowValue,
                propertyValue,
                setFunc,
                new Supplier<BulkAdGroupHotelCheckInDayCriterion>() {
                    @Override
                    public BulkAdGroupHotelCheckInDayCriterion get() {
                        return new BulkAdGroupHotelCheckInDayCriterion();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkAdGroupHotelCheckInDayCriterion, TProperty> actualValueFunc
    ) {
        testReadProperty(
                header,
                input,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkAdGroupHotelCheckInDayCriterion>() {
                    @Override
                    public BulkAdGroupHotelCheckInDayCriterion get() {
                        return new BulkAdGroupHotelCheckInDayCriterion();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkAdGroupHotelCheckInDayCriterion, TProperty> actualValueFunc
    ) {
        testReadProperty(
                rowValues,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkAdGroupHotelCheckInDayCriterion>() {
                    @Override
                    public BulkAdGroupHotelCheckInDayCriterion get() {
                        return new BulkAdGroupHotelCheckInDayCriterion();
                    }
                }
        );
    }
}
