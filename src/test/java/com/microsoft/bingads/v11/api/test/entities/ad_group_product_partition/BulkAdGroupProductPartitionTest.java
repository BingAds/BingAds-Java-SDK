package com.microsoft.bingads.v11.api.test.entities.ad_group_product_partition;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v11.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupProductPartition;

public abstract class BulkAdGroupProductPartitionTest extends BulkEntityTest<BulkAdGroupProductPartition> {

    @Override
    protected void onEntityCreation(BulkAdGroupProductPartition entity) {

    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue,
            TProperty propertyValue,
            BiConsumer<BulkAdGroupProductPartition, TProperty> setFunc
    ) {
        testWriteProperty(
                header,
                expectedRowValue,
                propertyValue,
                setFunc,
                new Supplier<BulkAdGroupProductPartition>() {
                    @Override
                    public BulkAdGroupProductPartition get() {
                        return new BulkAdGroupProductPartition();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkAdGroupProductPartition, TProperty> actualValueFunc
    ) {
        testReadProperty(
                header,
                input,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkAdGroupProductPartition>() {
                    @Override
                    public BulkAdGroupProductPartition get() {
                        return new BulkAdGroupProductPartition();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkAdGroupProductPartition, TProperty> actualValueFunc
    ) {
        testReadProperty(
                rowValues,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkAdGroupProductPartition>() {
                    @Override
                    public BulkAdGroupProductPartition get() {
                        return new BulkAdGroupProductPartition();
                    }
                }
        );
    }
}
