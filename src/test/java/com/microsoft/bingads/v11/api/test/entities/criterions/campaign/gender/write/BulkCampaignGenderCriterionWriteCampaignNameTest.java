package com.microsoft.bingads.v11.api.test.entities.criterions.campaign.gender.write;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.criterions.campaign.gender.BulkCampaignGenderCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignGenderCriterion;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BulkCampaignGenderCriterionWriteCampaignNameTest extends BulkCampaignGenderCriterionTest {

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
                new BiConsumer<BulkCampaignGenderCriterion, String>() {
                    @Override
                    public void accept(BulkCampaignGenderCriterion c, String v) {
                        c.setCampaignName(v);
                    }
                }
        );
    }
}
