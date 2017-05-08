package com.microsoft.bingads.v11.api.test.entities.adgroup_remarketing_list_association;

import com.microsoft.bingads.v11.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v11.api.test.entities.EqualityComparerWithDescription;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupRemarketingListAssociation;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;

import java.util.Map;

public abstract class BulkAdGroupRemarketingListAssociationTest extends BulkEntityTest<BulkAdGroupRemarketingListAssociation> {

    @Override
    protected void onEntityCreation(BulkAdGroupRemarketingListAssociation entity) {
//        entity.setAdGroupRemarketingListAssociation(new AdGroupRemarketingListAssociation());
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkAdGroupRemarketingListAssociation, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkAdGroupRemarketingListAssociation>() {
            @Override
            public BulkAdGroupRemarketingListAssociation get() {
                return new BulkAdGroupRemarketingListAssociation();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkAdGroupRemarketingListAssociation, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAdGroupRemarketingListAssociation>() {
            @Override
            public BulkAdGroupRemarketingListAssociation get() {
                return new BulkAdGroupRemarketingListAssociation();
            }
        });
    }
    
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkAdGroupRemarketingListAssociation, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAdGroupRemarketingListAssociation>() {
            @Override
            public BulkAdGroupRemarketingListAssociation get() {
                return new BulkAdGroupRemarketingListAssociation();
            }
        }, comparer);
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkAdGroupRemarketingListAssociation, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkAdGroupRemarketingListAssociation>() {
            @Override
            public BulkAdGroupRemarketingListAssociation get() {
                return new BulkAdGroupRemarketingListAssociation();
            }
        });
    }
}
