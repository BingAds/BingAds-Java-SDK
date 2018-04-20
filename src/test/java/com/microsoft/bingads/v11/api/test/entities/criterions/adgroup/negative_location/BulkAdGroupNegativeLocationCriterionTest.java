package com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.negative_location;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v11.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupNegativeLocationCriterion;
import com.microsoft.bingads.v11.campaignmanagement.LocationCriterion;
import com.microsoft.bingads.v11.campaignmanagement.NegativeAdGroupCriterion;

public abstract class BulkAdGroupNegativeLocationCriterionTest extends BulkEntityTest<BulkAdGroupNegativeLocationCriterion> {

    @Override
    protected void onEntityCreation(BulkAdGroupNegativeLocationCriterion entity) {
        LocationCriterion locationCriterion = new LocationCriterion();
        locationCriterion.setType("LocationCriterion");

        NegativeAdGroupCriterion biddableAdGroupCriterion = new NegativeAdGroupCriterion();
        biddableAdGroupCriterion.setCriterion(locationCriterion);

        entity.setNegativeAdGroupCriterion(biddableAdGroupCriterion);
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue,
            TProperty propertyValue,
            BiConsumer<BulkAdGroupNegativeLocationCriterion, TProperty> setFunc
    ) {
        testWriteProperty(
                header,
                expectedRowValue,
                propertyValue,
                setFunc,
                new Supplier<BulkAdGroupNegativeLocationCriterion>() {
                    @Override
                    public BulkAdGroupNegativeLocationCriterion get() {
                        return new BulkAdGroupNegativeLocationCriterion();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkAdGroupNegativeLocationCriterion, TProperty> actualValueFunc
    ) {
        testReadProperty(
                header,
                input,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkAdGroupNegativeLocationCriterion>() {
                    @Override
                    public BulkAdGroupNegativeLocationCriterion get() {
                        return new BulkAdGroupNegativeLocationCriterion();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkAdGroupNegativeLocationCriterion, TProperty> actualValueFunc
    ) {
        testReadProperty(
                rowValues,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkAdGroupNegativeLocationCriterion>() {
                    @Override
                    public BulkAdGroupNegativeLocationCriterion get() {
                        return new BulkAdGroupNegativeLocationCriterion();
                    }
                }
        );
    }
}
