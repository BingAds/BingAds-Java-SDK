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

public class BulkCampaignWriteToRowValuesAppStoreTest extends BulkCampaignTest {
    @Parameterized.Parameter(value = 1)
    public Collection<AppStore> propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"AppleAppStore", Collections.singletonList(AppStore.APPLE_APP_STORE)},
        });
    }

    @Test
    public void testWrite() {
        testWriteProperty("App Store", this.datum, this.propertyValue, new BiConsumer<BulkCampaign, Collection<AppStore>>() {
            @Override
            public void accept(BulkCampaign c, Collection<AppStore> v) {
                c.getCampaign().setCampaignType(Collections.singletonList(CampaignType.APP));
                c.getCampaign().setSettings(new ArrayOfSetting());
                AppSetting setting = new AppSetting();
                setting.setAppId("1");
                setting.setAppStore(v);
                c.getCampaign().getSettings().getSettings().add(setting);
            }
        });
    }
}
