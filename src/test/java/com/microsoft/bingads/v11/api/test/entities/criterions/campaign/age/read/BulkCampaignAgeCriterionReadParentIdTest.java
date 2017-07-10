package com.microsoft.bingads.v11.api.test.entities.criterions.campaign.age.read;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.criterions.campaign.age.BulkCampaignAgeCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignAgeCriterion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BulkCampaignAgeCriterionReadParentIdTest extends BulkCampaignAgeCriterionTest {

    @Parameter(value = 1)
    public Long expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"123", 123L},
                        {"9223372036854775807", 9223372036854775807L},
                }
        );
    }

    @Test
    public void testRead() {
        testReadProperty(
                "Parent Id",
                datum,
                expectedResult,
                new Function<BulkCampaignAgeCriterion, Long>() {
                    @Override
                    public Long apply(BulkCampaignAgeCriterion c) {
                        return c.getBiddableCampaignCriterion().getCampaignId();
                    }
                }
        );
    }
}
