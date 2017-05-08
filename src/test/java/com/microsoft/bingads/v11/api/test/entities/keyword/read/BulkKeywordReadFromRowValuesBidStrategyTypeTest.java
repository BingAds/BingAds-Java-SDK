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
        return Arrays.asList(new Object[][]{
        	{"", null}
        });
    }

    @Test
    public void testRead() {
    	datum = "EnhancedCpc";
    	expectedResult = new EnhancedCpcBiddingScheme();
    	expectedResult.setType("EnhancedCpc");
    	
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
        
        datum = "InheritFromParent";
    	expectedResult = new InheritFromParentBiddingScheme();
    	expectedResult.setType("InheritFromParent");
    	
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
        
        datum = "MaxConversions";
    	expectedResult = new MaxConversionsBiddingScheme();
    	expectedResult.setType("MaxConversions");
    	
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
        
        datum = "ManualCpc";
    	expectedResult = new ManualCpcBiddingScheme();
    	expectedResult.setType("ManualCpc");
    	
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
        
        datum = "TargetCpa";
    	expectedResult = new TargetCpaBiddingScheme();
    	expectedResult.setType("TargetCpa");
    	
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
        
        datum = "MaxClicks";
    	expectedResult = new MaxClicksBiddingScheme();
    	expectedResult.setType("MaxClicks");
    	
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
