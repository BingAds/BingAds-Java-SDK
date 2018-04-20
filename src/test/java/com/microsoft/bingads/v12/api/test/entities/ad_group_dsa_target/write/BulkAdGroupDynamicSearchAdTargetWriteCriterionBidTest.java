package com.microsoft.bingads.v12.api.test.entities.ad_group_dsa_target.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v12.api.test.entities.ad_group_dsa_target.BulkAdGroupDynamicSearchAdTargetTest;
import com.microsoft.bingads.v12.bulk.entities.BulkAdGroupDynamicSearchAdTarget;
import com.microsoft.bingads.v12.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.v12.campaignmanagement.FixedBid;
import com.microsoft.bingads.v12.campaignmanagement.Webpage;

public class BulkAdGroupDynamicSearchAdTargetWriteCriterionBidTest extends BulkAdGroupDynamicSearchAdTargetTest {
    @Parameterized.Parameter(value = 1)
    public FixedBid propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
    	FixedBid withValue = new FixedBid();
        withValue.setAmount(12.34);

        FixedBid zeroValue = new FixedBid();
        zeroValue.setAmount(0.0);

        return Arrays.asList(
                new Object[][]{
                        {"12.34", withValue},
                        {"0.0", zeroValue},
                        {null, null}
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Bid",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupDynamicSearchAdTarget, FixedBid>() {
                    @Override
                    public void accept(BulkAdGroupDynamicSearchAdTarget c, FixedBid v) {
                        Webpage criterion = new Webpage();

                        BiddableAdGroupCriterion adGroupCriterion = new BiddableAdGroupCriterion();

                        adGroupCriterion.setCriterion(criterion);

                        c.setBiddableAdGroupCriterion(adGroupCriterion);

                        adGroupCriterion.setCriterionBid(v);
                    }
                }
        );
    }

}
