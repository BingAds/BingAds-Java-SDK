package com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.location_intent;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupLocationIntentCriterion;
import com.microsoft.bingads.v13.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.v13.campaignmanagement.LocationIntentCriterion;

public abstract class BulkAdGroupLocationIntentCriterionTest extends BulkEntityTest<BulkAdGroupLocationIntentCriterion> {

    @Override
    protected void onEntityCreation(BulkAdGroupLocationIntentCriterion entity) {
        LocationIntentCriterion locationIntentCriterion = new LocationIntentCriterion();
        locationIntentCriterion.setType("LocationIntentCriterion");

        BiddableAdGroupCriterion biddableAdGroupCriterion = new BiddableAdGroupCriterion();
        biddableAdGroupCriterion.setCriterion(locationIntentCriterion);

        entity.setBiddableAdGroupCriterion(biddableAdGroupCriterion);
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue,
            TProperty propertyValue,
            BiConsumer<BulkAdGroupLocationIntentCriterion, TProperty> setFunc
    ) {
        testWriteProperty(
                header,
                expectedRowValue,
                propertyValue,
                setFunc,
                new Supplier<BulkAdGroupLocationIntentCriterion>() {
                    @Override
                    public BulkAdGroupLocationIntentCriterion get() {
                        return new BulkAdGroupLocationIntentCriterion();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkAdGroupLocationIntentCriterion, TProperty> actualValueFunc
    ) {
        testReadProperty(
                header,
                input,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkAdGroupLocationIntentCriterion>() {
                    @Override
                    public BulkAdGroupLocationIntentCriterion get() {
                        return new BulkAdGroupLocationIntentCriterion();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkAdGroupLocationIntentCriterion, TProperty> actualValueFunc
    ) {
        testReadProperty(
                rowValues,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkAdGroupLocationIntentCriterion>() {
                    @Override
                    public BulkAdGroupLocationIntentCriterion get() {
                        return new BulkAdGroupLocationIntentCriterion();
                    }
                }
        );
    }
}
