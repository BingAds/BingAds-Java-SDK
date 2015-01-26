package com.microsoft.bingads.api.test.entities.adgroup_product_target.write;

import com.microsoft.bingads.api.test.entities.adgroup_product_target.BulkAdGroupProductTargetTest;
import com.microsoft.bingads.bulk.entities.BulkAdGroupProductTarget;
import com.microsoft.bingads.campaignmanagement.Bid;
import com.microsoft.bingads.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.campaignmanagement.FixedBid;
import com.microsoft.bingads.campaignmanagement.Product;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkAdGroupProductTargetWriteToRowValuesAdGroupIdTest extends BulkAdGroupProductTargetTest {

    @Parameter(value = 1)
    public Long propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"123", 123L},
            {"9223372036854775807", 9223372036854775807L}
        });
    }

    @Test
    public void testWrite() {
        this.<Long>testWriteProperty("Parent Id", this.datum, this.propertyValue, new BiConsumer<BulkAdGroupProductTarget, Long>() {
            @Override
            public void accept(BulkAdGroupProductTarget c, Long v) {
                c.getBiddableAdGroupCriterion().setAdGroupId(v);
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
