package com.microsoft.bingads.v13.api.test.entities.asset_group_listing_group.read;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.asset_group_listing_group.BulkAssetGroupListingGroupTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAssetGroupListingGroup;
import com.microsoft.bingads.v13.campaignmanagement.AssetGroupListingType;

@RunWith(Parameterized.class)
public class BulkAssetGroupListingGroupReadFromRowValuesSubTypeTest extends BulkAssetGroupListingGroupTest {

    @Parameter(value = 1)
    public AssetGroupListingType expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"Unit", AssetGroupListingType.UNIT},
                        {"Subdivision", AssetGroupListingType.SUBDIVISION},
                        {"", null},
                        {null, null}
                }
        );
    }

    @Test
    public void testReadExcluded() {
        Map<String, String> values = new HashMap<String, String>();

        values.put("Is Excluded", "Yes");
        values.put("Sub Type", datum);

        testReadProperty(
                values,
                expectedResult,
                new Function<BulkAssetGroupListingGroup, AssetGroupListingType>() {
                    @Override
                    public AssetGroupListingType apply(BulkAssetGroupListingGroup c) {
                        return c.getAssetGroupListingGroup().getAssetGroupListingType();
                    }
                }
        );
    }

    @Test
    public void testReadNotExcluded() {
        Map<String, String> values = new HashMap<String, String>();

        values.put("Is Excluded", "No");
        values.put("Sub Type", datum);

        testReadProperty(
                values, expectedResult,
                new Function<BulkAssetGroupListingGroup, AssetGroupListingType>() {
                    @Override
                    public AssetGroupListingType apply(BulkAssetGroupListingGroup c) {
                        return c.getAssetGroupListingGroup().getAssetGroupListingType();
                    }
                }
        );
    }
}
