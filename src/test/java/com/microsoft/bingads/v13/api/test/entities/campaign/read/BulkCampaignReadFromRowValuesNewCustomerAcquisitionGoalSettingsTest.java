package com.microsoft.bingads.v13.api.test.entities.campaign.read;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.ObjectComparer;
import com.microsoft.bingads.v13.api.test.entities.campaign.BulkCampaignTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaign;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOflong;
import com.microsoft.bingads.v13.campaignmanagement.NewCustomerAcquisitionGoalSetting;
import com.microsoft.bingads.v13.campaignmanagement.Setting;

@RunWith(Parameterized.class)
public class BulkCampaignReadFromRowValuesNewCustomerAcquisitionGoalSettingsTest extends BulkCampaignTest {

    @Parameterized.Parameter(value = 1)
    public String additionalConversionValue;
    
    @Parameterized.Parameter(value = 2)
    public String newCustomerAcquisitionBidOnlyMode;
    
    @Parameterized.Parameter(value = 3)
    public String newCustomerAcquisitionGoalId;
    
    @Parameterized.Parameter(value = 4)
    public List<Setting> expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {       
    	NewCustomerAcquisitionGoalSetting setting1 = new NewCustomerAcquisitionGoalSetting();
    	setting1.setAdditionalConversionValue(new BigDecimal("123.45"));
        setting1.setNewCustomerAcquisitionBidOnlyMode(false);
        setting1.setNewCustomerAcquisitionGoalId(123L);
        setting1.setType("NewCustomerAcquisitionGoalSetting");
        
        NewCustomerAcquisitionGoalSetting setting2 = new NewCustomerAcquisitionGoalSetting();
        setting2.setAdditionalConversionValue(new BigDecimal("123.45"));
        setting2.setNewCustomerAcquisitionBidOnlyMode(true);
        setting2.setNewCustomerAcquisitionGoalId(Long.MAX_VALUE);
        setting2.setType("NewCustomerAcquisitionGoalSetting");

        return Arrays.asList(
                new Object[][]{
                        {"PerformanceMax", "123.45", "false", "123", Collections.singletonList(setting1)},
                        {"PerformanceMax", "123.45", "true", "9223372036854775807", Collections.singletonList(setting2)},
                }
        );
    }

    @Test
    public void testRead() {
        Map<String, String> values = new HashMap<String, String>();

        values.put("Campaign Type", datum);
        values.put("Additional Conversion Value", additionalConversionValue);
        values.put("New Customer Acquisition Bid Only Mode", newCustomerAcquisitionBidOnlyMode);
        values.put("New Customer Acquisition Goal Id", newCustomerAcquisitionGoalId);

        testReadProperty(
                values,
                this.expectedResult,
                new Function<BulkCampaign, List<Setting>>() {
                    @Override
                    public List<Setting> apply(BulkCampaign c) {
                        if (c.getCampaign().getSettings() == null) {
                            return null;
                        }
                        
                        return c.getCampaign().getSettings().getSettings().stream().filter(s -> s.getClass() == NewCustomerAcquisitionGoalSetting.class).collect(Collectors.toList());
                    }
                },
                new ObjectComparer<List<Setting>>()
        );
    }
}
