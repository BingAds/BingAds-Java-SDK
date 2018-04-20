package com.microsoft.bingads.v12.api.test.entities.criterions.campaign.negative_location.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.negative_location.BulkCampaignNegativeLocationCriterionTest;
import com.microsoft.bingads.v12.bulk.entities.BulkCampaignNegativeLocationCriterion;

@RunWith(Parameterized.class)
public class BulkCampaignNegativeLocationCriterionWriteCampaignNameTest extends BulkCampaignNegativeLocationCriterionTest {

    @Parameterized.Parameter(value = 1)
    public String propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"123", "123"},
                        {"XXX YYY", "XXX YYY"},
                        {"", ""},
                        {null, null}
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Campaign",
                datum,
                propertyValue,
                new BiConsumer<BulkCampaignNegativeLocationCriterion, String>() {
                    @Override
                    public void accept(BulkCampaignNegativeLocationCriterion c, String v) {
                        c.setCampaignName(v);
                    }
                }
        );
    }
}
