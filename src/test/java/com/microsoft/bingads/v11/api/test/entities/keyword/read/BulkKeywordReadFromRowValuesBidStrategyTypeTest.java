package com.microsoft.bingads.v11.api.test.entities.keyword.read;

import com.microsoft.bingads.v11.api.test.entities.ObjectComparer;
import com.microsoft.bingads.v11.api.test.entities.keyword.BulkKeywordTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaign;
import com.microsoft.bingads.v11.bulk.entities.BulkKeyword;
import com.microsoft.bingads.v11.campaignmanagement.BiddingScheme;
import com.microsoft.bingads.v11.campaignmanagement.EnhancedCpcBiddingScheme;
import com.microsoft.bingads.v11.campaignmanagement.InheritFromParentBiddingScheme;
import com.microsoft.bingads.v11.campaignmanagement.ManualCpcBiddingScheme;
import com.microsoft.bingads.v11.campaignmanagement.MaxClicksBiddingScheme;
import com.microsoft.bingads.v11.campaignmanagement.MaxConversionsBiddingScheme;
import com.microsoft.bingads.v11.campaignmanagement.TargetCpaBiddingScheme;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

public class BulkKeywordReadFromRowValuesBidStrategyTypeTest extends BulkKeywordTest {

    @Parameter(value = 1)
    public BiddingScheme expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        BiddingScheme b1, b2, b3, b4, b5, b6;
        b1 = new EnhancedCpcBiddingScheme();
        b1.setType("EnhancedCpc");

        b2 = new InheritFromParentBiddingScheme();
        b2.setType("InheritFromParent");

        b3 = new MaxConversionsBiddingScheme();
        b3.setType("MaxConversions");

        b4 = new ManualCpcBiddingScheme();
        b4.setType("ManualCpc");

        b5 = new TargetCpaBiddingScheme();
        b5.setType("TargetCpa");

        b6 = new MaxClicksBiddingScheme();
        b6.setType("MaxClicks");

        return Arrays.asList(new Object[][]{
                {"EnhancedCpc", b1},
                {"InheritFromParent", b2},
                {"MaxConversions", b3},
                {"ManualCpc", b4},
                {"TargetCpa", b5},
                {"MaxClicks", b6}

        });
    }

    @Test
    public void testRead() {
        this.<BiddingScheme>testReadProperty("Bid Strategy Type", this.datum, this.expectedResult, new Function<BulkKeyword, BiddingScheme>() {
            @Override
            public BiddingScheme apply(BulkKeyword c) {
                return c.getKeyword().getBiddingScheme();
            }
        }, new Supplier<BulkKeyword>() {
            @Override
            public BulkKeyword get() {
                return new BulkKeyword();
            }
        }, new ObjectComparer<BiddingScheme>());
    }
}
