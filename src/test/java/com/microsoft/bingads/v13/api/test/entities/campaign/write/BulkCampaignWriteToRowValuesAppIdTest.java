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
import com.microsoft.bingads.v13.campaignmanagement.CampaignType;
import com.microsoft.bingads.v13.campaignmanagement.AppSetting;
import com.microsoft.bingads.v13.campaignmanagement.AppStore;

public class BulkCampaignWriteToRowValuesAppIdTest extends BulkCampaignTest {
    @Parameterized.Parameter(value = 1)
    public String propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"1", "1"},
                {null, null}
        });
    }

    @Test
    public void testWrite() {
        testWriteProperty("App Id", this.datum, this.propertyValue, new BiConsumer<BulkCampaign, String>() {
            @Override
            public void accept(BulkCampaign c, String v) {
                c.getCampaign().setCampaignType(Collections.singletonList(CampaignType.APP));
                c.getCampaign().setSettings(new ArrayOfSetting());
                AppSetting setting = new AppSetting();
                setting.setAppId(v);
                setting.setAppStore(Collections.singletonList(AppStore.APPLE_APP_STORE));
                c.getCampaign().getSettings().getSettings().add(setting);
            }
        });
    }
}
