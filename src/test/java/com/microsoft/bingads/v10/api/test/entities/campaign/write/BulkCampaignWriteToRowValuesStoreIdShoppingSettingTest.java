package com.microsoft.bingads.v10.api.test.entities.campaign.write;

import com.microsoft.bingads.v10.api.test.entities.campaign.BulkCampaignTest;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaign;
import com.microsoft.bingads.v10.campaignmanagement.ArrayOfSetting;
import com.microsoft.bingads.v10.campaignmanagement.CampaignType;
import com.microsoft.bingads.v10.campaignmanagement.ShoppingSetting;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;

import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class BulkCampaignWriteToRowValuesStoreIdShoppingSettingTest extends BulkCampaignTest {
    @Parameterized.Parameter(value = 1)
    public Long propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"123", 123L},
                        {"9223372036854775807", 9223372036854775807L}
                }
        );
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
                        c.getCampaign().setCampaignType(Collections.singletonList(CampaignType.SHOPPING));

                        c.getCampaign().setSettings(new ArrayOfSetting());

                        ShoppingSetting setting = new ShoppingSetting();

                        setting.setStoreId(v);

                        c.getCampaign().getSettings().getSettings().add(setting);
                    }
                }
        );
    }
}
