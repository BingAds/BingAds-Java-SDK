package com.microsoft.bingads.v12.api.test.entities.campaign.write;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v12.api.test.entities.campaign.BulkCampaignTest;
import com.microsoft.bingads.v12.bulk.entities.BulkCampaign;
import com.microsoft.bingads.v12.campaignmanagement.CampaignType;

@RunWith(Parameterized.class)
public class BulkCampaignWriteToRowValuesCampaignTypeTest extends BulkCampaignTest {

    @Parameterized.Parameter(value = 1)
    public Collection<CampaignType> propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {null, null},
                        {"Search", Collections.singletonList(CampaignType.SEARCH)},
                        {"Shopping", Collections.singletonList(CampaignType.SHOPPING)},
                        {"DynamicSearchAds", Collections.singletonList(CampaignType.DYNAMIC_SEARCH_ADS)},
                        {"Audience", Collections.singletonList(CampaignType.AUDIENCE)},
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
