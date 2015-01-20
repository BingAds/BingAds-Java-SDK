package com.microsoft.bingads.api.test.entities.adgroup_product_target.write;

import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.api.test.entities.adgroup_product_target.BulkAdGroupProductTargetTest;
import com.microsoft.bingads.bulk.entities.BulkAdGroupProductTarget;
import com.microsoft.bingads.campaignmanagement.Bid;
import com.microsoft.bingads.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.campaignmanagement.FixedBid;
import com.microsoft.bingads.campaignmanagement.Product;

@RunWith(Parameterized.class)
public class BulkAdGroupProductTargetWriteToRowValuesBidTest extends BulkAdGroupProductTargetTest {

    @Parameter(value = 1)
    public FixedBid propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"12.34", createFixedBid(12.34)},
            {"delete_value", createFixedBid(0.0)},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<FixedBid>testWriteProperty("Bid", this.datum, this.propertyValue, new BiConsumer<BulkAdGroupProductTarget, FixedBid>() {
            @Override
            public void accept(BulkAdGroupProductTarget c, FixedBid v) {
                c.getBiddableAdGroupCriterion().setCriterionBid(v);
            }
        });
    }

    @Override
    protected void onEntityCreation(BulkAdGroupProductTarget entity) {
        FixedBid fixedBid = new FixedBid();

        fixedBid.setBid(new Bid());

        BiddableAdGroupCriterion criterion = new BiddableAdGroupCriterion();

        criterion.setCriterionBid(fixedBid);

        criterion.setCriterion(new Product());

        entity.setBiddableAdGroupCriterion(criterion);
    }
}
