package com.microsoft.bingads.v13.api.test.entities.asset_group_listing_group.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.asset_group_listing_group.BulkAssetGroupListingGroupTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAssetGroupListingGroup;
import com.microsoft.bingads.v13.campaignmanagement.AdGroupCriterion;
import com.microsoft.bingads.v13.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.v13.campaignmanagement.NegativeAdGroupCriterion;
import com.microsoft.bingads.v13.campaignmanagement.ProductCondition;
import com.microsoft.bingads.v13.campaignmanagement.ProductPartition;

public class BulkAssetGroupListingGroupWriteToRowValuesProductValue1Test extends BulkAssetGroupListingGroupTest {
    @Parameterized.Parameter(value = 1)
    public String propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"123", "123"},
                        {"XXX YYY", "XXX YYY"},
                        {"", ""},
                        {null, null}
                }
        );
    }

    @Test
    public void testWriteExcluded() {
        testWriteProperty(
                "Product Value 1",
                datum,
                propertyValue,
                new BiConsumer<BulkAssetGroupListingGroup, String>() {

                    @Override
                    public void accept(BulkAssetGroupListingGroup c, String v) {
                    	c.getAssetGroupListingGroup().getDimension().setAttribute(v);
                    }
                }
        );
    }

    @Test
    public void testWriteNotExcluded() {
        testWriteProperty(
                "Product Value 1",
                datum,
                propertyValue,
                new BiConsumer<BulkAssetGroupListingGroup, String>() {
                    @Override
                    public void accept(BulkAssetGroupListingGroup c, String v) {
                    	c.getAssetGroupListingGroup().getDimension().setAttribute(v);
                    }
                }
        );
    }
}
