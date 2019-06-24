package com.microsoft.bingads.v13.api.test.entities.campaign.write;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

import org.junit.Test;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.campaign.BulkCampaignTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaign;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfSetting;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOflong;
import com.microsoft.bingads.v13.campaignmanagement.CampaignType;
import com.microsoft.bingads.v13.campaignmanagement.DynamicSearchAdsSetting;

public class BulkCampaignWriteToRowValuesPageFeedIdsDSASettingTest extends BulkCampaignTest {
    @Parameterized.Parameter(value = 1)
    public String propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"1;2;3;4", "1;2;3;4"},
        });
    }

    @Test
    public void testWrite() {
        testWriteProperty("Page Feed Ids", this.datum, this.propertyValue, new BiConsumer<BulkCampaign, String>() {
            @Override
            public void accept(BulkCampaign c, String v) {
                c.getCampaign().setCampaignType(Collections.singletonList(CampaignType.DYNAMIC_SEARCH_ADS));
                c.getCampaign().setSettings(new ArrayOfSetting());
                DynamicSearchAdsSetting setting = new DynamicSearchAdsSetting();
                ArrayOflong pids = new ArrayOflong();
                pids.getLongs().addAll(Arrays.stream(v.split(";")).map(s -> Long.parseLong(s)).collect(Collectors.toList()));
                setting.setPageFeedIds(pids);
                c.getCampaign().getSettings().getSettings().add(setting);
            }
        });
    }
}
