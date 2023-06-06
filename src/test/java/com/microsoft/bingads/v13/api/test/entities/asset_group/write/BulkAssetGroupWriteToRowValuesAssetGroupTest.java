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

@RunWith(Parameterized.class)
public class BulkAssetGroupWriteToRowValuesAssetGroupTest extends BulkAssetGroupTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
    	return Arrays.asList(new Object[][]{
    		{"AssetGroupName", "AssetGroupName"},
            {null, null}
    	});
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Asset Group", this.datum, this.propertyValue, new BiConsumer<BulkAssetGroup, String>() {
            @Override
            public void accept(BulkAssetGroup c, String v) {
                c.getAssetGroup().setName(v);
            }
        });
    }
}
