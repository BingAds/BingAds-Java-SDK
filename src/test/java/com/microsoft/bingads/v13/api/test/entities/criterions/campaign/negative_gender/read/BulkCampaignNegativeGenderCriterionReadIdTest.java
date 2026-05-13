package com.microsoft.bingads.v13.api.test.entities.criterions.campaign.negative_gender.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.negative_gender.BulkCampaignNegativeGenderCriterionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignNegativeGenderCriterion;

@RunWith(Parameterized.class)
public class BulkCampaignNegativeGenderCriterionReadIdTest extends BulkCampaignNegativeGenderCriterionTest {

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
                new Function<BulkCampaignNegativeGenderCriterion, Long>() {
                    @Override
                    public Long apply(BulkCampaignNegativeGenderCriterion c) {
                        return c.getNegativeCampaignCriterion().getId();
                    }
                }
        );
    }
}
