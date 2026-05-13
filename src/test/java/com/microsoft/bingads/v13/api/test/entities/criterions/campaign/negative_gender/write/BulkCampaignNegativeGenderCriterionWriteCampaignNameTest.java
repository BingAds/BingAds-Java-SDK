package com.microsoft.bingads.v13.api.test.entities.criterions.campaign.negative_gender.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.negative_gender.BulkCampaignNegativeGenderCriterionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignNegativeGenderCriterion;

@RunWith(Parameterized.class)
public class BulkCampaignNegativeGenderCriterionWriteCampaignNameTest extends BulkCampaignNegativeGenderCriterionTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
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
                new BiConsumer<BulkCampaignNegativeGenderCriterion, String>() {
                    @Override
                    public void accept(BulkCampaignNegativeGenderCriterion c, String v) {
                        c.setCampaignName(v);
                    }
                }
        );
    }
}
