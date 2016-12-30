package com.microsoft.bingads.v10.api.test.entities.campaign_negative_dsa_target.write;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v10.api.test.entities.campaign_negative_dsa_target.BulkCampaignNegativeDynamicSearchAdTargetTest;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaignNegativeDynamicSearchAdTarget;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BulkCampaignNegativeDynamicSearchAdTargetWriteParentIdTest extends BulkCampaignNegativeDynamicSearchAdTargetTest {

    @Parameter(value = 1)
    public Long propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"123", 123L},
                        {"9223372036854775807", 9223372036854775807L},
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Parent Id",
                datum,
                propertyValue,
                new BiConsumer<BulkCampaignNegativeDynamicSearchAdTarget, Long>() {
                    @Override
                    public void accept(BulkCampaignNegativeDynamicSearchAdTarget c, Long v) {
                        c.getNegativeCampaignCriterion().setCampaignId(v);
                    }
                }
        );
    }
}
