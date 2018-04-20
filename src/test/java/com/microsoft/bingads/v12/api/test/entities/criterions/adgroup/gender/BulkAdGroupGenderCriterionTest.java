package com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.gender;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v12.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v12.bulk.entities.BulkAdGroupGenderCriterion;
import com.microsoft.bingads.v12.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.v12.campaignmanagement.GenderCriterion;

public abstract class BulkAdGroupGenderCriterionTest extends BulkEntityTest<BulkAdGroupGenderCriterion> {

    @Override
    protected void onEntityCreation(BulkAdGroupGenderCriterion entity) {
        GenderCriterion genderCriterion = new GenderCriterion();
        genderCriterion.setType("GenderCriterion");

        BiddableAdGroupCriterion biddableAdGroupCriterion = new BiddableAdGroupCriterion();
        biddableAdGroupCriterion.setCriterion(genderCriterion);

        entity.setBiddableAdGroupCriterion(biddableAdGroupCriterion);
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue,
            TProperty propertyValue,
            BiConsumer<BulkAdGroupGenderCriterion, TProperty> setFunc
    ) {
        testWriteProperty(
                header,
                expectedRowValue,
                propertyValue,
                setFunc,
                new Supplier<BulkAdGroupGenderCriterion>() {
                    @Override
                    public BulkAdGroupGenderCriterion get() {
                        return new BulkAdGroupGenderCriterion();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkAdGroupGenderCriterion, TProperty> actualValueFunc
    ) {
        testReadProperty(
                header,
                input,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkAdGroupGenderCriterion>() {
                    @Override
                    public BulkAdGroupGenderCriterion get() {
                        return new BulkAdGroupGenderCriterion();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkAdGroupGenderCriterion, TProperty> actualValueFunc
    ) {
        testReadProperty(
                rowValues,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkAdGroupGenderCriterion>() {
                    @Override
                    public BulkAdGroupGenderCriterion get() {
                        return new BulkAdGroupGenderCriterion();
                    }
                }
        );
    }
}
