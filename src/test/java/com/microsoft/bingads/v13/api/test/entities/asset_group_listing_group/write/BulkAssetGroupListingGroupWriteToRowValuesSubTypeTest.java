package com.microsoft.bingads.v13.api.test.entities.asset_group_listing_group.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.asset_group_listing_group.BulkAssetGroupListingGroupTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAssetGroupListingGroup;
import com.microsoft.bingads.v13.campaignmanagement.AssetGroupListingType;

@RunWith(Parameterized.class)
public class BulkAssetGroupListingGroupWriteToRowValuesSubTypeTest extends BulkAssetGroupListingGroupTest {

    @Parameter(value = 1)
    public AssetGroupListingType propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
    	return Arrays.asList(new Object[][]{
            {"Subdivision", AssetGroupListingType.SUBDIVISION},
            {"Unit", AssetGroupListingType.UNIT},
            {null, null}
    	});
    }

    @Test
    public void testWriteExcluded() {
        testWriteProperty(
                "Sub Type",
                datum,
                propertyValue,
                new BiConsumer<BulkAssetGroupListingGroup, AssetGroupListingType>() {
                    @Override
                    public void accept(BulkAssetGroupListingGroup c, AssetGroupListingType v) {
                    	c.getAssetGroupListingGroup().setAssetGroupListingType(v);
                    }
                }
        );
    }

    @Test
    public void testWriteNotExcluded() {
        testWriteProperty(
                "Sub Type",
                datum,
                propertyValue,
                new BiConsumer<BulkAssetGroupListingGroup, AssetGroupListingType>() {
                    @Override
                    public void accept(BulkAssetGroupListingGroup c, AssetGroupListingType v) {
                    	c.getAssetGroupListingGroup().setAssetGroupListingType(v);
                    }
                }
        );
    }
}
