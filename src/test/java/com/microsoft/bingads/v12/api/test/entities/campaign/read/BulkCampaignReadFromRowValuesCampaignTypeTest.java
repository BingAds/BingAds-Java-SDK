package com.microsoft.bingads.v12.api.test.entities.campaign.read;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.api.test.entities.ObjectComparer;
import com.microsoft.bingads.v12.api.test.entities.campaign.BulkCampaignTest;
import com.microsoft.bingads.v12.bulk.entities.BulkCampaign;
import com.microsoft.bingads.v12.campaignmanagement.CampaignType;

@RunWith(Parameterized.class)
public class BulkCampaignReadFromRowValuesCampaignTypeTest extends BulkCampaignTest {

    @Parameterized.Parameter
    public String datum;

    @Parameterized.Parameter(value = 1)
    public Collection<CampaignType> expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {null, null},
                        {"", null},
                        {"Search", Collections.singletonList(CampaignType.SEARCH)},
                        {"Shopping", Collections.singletonList(CampaignType.SHOPPING)},
                        {"DynamicSearchAds", Collections.singletonList(CampaignType.DYNAMIC_SEARCH_ADS)},
                        {"Audience", Collections.singletonList(CampaignType.AUDIENCE)},
                }
        );
    }

    @Test
    public void testRead() {
        testReadProperty(
                "Campaign Type",
                datum,
                expectedResult,
                new Function<BulkCampaign, Collection<CampaignType>>() {
                    @Override
                    public Collection<CampaignType> apply(BulkCampaign c) {
                        return c.getCampaign().getCampaignType();
                    }
                },
                new ObjectComparer<Collection<CampaignType>>()
        );
    }
}
