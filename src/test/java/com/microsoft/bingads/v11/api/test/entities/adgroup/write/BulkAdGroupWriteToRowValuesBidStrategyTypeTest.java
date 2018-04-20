package com.microsoft.bingads.v11.api.test.entities.adgroup.write;


import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.adgroup.BulkAdGroupTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroup;
import com.microsoft.bingads.v11.campaignmanagement.BiddingScheme;
import com.microsoft.bingads.v11.campaignmanagement.EnhancedCpcBiddingScheme;
import com.microsoft.bingads.v11.campaignmanagement.InheritFromParentBiddingScheme;
import com.microsoft.bingads.v11.campaignmanagement.ManualCpcBiddingScheme;
import com.microsoft.bingads.v11.campaignmanagement.MaxClicksBiddingScheme;
import com.microsoft.bingads.v11.campaignmanagement.MaxConversionsBiddingScheme;
import com.microsoft.bingads.v11.campaignmanagement.TargetCpaBiddingScheme;

@RunWith(Parameterized.class)
public class BulkAdGroupWriteToRowValuesBidStrategyTypeTest extends BulkAdGroupTest {

    @Parameter(value = 1)
    public BiddingScheme propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
        	{"EnhancedCpc", new EnhancedCpcBiddingScheme()},
            {"InheritFromParent", new InheritFromParentBiddingScheme()},
            {"MaxConversions", new MaxConversionsBiddingScheme()},
            {"ManualCpc", new ManualCpcBiddingScheme()},
            {"TargetCpa", new TargetCpaBiddingScheme()},
            {"MaxClicks", new MaxClicksBiddingScheme()}
        });
    }

    @Test
    public void testWrite() {
        this.<BiddingScheme>testWriteProperty("Bid Strategy Type", this.datum, this.propertyValue, new BiConsumer<BulkAdGroup, BiddingScheme>() {
            @Override
            public void accept(BulkAdGroup c, BiddingScheme v) {
                c.getAdGroup().setBiddingScheme(v);
            }
        });
    }
}
