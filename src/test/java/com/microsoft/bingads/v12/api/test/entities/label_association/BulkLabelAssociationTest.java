package com.microsoft.bingads.v12.api.test.entities.label_association;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v12.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v12.bulk.entities.BulkCampaignLabel;
import com.microsoft.bingads.v12.campaignmanagement.LabelAssociation;

public abstract class BulkLabelAssociationTest extends BulkEntityTest<BulkCampaignLabel> {

    @Override
    protected void onEntityCreation(BulkCampaignLabel entity) {
        entity.setLabelAssociation(new LabelAssociation());
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
                                                 String expectedRowValue, TProperty propertyValue,
                                                 BiConsumer<BulkCampaignLabel, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkCampaignLabel>() {
            @Override
            public BulkCampaignLabel get() {
                return new BulkCampaignLabel();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkCampaignLabel, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkCampaignLabel>() {
            @Override
            public BulkCampaignLabel get() {
                return new BulkCampaignLabel();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkCampaignLabel, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkCampaignLabel>() {
            @Override
            public BulkCampaignLabel get() {
                return new BulkCampaignLabel();
            }
        });
    }
}
