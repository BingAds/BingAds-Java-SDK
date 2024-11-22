package com.microsoft.bingads.v13.api.test.entities.asset_group_url_target.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.asset_group_url_target.BulkAssetGroupUrlTargetTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAssetGroupUrlTarget;

@RunWith(Parameterized.class)
public class BulkAssetGroupUrlTargetReadFromRowValuesAssetGroupTargetValue2Test extends BulkAssetGroupUrlTargetTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"https://www.google.com", "https://www.google.com"},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Asset Group Target Value 2", this.datum, this.expectedResult, new Function<BulkAssetGroupUrlTarget, String>() {
            @Override
            public String apply(BulkAssetGroupUrlTarget c) {
                return c.getTargetValue2();
            }
        });
    }
}
