package com.microsoft.bingads.v13.api.test.entities.ad_customizer_attribute;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.api.test.entities.EqualityComparerWithDescription;
import com.microsoft.bingads.v13.bulk.entities.BulkAdCustomizerAttribute;

public abstract class BulkAdCustomizerAttributeTest extends BulkEntityTest<BulkAdCustomizerAttribute> {

    @Override
    protected void onEntityCreation(BulkAdCustomizerAttribute entity) {
    	entity.setId("123");
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue,
            TProperty propertyValue,
            BiConsumer<BulkAdCustomizerAttribute, TProperty> setFunc
    ) {
        testWriteProperty(
                header,
                expectedRowValue,
                propertyValue,
                setFunc,
                new Supplier<BulkAdCustomizerAttribute>() {
                    @Override
                    public BulkAdCustomizerAttribute get() {
                        return new BulkAdCustomizerAttribute();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkAdCustomizerAttribute, TProperty> actualValueFunc
    ) {
        testReadProperty(
                header,
                input,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkAdCustomizerAttribute>() {
                    @Override
                    public BulkAdCustomizerAttribute get() {
                        return new BulkAdCustomizerAttribute();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkAdCustomizerAttribute, TProperty> actualValueFunc
    ) {
        testReadProperty(
                rowValues,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkAdCustomizerAttribute>() {
                    @Override
                    public BulkAdCustomizerAttribute get() {
                        return new BulkAdCustomizerAttribute();
                    }
                }
        );
    }

    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkAdCustomizerAttribute, TProperty> actualValueFunc,
            EqualityComparerWithDescription<TProperty> comparer
    ) {
        testReadProperty(
                header,
                input,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkAdCustomizerAttribute>() {
                    @Override
                    public BulkAdCustomizerAttribute get() {
                        return new BulkAdCustomizerAttribute();
                    }
                },
                comparer
        );
    }

    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkAdCustomizerAttribute, TProperty> actualValueFunc,
            EqualityComparerWithDescription<TProperty> comparer
    ) {
        testReadProperty(
                rowValues,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkAdCustomizerAttribute>() {
                    @Override
                    public BulkAdCustomizerAttribute get() {
                        return new BulkAdCustomizerAttribute();
                    }
                },
                comparer
        );
    }
	
}
