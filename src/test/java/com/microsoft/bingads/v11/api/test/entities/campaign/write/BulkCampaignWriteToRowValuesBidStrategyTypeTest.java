package com.microsoft.bingads.v11.api.test.entities.campaign.write;

import com.microsoft.bingads.v11.api.test.entities.campaign.BulkCampaignTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaign;
import com.microsoft.bingads.v11.campaignmanagement.BiddingScheme;
import com.microsoft.bingads.v11.campaignmanagement.EnhancedCpcBiddingScheme;
import com.microsoft.bingads.v11.campaignmanagement.InheritFromParentBiddingScheme;
import com.microsoft.bingads.v11.campaignmanagement.ManualCpcBiddingScheme;
import com.microsoft.bingads.v11.campaignmanagement.MaxClicksBiddingScheme;
import com.microsoft.bingads.v11.campaignmanagement.MaxConversionsBiddingScheme;
import com.microsoft.bingads.v11.campaignmanagement.TargetCpaBiddingScheme;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkCampaignWriteToRowValuesBidStrategyTypeTest extends BulkCampaignTest {

    @Parameter(value = 1)
    public BiddingScheme propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        // In this example, the parameter generator returns a List of
        // arrays.  Each array has two elements: { datum, expected }.
        // These data are hard-coded into the class, but they could be
        // generated or loaded in any way you like.
        return Arrays.asList(new Object[][]{
            {"MaxConversions", new MaxConversionsBiddingScheme()},
            {"TargetCpa", new TargetCpaBiddingScheme()},
            {"MaxClicks", new MaxClicksBiddingScheme()}
        });
    }

    @Test
    public void testWrite() {
        this.<BiddingScheme>testWriteProperty("Bid Strategy Type", this.datum, this.propertyValue, new BiConsumer<BulkCampaign, BiddingScheme>() {
            @Override
            public void accept(BulkCampaign c, BiddingScheme v) {
                c.getCampaign().setBiddingScheme(v);;
            }
        });
    }
}
