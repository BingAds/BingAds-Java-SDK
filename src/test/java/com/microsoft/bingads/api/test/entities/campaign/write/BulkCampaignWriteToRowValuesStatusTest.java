package com.microsoft.bingads.api.test.entities.campaign.write;

import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.api.test.entities.campaign.BulkCampaignTest;
import com.microsoft.bingads.bulk.entities.BulkCampaign;
import com.microsoft.bingads.campaignmanagement.CampaignStatus;

@RunWith(Parameterized.class)
public class BulkCampaignWriteToRowValuesStatusTest extends BulkCampaignTest {

    @Parameter(value = 1)
    public CampaignStatus propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        // In this example, the parameter generator returns a List of
        // arrays.  Each array has two elements: { datum, expected }.
        // These data are hard-coded into the class, but they could be
        // generated or loaded in any way you like.
        return Arrays.asList(new Object[][]{
            {"Active", CampaignStatus.ACTIVE},
            {"Paused", CampaignStatus.PAUSED},
            {"BudgetPaused", CampaignStatus.BUDGET_PAUSED},
            {"BudgetAndManualPaused", CampaignStatus.BUDGET_AND_MANUAL_PAUSED},
            {"Suspended", CampaignStatus.SUSPENDED},
            {"Deleted", CampaignStatus.DELETED},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<CampaignStatus>testWriteProperty("Status", this.datum, this.propertyValue, new BiConsumer<BulkCampaign, CampaignStatus>() {
            @Override
            public void accept(BulkCampaign c, CampaignStatus v) {
                c.getCampaign().setStatus(v);
            }
        });
    }
}
