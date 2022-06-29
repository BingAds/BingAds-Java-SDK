package com.microsoft.bingads.v13.api.test.entities.ad_customizer_attribute.keyword;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.api.test.entities.EqualityComparerWithDescription;
import com.microsoft.bingads.v13.bulk.entities.BulkKeywordAdCustomizerAttribute;

public abstract class BulkKeywordAdCustomizerAttributeTest extends BulkEntityTest<BulkKeywordAdCustomizerAttribute> {

    @Override
    protected void onEntityCreation(BulkKeywordAdCustomizerAttribute entity) {
    	entity.setId("123");
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue,
            TProperty propertyValue,
            BiConsumer<BulkKeywordAdCustomizerAttribute, TProperty> setFunc
    ) {
        testWriteProperty(
                header,
                expectedRowValue,
                propertyValue,
                setFunc,
                new Supplier<BulkKeywordAdCustomizerAttribute>() {
                    @Override
                    public BulkKeywordAdCustomizerAttribute get() {
                        return new BulkKeywordAdCustomizerAttribute();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkKeywordAdCustomizerAttribute, TProperty> actualValueFunc
    ) {
        testReadProperty(
                header,
                input,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkKeywordAdCustomizerAttribute>() {
                    @Override
                    public BulkKeywordAdCustomizerAttribute get() {
                        return new BulkKeywordAdCustomizerAttribute();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkKeywordAdCustomizerAttribute, TProperty> actualValueFunc
    ) {
        testReadProperty(
                rowValues,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkKeywordAdCustomizerAttribute>() {
                    @Override
                    public BulkKeywordAdCustomizerAttribute get() {
                        return new BulkKeywordAdCustomizerAttribute();
                    }
                }
        );
    }

    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkKeywordAdCustomizerAttribute, TProperty> actualValueFunc,
            EqualityComparerWithDescription<TProperty> comparer
    ) {
        testReadProperty(
                header,
                input,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkKeywordAdCustomizerAttribute>() {
                    @Override
                    public BulkKeywordAdCustomizerAttribute get() {
                        return new BulkKeywordAdCustomizerAttribute();
                    }
                },
                comparer
        );
    }

    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkKeywordAdCustomizerAttribute, TProperty> actualValueFunc,
            EqualityComparerWithDescription<TProperty> comparer
    ) {
        testReadProperty(
                rowValues,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkKeywordAdCustomizerAttribute>() {
                    @Override
                    public BulkKeywordAdCustomizerAttribute get() {
                        return new BulkKeywordAdCustomizerAttribute();
                    }
                },
                comparer
        );
    }
	
}
