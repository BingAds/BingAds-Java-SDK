package com.microsoft.bingads.v13.api.test.entities.negative_keywords.account_negative_keyword_list_association;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAccountNegativeKeywordListAssociation;
import com.microsoft.bingads.v13.campaignmanagement.SharedEntityAssociation;

public abstract class BulkAccountNKListAssociationTest extends BulkEntityTest<BulkAccountNegativeKeywordListAssociation> {

    @Override
    protected void onEntityCreation(BulkAccountNegativeKeywordListAssociation entity) {
        entity.setSharedEntityAssociation(new SharedEntityAssociation());
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkAccountNegativeKeywordListAssociation, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkAccountNegativeKeywordListAssociation>() {
            @Override
            public BulkAccountNegativeKeywordListAssociation get() {
                return new BulkAccountNegativeKeywordListAssociation();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkAccountNegativeKeywordListAssociation, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAccountNegativeKeywordListAssociation>() {
            @Override
            public BulkAccountNegativeKeywordListAssociation get() {
                return new BulkAccountNegativeKeywordListAssociation();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkAccountNegativeKeywordListAssociation, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkAccountNegativeKeywordListAssociation>() {
            @Override
            public BulkAccountNegativeKeywordListAssociation get() {
                return new BulkAccountNegativeKeywordListAssociation();
            }
        });
    }
}
