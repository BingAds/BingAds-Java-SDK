package com.microsoft.bingads.v13.api.test.entities.bidstrategy.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.ObjectComparer;
import com.microsoft.bingads.v13.api.test.entities.bidstrategy.BulkBidStrategyTest;
import com.microsoft.bingads.v13.bulk.entities.BulkBidStrategy;
import com.microsoft.bingads.v13.campaignmanagement.BiddingScheme;
import com.microsoft.bingads.v13.campaignmanagement.EnhancedCpcBiddingScheme;
import com.microsoft.bingads.v13.campaignmanagement.InheritFromParentBiddingScheme;
import com.microsoft.bingads.v13.campaignmanagement.ManualCpcBiddingScheme;
import com.microsoft.bingads.v13.campaignmanagement.MaxClicksBiddingScheme;
import com.microsoft.bingads.v13.campaignmanagement.MaxConversionValueBiddingScheme;
import com.microsoft.bingads.v13.campaignmanagement.MaxConversionsBiddingScheme;
import com.microsoft.bingads.v13.campaignmanagement.TargetCpaBiddingScheme;
import com.microsoft.bingads.v13.campaignmanagement.TargetRoasBiddingScheme;

@RunWith(Parameterized.class)
public class BulkBidStrategyReadFromRowValuesBidStrategyTypeTest extends BulkBidStrategyTest {

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
    	
        this.<BiddingScheme>testReadProperty("Bid Strategy Type", this.datum, this.expectedResult, new Function<BulkBidStrategy, BiddingScheme>() {
            @Override
            public BiddingScheme apply(BulkBidStrategy c) {
                return c.getBidStrategy().getBiddingScheme();
            }
        }, new Supplier<BulkBidStrategy>() {
            @Override
            public BulkBidStrategy get() {
                return new BulkBidStrategy();
            }
        }, new ObjectComparer<BiddingScheme>());
        
        datum = "InheritFromParent";
    	expectedResult = new InheritFromParentBiddingScheme();
    	expectedResult.setType("InheritFromParent");
    	
		this.<BiddingScheme>testReadProperty("Bid Strategy Type", this.datum, this.expectedResult, new Function<BulkBidStrategy, BiddingScheme>() {
	         @Override
	         public BiddingScheme apply(BulkBidStrategy c) {
	             return c.getBidStrategy().getBiddingScheme();
	         }
	    }, new Supplier<BulkBidStrategy>() {
	         @Override
	         public BulkBidStrategy get() {
	             return new BulkBidStrategy();
	         }
	    }, new ObjectComparer<BiddingScheme>());
        
        datum = "MaxConversions";
    	expectedResult = new MaxConversionsBiddingScheme();
    	expectedResult.setType("MaxConversions");
    	
    	this.<BiddingScheme>testReadProperty("Bid Strategy Type", this.datum, this.expectedResult, new Function<BulkBidStrategy, BiddingScheme>() {
             @Override
             public BiddingScheme apply(BulkBidStrategy c) {
                 return c.getBidStrategy().getBiddingScheme();
             }
        }, new Supplier<BulkBidStrategy>() {
             @Override
             public BulkBidStrategy get() {
                 return new BulkBidStrategy();
             }
        }, new ObjectComparer<BiddingScheme>());
        
        datum = "ManualCpc";
    	expectedResult = new ManualCpcBiddingScheme();
    	expectedResult.setType("ManualCpc");
    	
    	this.<BiddingScheme>testReadProperty("Bid Strategy Type", this.datum, this.expectedResult, new Function<BulkBidStrategy, BiddingScheme>() {
            @Override
            public BiddingScheme apply(BulkBidStrategy c) {
                return c.getBidStrategy().getBiddingScheme();
            }
        }, new Supplier<BulkBidStrategy>() {
            @Override
            public BulkBidStrategy get() {
                return new BulkBidStrategy();
            }
        }, new ObjectComparer<BiddingScheme>());
        
        datum = "TargetCpa";
    	expectedResult = new TargetCpaBiddingScheme();
    	expectedResult.setType("TargetCpa");
    	
    	this.<BiddingScheme>testReadProperty("Bid Strategy Type", this.datum, this.expectedResult, new Function<BulkBidStrategy, BiddingScheme>() {
            @Override
            public BiddingScheme apply(BulkBidStrategy c) {
                return c.getBidStrategy().getBiddingScheme();
            }
    	}, new Supplier<BulkBidStrategy>() {
            @Override
            public BulkBidStrategy get() {
                return new BulkBidStrategy();
            }
    	}, new ObjectComparer<BiddingScheme>());
        
        datum = "MaxClicks";
    	expectedResult = new MaxClicksBiddingScheme();
    	expectedResult.setType("MaxClicks");
    	
    	this.<BiddingScheme>testReadProperty("Bid Strategy Type", this.datum, this.expectedResult, new Function<BulkBidStrategy, BiddingScheme>() {
            @Override
            public BiddingScheme apply(BulkBidStrategy c) {
                return c.getBidStrategy().getBiddingScheme();
            }
    	}, new Supplier<BulkBidStrategy>() {
            @Override
            public BulkBidStrategy get() {
                return new BulkBidStrategy();
            }
    	}, new ObjectComparer<BiddingScheme>());
    	

        datum = "MaxConversionValue";
        expectedResult = new MaxConversionValueBiddingScheme();
        expectedResult.setType("MaxConversionValue");
        
        this.<BiddingScheme>testReadProperty("Bid Strategy Type", this.datum, this.expectedResult, new Function<BulkBidStrategy, BiddingScheme>() {
            @Override
            public BiddingScheme apply(BulkBidStrategy c) {
                return c.getBidStrategy().getBiddingScheme();
            }
        }, new Supplier<BulkBidStrategy>() {
            @Override
            public BulkBidStrategy get() {
                return new BulkBidStrategy();
            }
        }, new ObjectComparer<BiddingScheme>());
        

        datum = "TargetRoas";
        expectedResult = new TargetRoasBiddingScheme();
        expectedResult.setType("TargetRoas");
        
        this.<BiddingScheme>testReadProperty("Bid Strategy Type", this.datum, this.expectedResult, new Function<BulkBidStrategy, BiddingScheme>() {
            @Override
            public BiddingScheme apply(BulkBidStrategy c) {
                return c.getBidStrategy().getBiddingScheme();
            }
        }, new Supplier<BulkBidStrategy>() {
            @Override
            public BulkBidStrategy get() {
                return new BulkBidStrategy();
            }
        }, new ObjectComparer<BiddingScheme>());
    }
}
