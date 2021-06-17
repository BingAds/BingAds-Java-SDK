package com.microsoft.bingads.v13.api.test.entities.bidstrategy.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.bidstrategy.BulkBidStrategyTest;
import com.microsoft.bingads.v13.bulk.entities.BulkBidStrategy;
import com.microsoft.bingads.v13.campaignmanagement.BiddingScheme;
import com.microsoft.bingads.v13.campaignmanagement.EnhancedCpcBiddingScheme;
import com.microsoft.bingads.v13.campaignmanagement.InheritFromParentBiddingScheme;
import com.microsoft.bingads.v13.campaignmanagement.ManualCpcBiddingScheme;
import com.microsoft.bingads.v13.campaignmanagement.ManualCpmBiddingScheme;
import com.microsoft.bingads.v13.campaignmanagement.ManualCpvBiddingScheme;
import com.microsoft.bingads.v13.campaignmanagement.MaxClicksBiddingScheme;
import com.microsoft.bingads.v13.campaignmanagement.MaxConversionValueBiddingScheme;
import com.microsoft.bingads.v13.campaignmanagement.MaxConversionsBiddingScheme;
import com.microsoft.bingads.v13.campaignmanagement.MaxRoasBiddingScheme;
import com.microsoft.bingads.v13.campaignmanagement.TargetCpaBiddingScheme;
import com.microsoft.bingads.v13.campaignmanagement.TargetImpressionShareBiddingScheme;
import com.microsoft.bingads.v13.campaignmanagement.TargetRoasBiddingScheme;

@RunWith(Parameterized.class)
public class BulkBidStrategyWriteToRowValuesBidStrategyTypeTest extends BulkBidStrategyTest {

    @Parameter(value = 1)
    public BiddingScheme propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        // In this example, the parameter generator returns a List of
        // arrays.  Each array has two elements: { datum, expected }.
        // These data are hard-coded into the class, but they could be
        // generated or loaded in any way you like.
        return Arrays.asList(new Object[][]{
            {"EnhancedCpc", new EnhancedCpcBiddingScheme()},
            {"InheritFromParent", new InheritFromParentBiddingScheme()},
            {"MaxConversions", new MaxConversionsBiddingScheme()},
            {"ManualCpc", new ManualCpcBiddingScheme()},
            {"ManualCpv", new ManualCpvBiddingScheme()},
            {"ManualCpm", new ManualCpmBiddingScheme()},
            {"TargetCpa", new TargetCpaBiddingScheme()},
            {"MaxClicks", new MaxClicksBiddingScheme()},
            {"MaxConversionValue", new MaxConversionValueBiddingScheme()},
            {"TargetRoas", new TargetRoasBiddingScheme()},
            {"TargetImpressionShare", new TargetImpressionShareBiddingScheme()},
            {"MaxRoas", new MaxRoasBiddingScheme()}
        });
    }

    @Test
    public void testWrite() {
        this.<BiddingScheme>testWriteProperty("Bid Strategy Type", this.datum, this.propertyValue, new BiConsumer<BulkBidStrategy, BiddingScheme>() {
            @Override
            public void accept(BulkBidStrategy c, BiddingScheme v) {
                c.getBidStrategy().setBiddingScheme(v);;
            }
        });
    }
}
