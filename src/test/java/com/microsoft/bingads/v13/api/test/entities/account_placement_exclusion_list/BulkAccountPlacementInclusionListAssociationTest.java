package com.microsoft.bingads.v13.api.test.entities.account_placement_exclusion_list;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.api.test.entities.EqualityComparerWithDescription;
import com.microsoft.bingads.v13.bulk.entities.BulkAccountPlacementInclusionListAssociation;
import com.microsoft.bingads.v13.campaignmanagement.SharedEntityAssociation;

public abstract class BulkAccountPlacementInclusionListAssociationTest extends BulkEntityTest<BulkAccountPlacementInclusionListAssociation> {

    @Override
    protected void onEntityCreation(BulkAccountPlacementInclusionListAssociation entity) {
    	SharedEntityAssociation sharedEntityAssociation = new SharedEntityAssociation();
    	sharedEntityAssociation.setSharedEntityId(100L);
        entity.setSharedEntityAssociation(sharedEntityAssociation);
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkAccountPlacementInclusionListAssociation, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkAccountPlacementInclusionListAssociation>() {
            @Override
            public BulkAccountPlacementInclusionListAssociation get() {
                return new BulkAccountPlacementInclusionListAssociation();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkAccountPlacementInclusionListAssociation, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAccountPlacementInclusionListAssociation>() {
            @Override
            public BulkAccountPlacementInclusionListAssociation get() {
                return new BulkAccountPlacementInclusionListAssociation();
            }
        });
    }
    
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkAccountPlacementInclusionListAssociation, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAccountPlacementInclusionListAssociation>() {
            @Override
            public BulkAccountPlacementInclusionListAssociation get() {
                return new BulkAccountPlacementInclusionListAssociation();
            }
        }, comparer);
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkAccountPlacementInclusionListAssociation, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkAccountPlacementInclusionListAssociation>() {
            @Override
            public BulkAccountPlacementInclusionListAssociation get() {
                return new BulkAccountPlacementInclusionListAssociation();
            }
        });
    }
        
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkAccountPlacementInclusionListAssociation, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkAccountPlacementInclusionListAssociation>() {
            @Override
            public BulkAccountPlacementInclusionListAssociation get() {
                return new BulkAccountPlacementInclusionListAssociation();
            }
        }, comparer);
    }
}
