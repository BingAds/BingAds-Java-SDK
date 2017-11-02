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

public class BulkCampaignWriteToRowValuesPriorityOtherSettingTest extends BulkCampaignTest {
    @Parameterized.Parameter(value = 1)
    public Integer propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {null, 1},
                        {null, 123},
                        {null, Integer.MAX_VALUE}
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
                        c.getCampaign().setSettings(new ArrayOfSetting());

                        ShoppingSetting setting = new ShoppingSetting();

                        setting.setPriority(v);

                        c.getCampaign().getSettings().getSettings().add(setting);
                    }
                }
        );
    }
}
