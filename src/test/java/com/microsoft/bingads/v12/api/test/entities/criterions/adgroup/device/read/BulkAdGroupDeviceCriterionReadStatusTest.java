package com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.device.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.device.BulkAdGroupDeviceCriterionTest;
import com.microsoft.bingads.v12.bulk.entities.BulkAdGroupDeviceCriterion;
import com.microsoft.bingads.v12.campaignmanagement.AdGroupCriterionStatus;

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
