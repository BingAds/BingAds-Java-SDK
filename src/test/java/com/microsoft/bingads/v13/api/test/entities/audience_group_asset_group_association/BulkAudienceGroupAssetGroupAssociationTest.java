package com.microsoft.bingads.v13.api.test.entities.audience_group_asset_group_association;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.api.test.entities.EqualityComparerWithDescription;
import com.microsoft.bingads.v13.bulk.entities.BulkAudienceGroupAssetGroupAssociation;
import com.microsoft.bingads.v13.campaignmanagement.AudienceGroupAssetGroupAssociation;

public abstract class BulkAudienceGroupAssetGroupAssociationTest extends BulkEntityTest<BulkAudienceGroupAssetGroupAssociation> {

    @Override
    protected void onEntityCreation(BulkAudienceGroupAssetGroupAssociation entity) {
    	AudienceGroupAssetGroupAssociation audienceGroupAssetGroupAssociation = new AudienceGroupAssetGroupAssociation();
    	audienceGroupAssetGroupAssociation.setAssetGroupId(10L);
    	audienceGroupAssetGroupAssociation.setAudienceGroupId(100L);
        entity.setAudienceGroupAssetGroupAssociation(audienceGroupAssetGroupAssociation);
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkAudienceGroupAssetGroupAssociation, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkAudienceGroupAssetGroupAssociation>() {
            @Override
            public BulkAudienceGroupAssetGroupAssociation get() {
                return new BulkAudienceGroupAssetGroupAssociation();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkAudienceGroupAssetGroupAssociation, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAudienceGroupAssetGroupAssociation>() {
            @Override
            public BulkAudienceGroupAssetGroupAssociation get() {
                return new BulkAudienceGroupAssetGroupAssociation();
            }
        });
    }
    
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkAudienceGroupAssetGroupAssociation, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAudienceGroupAssetGroupAssociation>() {
            @Override
            public BulkAudienceGroupAssetGroupAssociation get() {
                return new BulkAudienceGroupAssetGroupAssociation();
            }
        }, comparer);
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkAudienceGroupAssetGroupAssociation, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkAudienceGroupAssetGroupAssociation>() {
            @Override
            public BulkAudienceGroupAssetGroupAssociation get() {
                return new BulkAudienceGroupAssetGroupAssociation();
            }
        });
    }
        
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkAudienceGroupAssetGroupAssociation, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkAudienceGroupAssetGroupAssociation>() {
            @Override
            public BulkAudienceGroupAssetGroupAssociation get() {
                return new BulkAudienceGroupAssetGroupAssociation();
            }
        }, comparer);
    }
}
