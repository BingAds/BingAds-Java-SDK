package com.microsoft.bingads.v13.api.test.entities.account_placement_exclusion_list;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.api.test.entities.EqualityComparerWithDescription;
import com.microsoft.bingads.v13.bulk.entities.BulkAccountPlacementExclusionListAssociation;
import com.microsoft.bingads.v13.campaignmanagement.SharedEntityAssociation;

public abstract class BulkAccountPlacementExclusionListAssociationTest extends BulkEntityTest<BulkAccountPlacementExclusionListAssociation> {

    @Override
    protected void onEntityCreation(BulkAccountPlacementExclusionListAssociation entity) {
    	SharedEntityAssociation sharedEntityAssociation = new SharedEntityAssociation();
    	sharedEntityAssociation.setSharedEntityId(100L);
        entity.setSharedEntityAssociation(sharedEntityAssociation);
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkAccountPlacementExclusionListAssociation, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkAccountPlacementExclusionListAssociation>() {
            @Override
            public BulkAccountPlacementExclusionListAssociation get() {
                return new BulkAccountPlacementExclusionListAssociation();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkAccountPlacementExclusionListAssociation, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAccountPlacementExclusionListAssociation>() {
            @Override
            public BulkAccountPlacementExclusionListAssociation get() {
                return new BulkAccountPlacementExclusionListAssociation();
            }
        });
    }
    
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkAccountPlacementExclusionListAssociation, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAccountPlacementExclusionListAssociation>() {
            @Override
            public BulkAccountPlacementExclusionListAssociation get() {
                return new BulkAccountPlacementExclusionListAssociation();
            }
        }, comparer);
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkAccountPlacementExclusionListAssociation, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkAccountPlacementExclusionListAssociation>() {
            @Override
            public BulkAccountPlacementExclusionListAssociation get() {
                return new BulkAccountPlacementExclusionListAssociation();
            }
        });
    }
        
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkAccountPlacementExclusionListAssociation, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkAccountPlacementExclusionListAssociation>() {
            @Override
            public BulkAccountPlacementExclusionListAssociation get() {
                return new BulkAccountPlacementExclusionListAssociation();
            }
        }, comparer);
    }
}
