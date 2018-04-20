package com.microsoft.bingads.v12.api.test.entities.criterions.campaign.radius.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.radius.BulkCampaignRadiusCriterionTest;
import com.microsoft.bingads.v12.bulk.entities.BulkCampaignRadiusCriterion;
import com.microsoft.bingads.v12.campaignmanagement.RadiusCriterion;

@RunWith(Parameterized.class)
public class BulkCampaignRadiusCriterionWriteNameTest extends BulkCampaignRadiusCriterionTest {

    @Parameterized.Parameter(value = 1)
    public String propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                	{"Test1", "Test1"},
                    {"Test 2", "Test 2"},
                    {"", ""},
                    {null, null}
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Name",
                datum,
                propertyValue,
                new BiConsumer<BulkCampaignRadiusCriterion, String>() {
                    @Override
                    public void accept(BulkCampaignRadiusCriterion c, String v) {
                        ((RadiusCriterion)c.getBiddableCampaignCriterion().getCriterion()).setName(v);
                    }
                }
        );
    }
}
