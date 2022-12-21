package com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.hotellengthofstay;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupHotelLengthOfStayCriterion;
import com.microsoft.bingads.v13.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.v13.campaignmanagement.HotelLengthOfStayCriterion;

public abstract class BulkAdGroupHotelLengthOfStayCriterionTest extends BulkEntityTest<BulkAdGroupHotelLengthOfStayCriterion> {

    @Override
    protected void onEntityCreation(BulkAdGroupHotelLengthOfStayCriterion entity) {
        HotelLengthOfStayCriterion genderCriterion = new HotelLengthOfStayCriterion();
        genderCriterion.setType("HotelLengthOfStay");

        BiddableAdGroupCriterion biddableAdGroupCriterion = new BiddableAdGroupCriterion();
        biddableAdGroupCriterion.setCriterion(genderCriterion);

        entity.setBiddableAdGroupCriterion(biddableAdGroupCriterion);
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue,
            TProperty propertyValue,
            BiConsumer<BulkAdGroupHotelLengthOfStayCriterion, TProperty> setFunc
    ) {
        testWriteProperty(
                header,
                expectedRowValue,
                propertyValue,
                setFunc,
                new Supplier<BulkAdGroupHotelLengthOfStayCriterion>() {
                    @Override
                    public BulkAdGroupHotelLengthOfStayCriterion get() {
                        return new BulkAdGroupHotelLengthOfStayCriterion();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkAdGroupHotelLengthOfStayCriterion, TProperty> actualValueFunc
    ) {
        testReadProperty(
                header,
                input,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkAdGroupHotelLengthOfStayCriterion>() {
                    @Override
                    public BulkAdGroupHotelLengthOfStayCriterion get() {
                        return new BulkAdGroupHotelLengthOfStayCriterion();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkAdGroupHotelLengthOfStayCriterion, TProperty> actualValueFunc
    ) {
        testReadProperty(
                rowValues,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkAdGroupHotelLengthOfStayCriterion>() {
                    @Override
                    public BulkAdGroupHotelLengthOfStayCriterion get() {
                        return new BulkAdGroupHotelLengthOfStayCriterion();
                    }
                }
        );
    }
}
