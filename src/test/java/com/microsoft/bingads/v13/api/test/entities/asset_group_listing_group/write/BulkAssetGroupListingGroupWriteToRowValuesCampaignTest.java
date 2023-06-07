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

@RunWith(Parameterized.class)
public class BulkAssetGroupListingGroupWriteToRowValuesCampaignTest extends BulkAssetGroupListingGroupTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
    	return Arrays.asList(new Object[][]{
            {"Campaign", "Campaign"},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Campaign", this.datum, this.propertyValue, new BiConsumer<BulkAssetGroupListingGroup, String>() {
            @Override
            public void accept(BulkAssetGroupListingGroup c, String v) {
                c.setCampaignName(v);
            }
        });
    }
}
