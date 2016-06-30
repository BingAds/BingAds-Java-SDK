package com.microsoft.bingads.v10.api.test.entities.adgroup.read;

import com.microsoft.bingads.v10.api.test.entities.ObjectComparer;
import com.microsoft.bingads.v10.api.test.entities.adgroup.BulkAdGroupTest;
import com.microsoft.bingads.v10.bulk.entities.BulkAdGroup;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaign;
import com.microsoft.bingads.v10.bulk.entities.BulkKeyword;
import com.microsoft.bingads.v10.campaignmanagement.BiddingScheme;
import com.microsoft.bingads.v10.campaignmanagement.EnhancedCpcBiddingScheme;
import com.microsoft.bingads.v10.campaignmanagement.InheritFromParentBiddingScheme;
import com.microsoft.bingads.v10.campaignmanagement.ManualCpcBiddingScheme;
import com.microsoft.bingads.v10.campaignmanagement.MaxClicksBiddingScheme;
import com.microsoft.bingads.v10.campaignmanagement.MaxConversionsBiddingScheme;
import com.microsoft.bingads.v10.campaignmanagement.TargetCpaBiddingScheme;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkAdGroupReadFromRowValuesBidStrategyTypeTest extends BulkAdGroupTest {

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
        
        datum = "InheritFromParent";
    	expectedResult = new InheritFromParentBiddingScheme();
    	expectedResult.setType("InheritFromParent");
    	
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
        
        datum = "MaxConversions";
    	expectedResult = new MaxConversionsBiddingScheme();
    	expectedResult.setType("MaxConversions");
    	
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
        
        datum = "ManualCpc";
    	expectedResult = new ManualCpcBiddingScheme();
    	expectedResult.setType("ManualCpc");
    	
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
        
        datum = "TargetCpa";
    	expectedResult = new TargetCpaBiddingScheme();
    	expectedResult.setType("TargetCpa");
    	
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
        
        datum = "MaxClicks";
    	expectedResult = new MaxClicksBiddingScheme();
    	expectedResult.setType("MaxClicks");
    	
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
