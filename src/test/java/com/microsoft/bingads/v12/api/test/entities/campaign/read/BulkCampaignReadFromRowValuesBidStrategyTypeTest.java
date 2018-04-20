package com.microsoft.bingads.v12.api.test.entities.campaign.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v12.api.test.entities.ObjectComparer;
import com.microsoft.bingads.v12.api.test.entities.campaign.BulkCampaignTest;
import com.microsoft.bingads.v12.bulk.entities.BulkCampaign;
import com.microsoft.bingads.v12.campaignmanagement.BiddingScheme;
import com.microsoft.bingads.v12.campaignmanagement.EnhancedCpcBiddingScheme;
import com.microsoft.bingads.v12.campaignmanagement.InheritFromParentBiddingScheme;
import com.microsoft.bingads.v12.campaignmanagement.ManualCpcBiddingScheme;
import com.microsoft.bingads.v12.campaignmanagement.MaxClicksBiddingScheme;
import com.microsoft.bingads.v12.campaignmanagement.MaxConversionsBiddingScheme;
import com.microsoft.bingads.v12.campaignmanagement.TargetCpaBiddingScheme;

@RunWith(Parameterized.class)
public class BulkCampaignReadFromRowValuesBidStrategyTypeTest extends BulkCampaignTest {

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
    	
        this.<BiddingScheme>testReadProperty("Bid Strategy Type", this.datum, this.expectedResult, new Function<BulkCampaign, BiddingScheme>() {
            @Override
            public BiddingScheme apply(BulkCampaign c) {
                return c.getCampaign().getBiddingScheme();
            }
        }, new Supplier<BulkCampaign>() {
            @Override
            public BulkCampaign get() {
                return new BulkCampaign();
            }
        }, new ObjectComparer<BiddingScheme>());
        
        datum = "InheritFromParent";
    	expectedResult = new InheritFromParentBiddingScheme();
    	expectedResult.setType("InheritFromParent");
    	
		this.<BiddingScheme>testReadProperty("Bid Strategy Type", this.datum, this.expectedResult, new Function<BulkCampaign, BiddingScheme>() {
	         @Override
	         public BiddingScheme apply(BulkCampaign c) {
	             return c.getCampaign().getBiddingScheme();
	         }
	    }, new Supplier<BulkCampaign>() {
	         @Override
	         public BulkCampaign get() {
	             return new BulkCampaign();
	         }
	    }, new ObjectComparer<BiddingScheme>());
        
        datum = "MaxConversions";
    	expectedResult = new MaxConversionsBiddingScheme();
    	expectedResult.setType("MaxConversions");
    	
    	this.<BiddingScheme>testReadProperty("Bid Strategy Type", this.datum, this.expectedResult, new Function<BulkCampaign, BiddingScheme>() {
             @Override
             public BiddingScheme apply(BulkCampaign c) {
                 return c.getCampaign().getBiddingScheme();
             }
        }, new Supplier<BulkCampaign>() {
             @Override
             public BulkCampaign get() {
                 return new BulkCampaign();
             }
        }, new ObjectComparer<BiddingScheme>());
        
        datum = "ManualCpc";
    	expectedResult = new ManualCpcBiddingScheme();
    	expectedResult.setType("ManualCpc");
    	
    	this.<BiddingScheme>testReadProperty("Bid Strategy Type", this.datum, this.expectedResult, new Function<BulkCampaign, BiddingScheme>() {
            @Override
            public BiddingScheme apply(BulkCampaign c) {
                return c.getCampaign().getBiddingScheme();
            }
        }, new Supplier<BulkCampaign>() {
            @Override
            public BulkCampaign get() {
                return new BulkCampaign();
            }
        }, new ObjectComparer<BiddingScheme>());
        
        datum = "TargetCpa";
    	expectedResult = new TargetCpaBiddingScheme();
    	expectedResult.setType("TargetCpa");
    	
    	this.<BiddingScheme>testReadProperty("Bid Strategy Type", this.datum, this.expectedResult, new Function<BulkCampaign, BiddingScheme>() {
            @Override
            public BiddingScheme apply(BulkCampaign c) {
                return c.getCampaign().getBiddingScheme();
            }
    	}, new Supplier<BulkCampaign>() {
            @Override
            public BulkCampaign get() {
                return new BulkCampaign();
            }
    	}, new ObjectComparer<BiddingScheme>());
        
        datum = "MaxClicks";
    	expectedResult = new MaxClicksBiddingScheme();
    	expectedResult.setType("MaxClicks");
    	
    	this.<BiddingScheme>testReadProperty("Bid Strategy Type", this.datum, this.expectedResult, new Function<BulkCampaign, BiddingScheme>() {
            @Override
            public BiddingScheme apply(BulkCampaign c) {
                return c.getCampaign().getBiddingScheme();
            }
    	}, new Supplier<BulkCampaign>() {
            @Override
            public BulkCampaign get() {
                return new BulkCampaign();
            }
    	}, new ObjectComparer<BiddingScheme>());
    }
}
