package com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.genre.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.genre.BulkAdGroupGenreCriterionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupGenreCriterion;
import com.microsoft.bingads.v13.campaignmanagement.BidMultiplier;
import com.microsoft.bingads.v13.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.v13.campaignmanagement.GenreCriterion;

public class BulkAdGroupGenreCriterionWriteBidAdjustmentTest extends BulkAdGroupGenreCriterionTest {
    @Parameterized.Parameter(value = 1)
    public Double propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"12.34", 12.34},
                        {"0.0", 0.0},
                        {null, null}
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Bid Adjustment",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupGenreCriterion, Double>() {
                    @Override
                    public void accept(BulkAdGroupGenreCriterion c, Double v) {
                        GenreCriterion criterion = new GenreCriterion();

                        BiddableAdGroupCriterion adGroupCriterion = new BiddableAdGroupCriterion();

                        adGroupCriterion.setCriterion(criterion);

                        c.setBiddableAdGroupCriterion(adGroupCriterion);

                        BidMultiplier bid = new BidMultiplier();

                        bid.setMultiplier(v);

                        adGroupCriterion.setCriterionBid(bid);
                    }
                }
        );
    }

}
