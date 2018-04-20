package com.microsoft.bingads.v12.api.test.entities.criterions.campaign.age.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.age.BulkCampaignAgeCriterionTest;
import com.microsoft.bingads.v12.bulk.entities.BulkCampaignAgeCriterion;

@RunWith(Parameterized.class)
public class BulkCampaignAgeCriterionReadCampaignNameTest extends BulkCampaignAgeCriterionTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"123", "123"},
                        {"XXX YYY", "XXX YYY"},
                        {"", ""},
                        {null, null}
                }
        );
    }

    @Test
    public void testRead() {
        testReadProperty(
                "Campaign",
                datum,
                expectedResult,
                new Function<BulkCampaignAgeCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignAgeCriterion c) {
                        return c.getCampaignName();
                    }
                }
        );
    }
}
