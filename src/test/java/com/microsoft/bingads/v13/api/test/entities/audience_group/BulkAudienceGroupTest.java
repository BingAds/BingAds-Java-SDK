package com.microsoft.bingads.v13.api.test.entities.audience_group;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.api.test.entities.EqualityComparerWithDescription;
import com.microsoft.bingads.v13.bulk.entities.BulkAudienceGroup;
import com.microsoft.bingads.v13.campaignmanagement.AudienceGroup;

public abstract class BulkAudienceGroupTest extends BulkEntityTest<BulkAudienceGroup> {

    @Override
    protected void onEntityCreation(BulkAudienceGroup entity) {
        AudienceGroup AudienceGroup = new AudienceGroup();
        AudienceGroup.setId(100L);
        entity.setAudienceGroup(AudienceGroup);
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkAudienceGroup, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkAudienceGroup>() {
            @Override
            public BulkAudienceGroup get() {
                return new BulkAudienceGroup();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkAudienceGroup, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAudienceGroup>() {
            @Override
            public BulkAudienceGroup get() {
                return new BulkAudienceGroup();
            }
        });
    }
    
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkAudienceGroup, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAudienceGroup>() {
            @Override
            public BulkAudienceGroup get() {
                return new BulkAudienceGroup();
            }
        }, comparer);
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkAudienceGroup, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkAudienceGroup>() {
            @Override
            public BulkAudienceGroup get() {
                return new BulkAudienceGroup();
            }
        });
    }
        
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkAudienceGroup, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkAudienceGroup>() {
            @Override
            public BulkAudienceGroup get() {
                return new BulkAudienceGroup();
            }
        }, comparer);
    }
}
