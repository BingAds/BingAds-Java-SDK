package com.microsoft.bingads.v13.api.test.entities.adgroup.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.adgroup.BulkAdGroupTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroup;
import com.microsoft.bingads.v13.campaignmanagement.AdRotationType;

@RunWith(Parameterized.class)
public class BulkAdGroupReadFromRowValuesAdRotationTest extends BulkAdGroupTest {

    @Parameter
    public String datum;

    @Parameter(value = 1)
    public AdRotationType expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"OptimizeForClicks", AdRotationType.OPTIMIZE_FOR_CLICKS},
            {"RotateAdsEvenly", AdRotationType.ROTATE_ADS_EVENLY},});
    }

    @Test
    public void testRead() {
        this.<AdRotationType>testReadProperty("Ad Rotation", this.datum, this.expectedResult, new Function<BulkAdGroup, AdRotationType>() {
            @Override
            public AdRotationType apply(BulkAdGroup c) {
                return c.getAdGroup().getAdRotation().getType();
            }
        });
    }
}
