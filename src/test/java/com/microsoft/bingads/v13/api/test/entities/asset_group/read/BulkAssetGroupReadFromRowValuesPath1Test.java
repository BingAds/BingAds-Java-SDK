package com.microsoft.bingads.v13.api.test.entities.asset_group.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.asset_group.BulkAssetGroupTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAssetGroup;

public class BulkAssetGroupReadFromRowValuesPath1Test extends BulkAssetGroupTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Path 1 string", "Path 1 string"},
                {null, null}
        });
    }

    @Test
    public void testRead() {
        this.testReadProperty("Path 1", this.datum, this.expectedResult, new Function<BulkAssetGroup, String>() {
            @Override
            public String apply(BulkAssetGroup c) {
                return c.getAssetGroup().getPath1();
            }
        });
    }
}
