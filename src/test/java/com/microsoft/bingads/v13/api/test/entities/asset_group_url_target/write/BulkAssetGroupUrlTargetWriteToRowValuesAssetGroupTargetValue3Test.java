package com.microsoft.bingads.v13.api.test.entities.asset_group_url_target.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.asset_group_url_target.BulkAssetGroupUrlTargetTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAssetGroupUrlTarget;

@RunWith(Parameterized.class)
public class BulkAssetGroupUrlTargetWriteToRowValuesAssetGroupTargetValue3Test extends BulkAssetGroupUrlTargetTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
    	return Arrays.asList(new Object[][]{
            {"https://www.google.com", "https://www.google.com"},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Asset Group Target Value 3", this.datum, this.propertyValue, new BiConsumer<BulkAssetGroupUrlTarget, String>() {
            @Override
            public void accept(BulkAssetGroupUrlTarget c, String v) {
                c.setTargetValue3(v);
            }
        });
    }
}
