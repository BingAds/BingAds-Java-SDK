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
public class BulkAssetGroupUrlTargetWriteToRowValuesAssetGroupTargetConditionOperator3Test extends BulkAssetGroupUrlTargetTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
    	return Arrays.asList(new Object[][]{
            {"Contains", "Contains"},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Asset Group Target Condition Operator 3", this.datum, this.propertyValue, new BiConsumer<BulkAssetGroupUrlTarget, String>() {
            @Override
            public void accept(BulkAssetGroupUrlTarget c, String v) {
                c.setTargetConditionOperator3(v);
            }
        });
    }
}
