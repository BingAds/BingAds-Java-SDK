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
import com.microsoft.bingads.v13.campaignmanagement.CallToAction;

@RunWith(Parameterized.class)
public class BulkAssetGroupReadFromRowValuesCallToActionTest extends BulkAssetGroupTest {

    @Parameter(value = 1)
    public CallToAction expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Unknown", CallToAction.UNKNOWN},
            {"ActNow", CallToAction.ACT_NOW}
        });
    }

    @Test
    public void testRead() {
        this.<CallToAction>testReadProperty("Call To Action", this.datum, this.expectedResult, new Function<BulkAssetGroup, CallToAction>() {
            @Override
            public CallToAction apply(BulkAssetGroup c) {
                return c.getAssetGroup().getCallToAction();
            }
        });
    }
}
