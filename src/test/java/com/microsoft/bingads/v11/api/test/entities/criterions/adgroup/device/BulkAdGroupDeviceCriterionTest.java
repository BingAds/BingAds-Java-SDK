package com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.device;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v11.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupDeviceCriterion;
import com.microsoft.bingads.v11.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.v11.campaignmanagement.DeviceCriterion;

public abstract class BulkAdGroupDeviceCriterionTest extends BulkEntityTest<BulkAdGroupDeviceCriterion> {

    @Override
    protected void onEntityCreation(BulkAdGroupDeviceCriterion entity) {
        DeviceCriterion deviceCriterion = new DeviceCriterion();
        deviceCriterion.setType("DeviceCriterion");

        BiddableAdGroupCriterion biddableAdGroupCriterion = new BiddableAdGroupCriterion();
        biddableAdGroupCriterion.setCriterion(deviceCriterion);

        entity.setBiddableAdGroupCriterion(biddableAdGroupCriterion);
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue,
            TProperty propertyValue,
            BiConsumer<BulkAdGroupDeviceCriterion, TProperty> setFunc
    ) {
        testWriteProperty(
                header,
                expectedRowValue,
                propertyValue,
                setFunc,
                new Supplier<BulkAdGroupDeviceCriterion>() {
                    @Override
                    public BulkAdGroupDeviceCriterion get() {
                        return new BulkAdGroupDeviceCriterion();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkAdGroupDeviceCriterion, TProperty> actualValueFunc
    ) {
        testReadProperty(
                header,
                input,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkAdGroupDeviceCriterion>() {
                    @Override
                    public BulkAdGroupDeviceCriterion get() {
                        return new BulkAdGroupDeviceCriterion();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkAdGroupDeviceCriterion, TProperty> actualValueFunc
    ) {
        testReadProperty(
                rowValues,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkAdGroupDeviceCriterion>() {
                    @Override
                    public BulkAdGroupDeviceCriterion get() {
                        return new BulkAdGroupDeviceCriterion();
                    }
                }
        );
    }
}
