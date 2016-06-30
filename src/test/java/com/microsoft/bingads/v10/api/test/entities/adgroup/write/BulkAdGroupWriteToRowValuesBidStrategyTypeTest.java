package com.microsoft.bingads.v10.api.test.entities.adgroup.write;


import com.microsoft.bingads.v10.api.test.entities.adgroup.BulkAdGroupTest;
import com.microsoft.bingads.v10.bulk.entities.BulkAdGroup;
import com.microsoft.bingads.v10.campaignmanagement.BiddingScheme;
import com.microsoft.bingads.v10.campaignmanagement.EnhancedCpcBiddingScheme;
import com.microsoft.bingads.v10.campaignmanagement.InheritFromParentBiddingScheme;
import com.microsoft.bingads.v10.campaignmanagement.ManualCpcBiddingScheme;
import com.microsoft.bingads.v10.campaignmanagement.MaxClicksBiddingScheme;
import com.microsoft.bingads.v10.campaignmanagement.MaxConversionsBiddingScheme;
import com.microsoft.bingads.v10.campaignmanagement.TargetCpaBiddingScheme;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import java.util.Arrays;
import java.util.Collection;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

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
