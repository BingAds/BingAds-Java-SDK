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
public class BulkAssetGroupListingGroupReadFromRowValuesParentListingGroupIdTest extends BulkAssetGroupListingGroupTest {

    @Parameter(value = 1)
    public Long expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"123", 123L},
            {"9223372036854775807", 9223372036854775807L},
            {"", null},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<Long>testReadProperty("Parent Listing Group Id", this.datum, this.expectedResult, new Function<BulkAssetGroupListingGroup, Long>() {
            @Override
            public Long apply(BulkAssetGroupListingGroup c) {
                return c.getAssetGroupListingGroup().getParentListingGroupId();
            }
        });
    }
}
