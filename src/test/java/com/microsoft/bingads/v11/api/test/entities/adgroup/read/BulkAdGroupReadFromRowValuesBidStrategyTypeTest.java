package com.microsoft.bingads.v11.api.test.entities.adgroup.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v11.api.test.entities.ObjectComparer;
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
public class BulkAdGroupReadFromRowValuesBidStrategyTypeTest extends BulkAdGroupTest {

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
        this.<BiddingScheme>testReadProperty("Bid Strategy Type", this.datum, this.expectedResult, new Function<BulkAdGroup, BiddingScheme>() {
            @Override
            public BiddingScheme apply(BulkAdGroup c) {
                return c.getAdGroup().getBiddingScheme();
            }
        }, new Supplier<BulkAdGroup>() {
            @Override
            public BulkAdGroup get() {
                return new BulkAdGroup();
            }
        }, new ObjectComparer<BiddingScheme>());
    }
}
