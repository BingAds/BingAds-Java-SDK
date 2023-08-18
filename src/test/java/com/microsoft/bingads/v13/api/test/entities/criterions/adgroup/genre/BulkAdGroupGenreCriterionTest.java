package com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.genre;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupGenreCriterion;
import com.microsoft.bingads.v13.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.v13.campaignmanagement.GenreCriterion;

public abstract class BulkAdGroupGenreCriterionTest extends BulkEntityTest<BulkAdGroupGenreCriterion> {

    @Override
    protected void onEntityCreation(BulkAdGroupGenreCriterion entity) {
        GenreCriterion genderCriterion = new GenreCriterion();
        genderCriterion.setType("GenreCriterion");

        BiddableAdGroupCriterion biddableAdGroupCriterion = new BiddableAdGroupCriterion();
        biddableAdGroupCriterion.setCriterion(genderCriterion);

        entity.setBiddableAdGroupCriterion(biddableAdGroupCriterion);
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue,
            TProperty propertyValue,
            BiConsumer<BulkAdGroupGenreCriterion, TProperty> setFunc
    ) {
        testWriteProperty(
                header,
                expectedRowValue,
                propertyValue,
                setFunc,
                new Supplier<BulkAdGroupGenreCriterion>() {
                    @Override
                    public BulkAdGroupGenreCriterion get() {
                        return new BulkAdGroupGenreCriterion();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkAdGroupGenreCriterion, TProperty> actualValueFunc
    ) {
        testReadProperty(
                header,
                input,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkAdGroupGenreCriterion>() {
                    @Override
                    public BulkAdGroupGenreCriterion get() {
                        return new BulkAdGroupGenreCriterion();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkAdGroupGenreCriterion, TProperty> actualValueFunc
    ) {
        testReadProperty(
                rowValues,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkAdGroupGenreCriterion>() {
                    @Override
                    public BulkAdGroupGenreCriterion get() {
                        return new BulkAdGroupGenreCriterion();
                    }
                }
        );
    }
}
