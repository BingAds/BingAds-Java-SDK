package com.microsoft.bingads.v13.api.test.entities.asset_group.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.asset_group.BulkAssetGroupTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAssetGroup;

public class BulkAssetGroupWriteToRowValuesPath1Test extends BulkAssetGroupTest {

    @Parameterized.Parameter(value = 1)
    public String expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Text string", "Text string"},
                {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.testWriteProperty("Path 1", this.datum, this.expectedResult, new BiConsumer<BulkAssetGroup, String>() {
            @Override
            public void accept(BulkAssetGroup c, String v) {
                c.getAssetGroup().setPath1(v);
            }
        });
    }
}
