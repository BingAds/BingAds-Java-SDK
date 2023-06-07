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
public class BulkAssetGroupListingGroupReadFromRowValuesIsExcludedTest extends BulkAssetGroupListingGroupTest {

    @Parameter(value = 1)
    public Boolean expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"true", true},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<Boolean>testReadProperty("Is Excluded", this.datum, this.expectedResult, new Function<BulkAssetGroupListingGroup, Boolean>() {
            @Override
            public Boolean apply(BulkAssetGroupListingGroup c) {
                return c.getAssetGroupListingGroup().getIsExcluded();
            }
        });
    }
}
