package com.microsoft.bingads.v11.api.test.entities.campaign.write;

import com.microsoft.bingads.v11.api.test.entities.campaign.BulkCampaignTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaign;
import com.microsoft.bingads.v11.campaignmanagement.ArrayOfSetting;
import com.microsoft.bingads.v11.campaignmanagement.CampaignType;
import com.microsoft.bingads.v11.campaignmanagement.DynamicSearchAdsSetting;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;

import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class BulkCampaignWriteToRowValuesDomainLanguageDSASettingTest extends BulkCampaignTest {
    @Parameterized.Parameter(value = 1)
    public String propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"", ""},
                {"English", "English"},
                {null, null},
        });
    }

    @Test
    public void testWrite() {
        testWriteProperty("Domain Language", this.datum, this.propertyValue, new BiConsumer<BulkCampaign, String>() {
            @Override
            public void accept(BulkCampaign c, String v) {
                c.getCampaign().setCampaignType(Collections.singletonList(CampaignType.DYNAMIC_SEARCH_ADS));
                c.getCampaign().setSettings(new ArrayOfSetting());
                DynamicSearchAdsSetting setting = new DynamicSearchAdsSetting();
                setting.setLanguage(v);
                c.getCampaign().getSettings().getSettings().add(setting);
            }
        });
    }
}
