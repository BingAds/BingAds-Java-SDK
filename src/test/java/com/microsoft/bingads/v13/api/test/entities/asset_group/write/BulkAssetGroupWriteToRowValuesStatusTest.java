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
import com.microsoft.bingads.v13.campaignmanagement.AssetGroupStatus;

@RunWith(Parameterized.class)
public class BulkAssetGroupWriteToRowValuesStatusTest extends BulkAssetGroupTest {

    @Parameter(value = 1)
    public AssetGroupStatus propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
    	return Arrays.asList(new Object[][]{
            {"Active", AssetGroupStatus.ACTIVE},
            {"Paused", AssetGroupStatus.PAUSED},
            {"Deleted", AssetGroupStatus.DELETED}
        });
    }

    @Test
    public void testWrite() {
        this.<AssetGroupStatus>testWriteProperty("Status", this.datum, this.propertyValue, new BiConsumer<BulkAssetGroup, AssetGroupStatus>() {
            @Override
            public void accept(BulkAssetGroup c, AssetGroupStatus v) {
                c.getAssetGroup().setStatus(v);
            }
        });
    }
}
