package com.microsoft.bingads.v11.api.test.entities.campaign.write;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.junit.Test;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.campaign.BulkCampaignTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaign;
import com.microsoft.bingads.v11.campaignmanagement.ArrayOfSetting;
import com.microsoft.bingads.v11.campaignmanagement.CampaignType;
import com.microsoft.bingads.v11.campaignmanagement.ShoppingSetting;

public class BulkCampaignWriteToRowValuesCountryCodeShoppingSettingTest extends BulkCampaignTest {
    @Parameterized.Parameter(value = 1)
    public String propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"", ""},
                {"US", "US"},
                {null, null},
                {"CHINA", "CHINA"}
        });
    }

    @Test
    public void testWrite() {
        testWriteProperty("Country Code", this.datum, this.propertyValue, new BiConsumer<BulkCampaign, String>() {
            @Override
            public void accept(BulkCampaign c, String v) {
                c.getCampaign().setCampaignType(Collections.singletonList(CampaignType.SHOPPING));
                c.getCampaign().setSettings(new ArrayOfSetting());
                ShoppingSetting setting = new ShoppingSetting();
                setting.setSalesCountryCode(v);
                c.getCampaign().getSettings().getSettings().add(setting);
            }
        });
    }
}
