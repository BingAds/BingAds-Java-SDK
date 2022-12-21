package com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.hoteldateselectiontype;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupHotelDateSelectionTypeCriterion;
import com.microsoft.bingads.v13.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.v13.campaignmanagement.HotelDateSelectionTypeCriterion;

public abstract class BulkAdGroupHotelDateSelectionTypeCriterionTest extends BulkEntityTest<BulkAdGroupHotelDateSelectionTypeCriterion> {

    @Override
    protected void onEntityCreation(BulkAdGroupHotelDateSelectionTypeCriterion entity) {
        HotelDateSelectionTypeCriterion genderCriterion = new HotelDateSelectionTypeCriterion();
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
            BiConsumer<BulkAdGroupHotelDateSelectionTypeCriterion, TProperty> setFunc
    ) {
        testWriteProperty(
                header,
                expectedRowValue,
                propertyValue,
                setFunc,
                new Supplier<BulkAdGroupHotelDateSelectionTypeCriterion>() {
                    @Override
                    public BulkAdGroupHotelDateSelectionTypeCriterion get() {
                        return new BulkAdGroupHotelDateSelectionTypeCriterion();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkAdGroupHotelDateSelectionTypeCriterion, TProperty> actualValueFunc
    ) {
        testReadProperty(
                header,
                input,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkAdGroupHotelDateSelectionTypeCriterion>() {
                    @Override
                    public BulkAdGroupHotelDateSelectionTypeCriterion get() {
                        return new BulkAdGroupHotelDateSelectionTypeCriterion();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkAdGroupHotelDateSelectionTypeCriterion, TProperty> actualValueFunc
    ) {
        testReadProperty(
                rowValues,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkAdGroupHotelDateSelectionTypeCriterion>() {
                    @Override
                    public BulkAdGroupHotelDateSelectionTypeCriterion get() {
                        return new BulkAdGroupHotelDateSelectionTypeCriterion();
                    }
                }
        );
    }
}
