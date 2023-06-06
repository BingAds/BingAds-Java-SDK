package com.microsoft.bingads.v13.api.test.entities.asset_group.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.asset_group.BulkAssetGroupTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAssetGroup;
import com.microsoft.bingads.v13.campaignmanagement.AssetGroupStatus;

@RunWith(Parameterized.class)
public class BulkAssetGroupReadFromRowValuesStatusTest extends BulkAssetGroupTest {

    @Parameter(value = 1)
    public AssetGroupStatus expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Active", AssetGroupStatus.ACTIVE},
            {"Paused", AssetGroupStatus.PAUSED},
            {"Deleted", AssetGroupStatus.DELETED}
        });
    }

    @Test
    public void testRead() {
        this.<AssetGroupStatus>testReadProperty("Status", this.datum, this.expectedResult, new Function<BulkAssetGroup, AssetGroupStatus>() {
            @Override
            public AssetGroupStatus apply(BulkAssetGroup c) {
                return c.getAssetGroup().getStatus();
            }
        });
    }
}
