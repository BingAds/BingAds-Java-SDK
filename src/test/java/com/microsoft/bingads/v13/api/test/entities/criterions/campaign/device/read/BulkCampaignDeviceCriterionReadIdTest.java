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

@RunWith(Parameterized.class)
public class BulkCampaignDeviceCriterionReadIdTest extends BulkCampaignDeviceCriterionTest {

    @Parameter(value = 1)
    public Long expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"123", 123L},
                        {"9223372036854775807", 9223372036854775807L},
                        {"", null},
                        {null, null}
                }
        );
    }

    @Test
    public void testRead() {
        testReadProperty(
                "Id",
                datum,
                expectedResult,
                new Function<BulkCampaignDeviceCriterion, Long>() {
                    @Override
                    public Long apply(BulkCampaignDeviceCriterion c) {
                        return c.getBiddableCampaignCriterion().getId();
                    }
                }
        );
    }
}
