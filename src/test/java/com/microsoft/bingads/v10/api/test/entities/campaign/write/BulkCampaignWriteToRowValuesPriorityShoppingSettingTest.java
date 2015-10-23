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

public class BulkCampaignWriteToRowValuesPriorityShoppingSettingTest extends BulkCampaignTest {
    @Parameterized.Parameter(value = 1)
    public Integer propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"1", 1},
                        {"123", 123},
                        {"2147483647", Integer.MAX_VALUE}
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Priority",
                datum,
                propertyValue,
                new BiConsumer<BulkCampaign, Integer>() {
                    @Override
                    public void accept(BulkCampaign c, Integer v) {
                        c.getCampaign().setCampaignType(Collections.singletonList(CampaignType.SHOPPING));

                        c.getCampaign().setSettings(new ArrayOfSetting());

                        ShoppingSetting setting = new ShoppingSetting();

                        setting.setPriority(v);

                        c.getCampaign().getSettings().getSettings().add(setting);
                    }
                }
        );
    }
}
