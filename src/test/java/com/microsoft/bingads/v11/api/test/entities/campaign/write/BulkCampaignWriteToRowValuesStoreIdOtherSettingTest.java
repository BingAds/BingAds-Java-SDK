package com.microsoft.bingads.v11.api.test.entities.campaign.write;

import com.microsoft.bingads.v11.api.test.entities.campaign.BulkCampaignTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaign;
import com.microsoft.bingads.v11.campaignmanagement.ArrayOfSetting;
import com.microsoft.bingads.v11.campaignmanagement.ShoppingSetting;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;

import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class BulkCampaignWriteToRowValuesStoreIdOtherSettingTest extends BulkCampaignTest {
    @Parameterized.Parameter(value = 1)
    public Long propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {null, 123L},
                {null, 9223372036854775807L}
        });
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Store Id",
                datum,
                propertyValue,
                new BiConsumer<BulkCampaign, Long>() {
                    @Override
                    public void accept(BulkCampaign c, Long v) {
                        c.getCampaign().setSettings(new ArrayOfSetting());

                        ShoppingSetting setting = new ShoppingSetting();

                        setting.setStoreId(v);

                        c.getCampaign().getSettings().getSettings().add(setting);
                    }
                }
        );
    }
}
