package com.microsoft.bingads.v11.api.test.entities.criterions.campaign.device.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.criterions.campaign.device.BulkCampaignDeviceCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignDeviceCriterion;
import com.microsoft.bingads.v11.campaignmanagement.DeviceCriterion;

@RunWith(Parameterized.class)
public class BulkCampaignDeviceCriterionWriteTargetTest extends BulkCampaignDeviceCriterionTest {

    @Parameterized.Parameter(value = 1)
    public String propertyValue;

    @Parameterized.Parameters
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
    public void testWrite() {
        testWriteProperty(
                "Target",
                datum,
                propertyValue,
                new BiConsumer<BulkCampaignDeviceCriterion, String>() {
                    @Override
                    public void accept(BulkCampaignDeviceCriterion c, String v) {
                        ((DeviceCriterion)c.getBiddableCampaignCriterion().getCriterion()).setDeviceName(v);
                    }
                }
        );
    }
}
