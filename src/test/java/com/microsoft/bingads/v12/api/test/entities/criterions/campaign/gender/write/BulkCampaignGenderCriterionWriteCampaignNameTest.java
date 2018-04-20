package com.microsoft.bingads.v12.api.test.entities.criterions.campaign.gender.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.gender.BulkCampaignGenderCriterionTest;
import com.microsoft.bingads.v12.bulk.entities.BulkCampaignGenderCriterion;

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
