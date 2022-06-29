package com.microsoft.bingads.v13.api.test.entities.ad_customizer_attribute.campaign;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.api.test.entities.EqualityComparerWithDescription;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignAdCustomizerAttribute;

public abstract class BulkCampaignAdCustomizerAttributeTest extends BulkEntityTest<BulkCampaignAdCustomizerAttribute> {

    @Override
    protected void onEntityCreation(BulkCampaignAdCustomizerAttribute entity) {
    	entity.setId("123");
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue,
            TProperty propertyValue,
            BiConsumer<BulkCampaignAdCustomizerAttribute, TProperty> setFunc
    ) {
        testWriteProperty(
                header,
                expectedRowValue,
                propertyValue,
                setFunc,
                new Supplier<BulkCampaignAdCustomizerAttribute>() {
                    @Override
                    public BulkCampaignAdCustomizerAttribute get() {
                        return new BulkCampaignAdCustomizerAttribute();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkCampaignAdCustomizerAttribute, TProperty> actualValueFunc
    ) {
        testReadProperty(
                header,
                input,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkCampaignAdCustomizerAttribute>() {
                    @Override
                    public BulkCampaignAdCustomizerAttribute get() {
                        return new BulkCampaignAdCustomizerAttribute();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkCampaignAdCustomizerAttribute, TProperty> actualValueFunc
    ) {
        testReadProperty(
                rowValues,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkCampaignAdCustomizerAttribute>() {
                    @Override
                    public BulkCampaignAdCustomizerAttribute get() {
                        return new BulkCampaignAdCustomizerAttribute();
                    }
                }
        );
    }

    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkCampaignAdCustomizerAttribute, TProperty> actualValueFunc,
            EqualityComparerWithDescription<TProperty> comparer
    ) {
        testReadProperty(
                header,
                input,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkCampaignAdCustomizerAttribute>() {
                    @Override
                    public BulkCampaignAdCustomizerAttribute get() {
                        return new BulkCampaignAdCustomizerAttribute();
                    }
                },
                comparer
        );
    }

    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkCampaignAdCustomizerAttribute, TProperty> actualValueFunc,
            EqualityComparerWithDescription<TProperty> comparer
    ) {
        testReadProperty(
                rowValues,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkCampaignAdCustomizerAttribute>() {
                    @Override
                    public BulkCampaignAdCustomizerAttribute get() {
                        return new BulkCampaignAdCustomizerAttribute();
                    }
                },
                comparer
        );
    }
	
}
