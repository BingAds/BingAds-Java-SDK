package com.microsoft.bingads.v13.api.test.entities.campaign.write;

import java.math.BigDecimal;
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
import com.microsoft.bingads.v13.campaignmanagement.NewCustomerAcquisitionGoalSetting;

public class BulkCampaignWriteToRowValuesAdditionalConversionValueTest extends BulkCampaignTest {
    @Parameterized.Parameter(value = 1)
    public BigDecimal propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"12.34", BigDecimal.valueOf(12.34)},
                {null, null}
        });
    }

    @Test
    public void testWrite() {
        testWriteProperty("Additional Conversion Value", this.datum, this.propertyValue, new BiConsumer<BulkCampaign, BigDecimal>() {
            @Override
            public void accept(BulkCampaign c, BigDecimal v) {
                c.getCampaign().setCampaignType(Collections.singletonList(CampaignType.PERFORMANCE_MAX));
                c.getCampaign().setSettings(new ArrayOfSetting());
                NewCustomerAcquisitionGoalSetting setting = new NewCustomerAcquisitionGoalSetting();
                setting.setAdditionalConversionValue(v);
                c.getCampaign().getSettings().getSettings().add(setting);
            }
        });
    }
}
