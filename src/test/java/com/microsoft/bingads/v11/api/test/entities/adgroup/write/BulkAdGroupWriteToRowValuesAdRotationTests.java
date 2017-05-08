package com.microsoft.bingads.v11.api.test.entities.adgroup.write;

import com.microsoft.bingads.v11.api.test.entities.adgroup.BulkAdGroupTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroup;
import com.microsoft.bingads.v11.campaignmanagement.AdRotation;
import com.microsoft.bingads.v11.campaignmanagement.AdRotationType;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkAdGroupWriteToRowValuesAdRotationTests extends BulkAdGroupTest {

    @Parameter(value = 1)
    public AdRotationType propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        // In this example, the parameter generator returns a List of
        // arrays.  Each array has two elements: { datum, expected }.
        // These data are hard-coded into the class, but they could be
        // generated or loaded in any way you like.
        return Arrays.asList(new Object[][]{
            {"OptimizeForClicks", AdRotationType.OPTIMIZE_FOR_CLICKS},
            {"RotateAdsEvenly", AdRotationType.ROTATE_ADS_EVENLY},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        AdRotation rotation = new AdRotation();
        rotation.setType(this.propertyValue);
        this.<AdRotation>testWriteProperty("Ad Rotation", this.datum, rotation, new BiConsumer<BulkAdGroup, AdRotation>() {
            @Override
            public void accept(BulkAdGroup c, AdRotation v) {
                c.getAdGroup().setAdRotation(v);
            }
        });
    }
}
