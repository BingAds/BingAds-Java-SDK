package com.microsoft.bingads.v11.api.test.entities.adgroup.write;

import com.microsoft.bingads.v11.api.test.entities.adgroup.BulkAdGroupTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroup;
import com.microsoft.bingads.v11.campaignmanagement.RemarketingTargetingSetting;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkAdGroupWriteToRowValuesRemarketingTargetingSettingTests extends BulkAdGroupTest {

    @Parameter(value = 1)
    public RemarketingTargetingSetting propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        // In this example, the parameter generator returns a List of
        // arrays.  Each array has two elements: { datum, expected }.
        // These data are hard-coded into the class, but they could be
        // generated or loaded in any way you like.
        return Arrays.asList(new Object[][]{
            {"BidOnly", RemarketingTargetingSetting.BID_ONLY},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<RemarketingTargetingSetting>testWriteProperty("Remarketing Targeting Setting", this.datum, this.propertyValue, new BiConsumer<BulkAdGroup, RemarketingTargetingSetting>() {
            @Override
            public void accept(BulkAdGroup c, RemarketingTargetingSetting v) {
                c.getAdGroup().setRemarketingTargetingSetting(v);;
            }
        });
    }
}
