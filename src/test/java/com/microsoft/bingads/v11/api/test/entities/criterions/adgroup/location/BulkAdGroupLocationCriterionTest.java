package com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.location;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v11.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupLocationCriterion;
import com.microsoft.bingads.v11.campaignmanagement.LocationCriterion;
import com.microsoft.bingads.v11.campaignmanagement.BiddableAdGroupCriterion;
import java.util.Map;

public abstract class BulkAdGroupLocationCriterionTest extends BulkEntityTest<BulkAdGroupLocationCriterion> {

    @Override
    protected void onEntityCreation(BulkAdGroupLocationCriterion entity) {
        LocationCriterion locationCriterion = new LocationCriterion();
        locationCriterion.setType("LocationCriterion");

        BiddableAdGroupCriterion biddableAdGroupCriterion = new BiddableAdGroupCriterion();
        biddableAdGroupCriterion.setCriterion(locationCriterion);

        entity.setAdGroupCriterion(biddableAdGroupCriterion);
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue,
            TProperty propertyValue,
            BiConsumer<BulkAdGroupLocationCriterion, TProperty> setFunc
    ) {
        testWriteProperty(
                header,
                expectedRowValue,
                propertyValue,
                setFunc,
                new Supplier<BulkAdGroupLocationCriterion>() {
                    @Override
                    public BulkAdGroupLocationCriterion get() {
                        return new BulkAdGroupLocationCriterion();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkAdGroupLocationCriterion, TProperty> actualValueFunc
    ) {
        testReadProperty(
                header,
                input,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkAdGroupLocationCriterion>() {
                    @Override
                    public BulkAdGroupLocationCriterion get() {
                        return new BulkAdGroupLocationCriterion();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkAdGroupLocationCriterion, TProperty> actualValueFunc
    ) {
        testReadProperty(
                rowValues,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkAdGroupLocationCriterion>() {
                    @Override
                    public BulkAdGroupLocationCriterion get() {
                        return new BulkAdGroupLocationCriterion();
                    }
                }
        );
    }
}
