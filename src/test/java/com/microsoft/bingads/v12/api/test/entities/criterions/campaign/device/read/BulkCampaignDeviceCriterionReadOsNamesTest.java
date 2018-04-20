package com.microsoft.bingads.v12.api.test.entities.criterions.campaign.device.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.device.BulkCampaignDeviceCriterionTest;
import com.microsoft.bingads.v12.bulk.entities.BulkCampaignDeviceCriterion;
import com.microsoft.bingads.v12.campaignmanagement.DeviceCriterion;

@RunWith(Parameterized.class)
public class BulkCampaignDeviceCriterionReadOsNamesTest extends BulkCampaignDeviceCriterionTest {

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
                new Function<BulkCampaignDeviceCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignDeviceCriterion c) {
                        return ((DeviceCriterion)c.getBiddableCampaignCriterion().getCriterion()).getOSName();
                    }
                }
        );
    }
}
