package com.microsoft.bingads.v12.api.test.entities.campaign_negative_dsa_target.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v12.api.test.entities.campaign_negative_dsa_target.BulkCampaignNegativeDynamicSearchAdTargetTest;
import com.microsoft.bingads.v12.bulk.entities.BulkCampaignNegativeDynamicSearchAdTarget;
import com.microsoft.bingads.v12.campaignmanagement.Webpage;

@RunWith(Parameterized.class)
public class BulkCampaignNegativeDynamicSearchAdTargetWriteCriterionNameTest extends BulkCampaignNegativeDynamicSearchAdTargetTest {

    @Parameterized.Parameter(value = 1)
    public String propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"123", "123"},
                        {"XXX YYY", "XXX YYY"},
                        {"delete_value", ""},
                        {null, null}
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Name",
                datum,
                propertyValue,
                new BiConsumer<BulkCampaignNegativeDynamicSearchAdTarget, String>() {
                    @Override
                    public void accept(BulkCampaignNegativeDynamicSearchAdTarget c, String v) {
                        ((Webpage)c.getNegativeCampaignCriterion().getCriterion()).getParameter().setCriterionName(v);
                    }
                }
        );
    }
}
