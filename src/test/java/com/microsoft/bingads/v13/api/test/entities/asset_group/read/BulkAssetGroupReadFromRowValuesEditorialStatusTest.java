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
import com.microsoft.bingads.v13.campaignmanagement.AssetGroupEditorialStatus;

@RunWith(Parameterized.class)
public class BulkAssetGroupReadFromRowValuesEditorialStatusTest extends BulkAssetGroupTest {

    @Parameter(value = 1)
    public AssetGroupEditorialStatus expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Active", AssetGroupEditorialStatus.ACTIVE},
            {"Disapproved", AssetGroupEditorialStatus.DISAPPROVED},
            {"Inactive", AssetGroupEditorialStatus.INACTIVE},
            {"ActiveLimited", AssetGroupEditorialStatus.ACTIVE_LIMITED}
        });
    }

    @Test
    public void testRead() {
        this.<AssetGroupEditorialStatus>testReadProperty("Editorial Status", this.datum, this.expectedResult, new Function<BulkAssetGroup, AssetGroupEditorialStatus>() {
            @Override
            public AssetGroupEditorialStatus apply(BulkAssetGroup c) {
                return c.getAssetGroup().getEditorialStatus();
            }
        });
    }
}
