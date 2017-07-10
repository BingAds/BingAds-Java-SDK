package com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.device.read;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.device.BulkAdGroupDeviceCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupDeviceCriterion;
import com.microsoft.bingads.v11.campaignmanagement.DeviceCriterion;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BulkAdGroupDeviceCriterionReadOsNamesTest extends BulkAdGroupDeviceCriterionTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"Linux", "Linux"},
                        {"Windows", "Windows"},
                        {"", ""},
                        {null, null}
                }
        );
    }

    @Test
    public void testRead() {
        testReadProperty(
                "OS Names",
                datum,
                expectedResult,
                new Function<BulkAdGroupDeviceCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupDeviceCriterion c) {
                        return ((DeviceCriterion)c.getBiddableAdGroupCriterion().getCriterion()).getOSName();
                    }
                }
        );
    }
}
