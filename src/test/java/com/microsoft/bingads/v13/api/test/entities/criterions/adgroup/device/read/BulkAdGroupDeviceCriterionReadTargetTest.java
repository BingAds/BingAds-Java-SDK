package com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.device.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.device.BulkAdGroupDeviceCriterionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupDeviceCriterion;
import com.microsoft.bingads.v13.campaignmanagement.DeviceCriterion;

@RunWith(Parameterized.class)
public class BulkAdGroupDeviceCriterionReadTargetTest extends BulkAdGroupDeviceCriterionTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"Computers", "Computers"},
                        {"Smartphones", "Smartphones"},
                        {"", ""},
                        {null, null}
                }
        );
    }

    @Test
    public void testRead() {
        testReadProperty(
                "Target",
                datum,
                expectedResult,
                new Function<BulkAdGroupDeviceCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupDeviceCriterion c) {
                        return ((DeviceCriterion)c.getBiddableAdGroupCriterion().getCriterion()).getDeviceName();
                    }
                }
        );
    }
}
