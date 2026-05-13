package com.microsoft.bingads.v13.api.test.entities.criterions.campaign.negative_age.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.negative_age.BulkCampaignNegativeAgeCriterionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignNegativeAgeCriterion;

@RunWith(Parameterized.class)
public class BulkCampaignNegativeAgeCriterionWriteCampaignNameTest extends BulkCampaignNegativeAgeCriterionTest {

    @Parameter(value = 1)
    public String propertyValue;

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
    public void testWrite() {
        testWriteProperty(
                "Campaign",
                datum,
                propertyValue,
                new BiConsumer<BulkCampaignNegativeAgeCriterion, String>() {
                    @Override
                    public void accept(BulkCampaignNegativeAgeCriterion c, String v) {
                        c.setCampaignName(v);
                    }
                }
        );
    }
}
