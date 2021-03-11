package com.microsoft.bingads.v13.api.test.entities.bidstrategy.read;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.junit.Test;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.ObjectComparer;
import com.microsoft.bingads.v13.api.test.entities.bidstrategy.BulkBidStrategyTest;
import com.microsoft.bingads.v13.bulk.entities.BulkBidStrategy;
import com.microsoft.bingads.v13.campaignmanagement.CampaignType;

public class BulkBidStrategyReadFromRowValuesCampaignTypeTest extends BulkBidStrategyTest {

    @Parameterized.Parameter
    public String datum;

    @Parameterized.Parameter(value = 1)
    public Collection<CampaignType> expectedResult;

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
    public void testRead() {
        testReadProperty(
                "Campaign Type",
                datum,
                expectedResult,
                new Function<BulkBidStrategy, Collection<CampaignType>>() {
                    @Override
                    public Collection<CampaignType> apply(BulkBidStrategy c) {
                        return c.getBidStrategy().getAssociatedCampaignType();
                    }
                },
                new ObjectComparer<Collection<CampaignType>>()
        );
    }

}
