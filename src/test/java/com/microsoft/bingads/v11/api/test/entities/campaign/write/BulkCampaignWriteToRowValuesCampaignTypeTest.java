package com.microsoft.bingads.v11.api.test.entities.campaign.write;

import com.microsoft.bingads.v11.api.test.entities.campaign.BulkCampaignTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaign;
import com.microsoft.bingads.v11.campaignmanagement.CampaignType;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

@RunWith(Parameterized.class)
public class BulkCampaignWriteToRowValuesCampaignTypeTest extends BulkCampaignTest {

    @Parameterized.Parameter(value = 1)
    public Collection<CampaignType> propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {null, null},
                        {"SearchAndContent", Collections.singletonList(CampaignType.SEARCH_AND_CONTENT)},
                        {"Shopping", Collections.singletonList(CampaignType.SHOPPING)},
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Campaign Type",
                datum,
                propertyValue,
                new BiConsumer<BulkCampaign, Collection<CampaignType>>() {
                    @Override
                    public void accept(BulkCampaign c, Collection<CampaignType> v) {
                        c.getCampaign().setCampaignType(v);
                    }
                }
        );
    }
}
