package com.microsoft.bingads.v11.api.test.entities.keyword.write;

import com.microsoft.bingads.v11.api.test.entities.keyword.BulkKeywordTest;
import com.microsoft.bingads.v11.bulk.entities.BulkKeyword;
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
public class BulkKeywordWriteToRowValuesBidStrategyTypeTest extends BulkKeywordTest {

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
        this.<BiddingScheme>testWriteProperty("Bid Strategy Type", this.datum, this.propertyValue, new BiConsumer<BulkKeyword, BiddingScheme>() {
            @Override
            public void accept(BulkKeyword c, BiddingScheme v) {
                c.getKeyword().setBiddingScheme(v);;
            }
        });
    }
}
