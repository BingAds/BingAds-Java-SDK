package com.microsoft.bingads.v12.api.test.entities.campaign.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v12.api.test.entities.campaign.BulkCampaignTest;
import com.microsoft.bingads.v12.bulk.entities.BulkCampaign;
import com.microsoft.bingads.v12.campaignmanagement.ArrayOfSetting;
import com.microsoft.bingads.v12.campaignmanagement.ShoppingSetting;

public class BulkCampaignWriteToRowValuesCountryCodeOtherSettingTest extends BulkCampaignTest {
    @Parameterized.Parameter(value = 1)
    public String propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {null, ""},
                {null, "US"},
                {null, null},
                {null, "CHINA"}
        });
    }

    @Test
    public void testWrite() {
        testWriteProperty("Country Code", this.datum, this.propertyValue, new BiConsumer<BulkCampaign, String>() {
            @Override
            public void accept(BulkCampaign c, String v) {
                c.getCampaign().setSettings(new ArrayOfSetting());
                ShoppingSetting setting = new ShoppingSetting();
                setting.setSalesCountryCode(v);
                c.getCampaign().getSettings().getSettings().add(setting);
            }
        });
    }
}
