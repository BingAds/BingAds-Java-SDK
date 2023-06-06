package com.microsoft.bingads.v13.api.test.entities.asset_group.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.asset_group.BulkAssetGroupTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAssetGroup;
import com.microsoft.bingads.v13.campaignmanagement.AssetGroupEditorialStatus;

@RunWith(Parameterized.class)
public class BulkAssetGroupWriteToRowValuesEditorialStatusTest extends BulkAssetGroupTest {

    @Parameter(value = 1)
    public AssetGroupEditorialStatus propertyValue;

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
    public void testWrite() {
        this.<AssetGroupEditorialStatus>testWriteProperty("Editorial Status", this.datum, this.propertyValue, new BiConsumer<BulkAssetGroup, AssetGroupEditorialStatus>() {
            @Override
            public void accept(BulkAssetGroup c, AssetGroupEditorialStatus v) {
                c.getAssetGroup().setEditorialStatus(v);
            }
        });
    }
}
