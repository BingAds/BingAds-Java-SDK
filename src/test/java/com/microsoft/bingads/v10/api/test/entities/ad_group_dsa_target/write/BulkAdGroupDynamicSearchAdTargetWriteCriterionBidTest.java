package com.microsoft.bingads.v10.api.test.entities.ad_group_dsa_target.write;

import com.microsoft.bingads.v10.api.test.entities.ad_group_dsa_target.BulkAdGroupDynamicSearchAdTargetTest;
import com.microsoft.bingads.v10.bulk.entities.BulkAdGroupDynamicSearchAdTarget;
import com.microsoft.bingads.v10.campaignmanagement.*;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;

import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class BulkAdGroupDynamicSearchAdTargetWriteCriterionBidTest extends BulkAdGroupDynamicSearchAdTargetTest {
    @Parameterized.Parameter(value = 1)
    public Bid propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Bid withValue = new Bid();
        withValue.setAmount(12.34);

        Bid zeroValue = new Bid();
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
                new BiConsumer<BulkAdGroupDynamicSearchAdTarget, Bid>() {
                    @Override
                    public void accept(BulkAdGroupDynamicSearchAdTarget c, Bid v) {
                        Webpage criterion = new Webpage();

                        BiddableAdGroupCriterion adGroupCriterion = new BiddableAdGroupCriterion();

                        adGroupCriterion.setCriterion(criterion);

                        c.setAdGroupCriterion(adGroupCriterion);

                        FixedBid bid = new FixedBid();

                        bid.setBid(v);

                        adGroupCriterion.setCriterionBid(bid);
                    }
                }
        );
    }

}
