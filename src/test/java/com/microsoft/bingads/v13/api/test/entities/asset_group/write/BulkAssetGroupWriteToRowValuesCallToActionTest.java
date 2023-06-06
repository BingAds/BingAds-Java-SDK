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
import com.microsoft.bingads.v13.campaignmanagement.CallToAction;

@RunWith(Parameterized.class)
public class BulkAssetGroupWriteToRowValuesCallToActionTest extends BulkAssetGroupTest {

    @Parameter(value = 1)
    public CallToAction propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
    	return Arrays.asList(new Object[][]{
    		{"Unknown", CallToAction.UNKNOWN},
            {"ActNow", CallToAction.ACT_NOW}
    	});
    }

    @Test
    public void testWrite() {
        this.<CallToAction>testWriteProperty("Call To Action", this.datum, this.propertyValue, new BiConsumer<BulkAssetGroup, CallToAction>() {
            @Override
            public void accept(BulkAssetGroup c, CallToAction v) {
                c.getAssetGroup().setCallToAction(v);
            }
        });
    }
}
