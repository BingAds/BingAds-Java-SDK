package com.microsoft.bingads.v13.api.test.entities.asset_group_listing_group.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.asset_group_listing_group.BulkAssetGroupListingGroupTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAssetGroupListingGroup;

@RunWith(Parameterized.class)
public class BulkAssetGroupListingGroupReadFromRowValuesCampaignTest extends BulkAssetGroupListingGroupTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"CampaignName", "CampaignName"},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Campaign", this.datum, this.expectedResult, new Function<BulkAssetGroupListingGroup, String>() {
            @Override
            public String apply(BulkAssetGroupListingGroup c) {
                return c.getCampaignName();
            }
        });
    }
}
