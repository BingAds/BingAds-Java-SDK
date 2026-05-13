package com.microsoft.bingads.v13.api.test.entities.campaign.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.campaign.BulkCampaignTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaign;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfSetting;
import com.microsoft.bingads.v13.campaignmanagement.AISearchSetting;

public class BulkCampaignWriteToRowValuesSearchTermMatchingOptOutTest extends BulkCampaignTest {
    @Parameterized.Parameter(value = 1)
    public Boolean propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"false", false},
            {"true", true},
        });
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Search Term Matching Opt Out",
                datum,
                propertyValue,
                new BiConsumer<BulkCampaign, Boolean>() {
                    @Override
                    public void accept(BulkCampaign c, Boolean v) {
                        c.getCampaign().setSettings(new ArrayOfSetting());

                        AISearchSetting setting = new AISearchSetting();
                        setting.setSearchTermMatchingOptOut(v);

                        c.getCampaign().getSettings().getSettings().add(setting);
                    }
                }
        );
    }
}
