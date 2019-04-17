package com.microsoft.bingads.v13.api.test.entities.experiment;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.api.test.entities.EqualityComparerWithDescription;
import com.microsoft.bingads.v13.bulk.entities.BulkExperiment;
import com.microsoft.bingads.v13.campaignmanagement.Experiment;

public abstract class BulkExperimentTest extends BulkEntityTest<BulkExperiment> {

    @Override
    protected void onEntityCreation(BulkExperiment entity) {
        entity.setExperiment(new Experiment());
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkExperiment, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkExperiment>() {
            @Override
            public BulkExperiment get() {
                return new BulkExperiment();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkExperiment, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkExperiment>() {
            @Override
            public BulkExperiment get() {
                return new BulkExperiment();
            }
        });
    }
    
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkExperiment, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkExperiment>() {
            @Override
            public BulkExperiment get() {
                return new BulkExperiment();
            }
        }, comparer);
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkExperiment, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkExperiment>() {
            @Override
            public BulkExperiment get() {
                return new BulkExperiment();
            }
        });
    }
}
