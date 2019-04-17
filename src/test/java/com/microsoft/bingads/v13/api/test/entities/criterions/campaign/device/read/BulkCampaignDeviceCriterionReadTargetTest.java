package com.microsoft.bingads.v13.api.test.entities.criterions.campaign.device.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.device.BulkCampaignDeviceCriterionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignDeviceCriterion;
import com.microsoft.bingads.v13.campaignmanagement.DeviceCriterion;

@RunWith(Parameterized.class)
public class BulkCampaignDeviceCriterionReadTargetTest extends BulkCampaignDeviceCriterionTest {

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
                new Function<BulkCampaignDeviceCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignDeviceCriterion c) {
                        return ((DeviceCriterion)c.getBiddableCampaignCriterion().getCriterion()).getDeviceName();
                    }
                }
        );
    }
}
