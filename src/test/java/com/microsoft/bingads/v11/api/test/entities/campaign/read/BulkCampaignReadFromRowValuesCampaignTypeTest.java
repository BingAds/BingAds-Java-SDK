package com.microsoft.bingads.v11.api.test.entities.campaign.read;

import com.microsoft.bingads.v11.api.test.entities.ObjectComparer;
import com.microsoft.bingads.v11.api.test.entities.campaign.BulkCampaignTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaign;
import com.microsoft.bingads.v11.campaignmanagement.CampaignType;
import com.microsoft.bingads.internal.functionalinterfaces.Function;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

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
                        {"SearchAndContent", Collections.singletonList(CampaignType.SEARCH_AND_CONTENT)},
                        {"Shopping", Collections.singletonList(CampaignType.SHOPPING)},
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
