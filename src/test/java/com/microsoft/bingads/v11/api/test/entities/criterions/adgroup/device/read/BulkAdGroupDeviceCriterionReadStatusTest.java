package com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.device.read;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.device.BulkAdGroupDeviceCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupDeviceCriterion;
import com.microsoft.bingads.v11.campaignmanagement.AdGroupCriterionStatus;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BulkAdGroupDeviceCriterionReadStatusTest extends BulkAdGroupDeviceCriterionTest {

    @Parameter(value = 1)
    public AdGroupCriterionStatus expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"", null},
                        {null, null},
                        {"Active", AdGroupCriterionStatus.ACTIVE},
                        {"Paused", AdGroupCriterionStatus.PAUSED},
                        {"Deleted", AdGroupCriterionStatus.DELETED}
                }
        );
    }

    @Test
    public void testRead() {
        testReadProperty(
                "Status",
                datum,
                expectedResult,
                new Function<BulkAdGroupDeviceCriterion, AdGroupCriterionStatus>() {
                    @Override
                    public AdGroupCriterionStatus apply(BulkAdGroupDeviceCriterion c) {
                        return c.getBiddableAdGroupCriterion().getStatus();
                    }
                }
        );
    }
}
