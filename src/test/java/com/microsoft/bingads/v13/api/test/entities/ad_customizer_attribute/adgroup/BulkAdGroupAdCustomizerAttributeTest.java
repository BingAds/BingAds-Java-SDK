package com.microsoft.bingads.v13.api.test.entities.ad_customizer_attribute.adgroup;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.api.test.entities.EqualityComparerWithDescription;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupAdCustomizerAttribute;

public abstract class BulkAdGroupAdCustomizerAttributeTest extends BulkEntityTest<BulkAdGroupAdCustomizerAttribute> {

    @Override
    protected void onEntityCreation(BulkAdGroupAdCustomizerAttribute entity) {
    	entity.setId("123");
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue,
            TProperty propertyValue,
            BiConsumer<BulkAdGroupAdCustomizerAttribute, TProperty> setFunc
    ) {
        testWriteProperty(
                header,
                expectedRowValue,
                propertyValue,
                setFunc,
                new Supplier<BulkAdGroupAdCustomizerAttribute>() {
                    @Override
                    public BulkAdGroupAdCustomizerAttribute get() {
                        return new BulkAdGroupAdCustomizerAttribute();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkAdGroupAdCustomizerAttribute, TProperty> actualValueFunc
    ) {
        testReadProperty(
                header,
                input,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkAdGroupAdCustomizerAttribute>() {
                    @Override
                    public BulkAdGroupAdCustomizerAttribute get() {
                        return new BulkAdGroupAdCustomizerAttribute();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkAdGroupAdCustomizerAttribute, TProperty> actualValueFunc
    ) {
        testReadProperty(
                rowValues,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkAdGroupAdCustomizerAttribute>() {
                    @Override
                    public BulkAdGroupAdCustomizerAttribute get() {
                        return new BulkAdGroupAdCustomizerAttribute();
                    }
                }
        );
    }

    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkAdGroupAdCustomizerAttribute, TProperty> actualValueFunc,
            EqualityComparerWithDescription<TProperty> comparer
    ) {
        testReadProperty(
                header,
                input,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkAdGroupAdCustomizerAttribute>() {
                    @Override
                    public BulkAdGroupAdCustomizerAttribute get() {
                        return new BulkAdGroupAdCustomizerAttribute();
                    }
                },
                comparer
        );
    }

    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkAdGroupAdCustomizerAttribute, TProperty> actualValueFunc,
            EqualityComparerWithDescription<TProperty> comparer
    ) {
        testReadProperty(
                rowValues,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkAdGroupAdCustomizerAttribute>() {
                    @Override
                    public BulkAdGroupAdCustomizerAttribute get() {
                        return new BulkAdGroupAdCustomizerAttribute();
                    }
                },
                comparer
        );
    }
	
}
