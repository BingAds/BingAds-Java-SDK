package com.microsoft.bingads.v13.api.test.entities.seasonality_adjustment;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.api.test.entities.EqualityComparerWithDescription;
import com.microsoft.bingads.v13.bulk.entities.BulkSeasonalityAdjustment;
import com.microsoft.bingads.v13.campaignmanagement.SeasonalityAdjustment;

public abstract class BulkSeasonalityAdjustmentTest extends BulkEntityTest<BulkSeasonalityAdjustment> {

    @Override
    protected void onEntityCreation(BulkSeasonalityAdjustment entity) {
        SeasonalityAdjustment SeasonalityAdjustment = new SeasonalityAdjustment();
        SeasonalityAdjustment.setId(100L);
        entity.setSeasonalityAdjustment(SeasonalityAdjustment);
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkSeasonalityAdjustment, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkSeasonalityAdjustment>() {
            @Override
            public BulkSeasonalityAdjustment get() {
                return new BulkSeasonalityAdjustment();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkSeasonalityAdjustment, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkSeasonalityAdjustment>() {
            @Override
            public BulkSeasonalityAdjustment get() {
                return new BulkSeasonalityAdjustment();
            }
        });
    }
    
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkSeasonalityAdjustment, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkSeasonalityAdjustment>() {
            @Override
            public BulkSeasonalityAdjustment get() {
                return new BulkSeasonalityAdjustment();
            }
        }, comparer);
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkSeasonalityAdjustment, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkSeasonalityAdjustment>() {
            @Override
            public BulkSeasonalityAdjustment get() {
                return new BulkSeasonalityAdjustment();
            }
        });
    }
        
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkSeasonalityAdjustment, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkSeasonalityAdjustment>() {
            @Override
            public BulkSeasonalityAdjustment get() {
                return new BulkSeasonalityAdjustment();
            }
        }, comparer);
    }
}
