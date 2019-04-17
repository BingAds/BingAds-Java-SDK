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
import com.microsoft.bingads.v13.campaignmanagement.DynamicSearchAdsSetting;
import com.microsoft.bingads.v13.campaignmanagement.DynamicSearchAdsSource;

public class BulkCampaignWriteToRowValuesSourceDSASettingTest extends BulkCampaignTest {
    @Parameterized.Parameter(value = 1)
    public DynamicSearchAdsSource propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"All", DynamicSearchAdsSource.ALL},
                {"SystemIndex", DynamicSearchAdsSource.SYSTEM_INDEX},
                {"AdvertiserSuppliedUrls", DynamicSearchAdsSource.ADVERTISER_SUPPLIED_URLS},
        });
    }

    @Test
    public void testWrite() {
        testWriteProperty("Source", this.datum, this.propertyValue, new BiConsumer<BulkCampaign, DynamicSearchAdsSource>() {
            @Override
            public void accept(BulkCampaign c, DynamicSearchAdsSource v) {
                c.getCampaign().setCampaignType(Collections.singletonList(CampaignType.DYNAMIC_SEARCH_ADS));
                c.getCampaign().setSettings(new ArrayOfSetting());
                DynamicSearchAdsSetting setting = new DynamicSearchAdsSetting();
                setting.setSource(v);
                c.getCampaign().getSettings().getSettings().add(setting);
            }
        });
    }
}
