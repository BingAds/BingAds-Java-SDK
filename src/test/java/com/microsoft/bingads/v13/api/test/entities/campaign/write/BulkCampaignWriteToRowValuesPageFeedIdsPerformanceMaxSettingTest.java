package com.microsoft.bingads.v13.api.test.entities.campaign.write;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.junit.Test;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.campaign.BulkCampaignTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaign;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfSetting;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOflong;
import com.microsoft.bingads.v13.campaignmanagement.CampaignType;
import com.microsoft.bingads.v13.campaignmanagement.PerformanceMaxSetting;

public class BulkCampaignWriteToRowValuesPageFeedIdsPerformanceMaxSettingTest extends BulkCampaignTest {
    @Parameterized.Parameter(value = 1)
    public ArrayOflong propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
    	ArrayOflong pids = new ArrayOflong();
        pids.getLongs().addAll(Arrays.asList(1L, 2L, 3L, 4L));
        return Arrays.asList(new Object[][]{
                {"1;2;3;4", pids},
                {null, null}
        });
    }

    @Test
    public void testWrite() {
        testWriteProperty("Page Feed Ids", this.datum, this.propertyValue, new BiConsumer<BulkCampaign, ArrayOflong>() {
            @Override
            public void accept(BulkCampaign c, ArrayOflong v) {
                c.getCampaign().setCampaignType(Collections.singletonList(CampaignType.PERFORMANCE_MAX));
                c.getCampaign().setSettings(new ArrayOfSetting());
                PerformanceMaxSetting setting = new PerformanceMaxSetting();
                setting.setPageFeedIds(v);
                c.getCampaign().getSettings().getSettings().add(setting);
            }
        });
    }
}
