package com.microsoft.bingads.v13.api.test.entities.campaign.read;

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
import com.microsoft.bingads.v13.campaignmanagement.DisclaimerSetting;
import com.microsoft.bingads.v13.campaignmanagement.Setting;

@RunWith(Parameterized.class)
public class BulkCampaignReadFromRowValuesDisclaimerSettingsTest extends BulkCampaignTest {

    @Parameterized.Parameter(value = 1)
    public String disclaimerAdsEnabled;
    
    @Parameterized.Parameter(value = 2)
    public List<Setting> expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {       
        DisclaimerSetting setting1 = new DisclaimerSetting();
        setting1.setDisclaimerAdsEnabled(true);
        setting1.setType("DisclaimerSetting");
        
        DisclaimerSetting setting2 = new DisclaimerSetting();
        setting2.setDisclaimerAdsEnabled(false);
        setting2.setType("DisclaimerSetting");


        return Arrays.asList(
                new Object[][]{
                        {"DynamicSearchAds", "true", Collections.singletonList(setting1)},
                        {"DynamicSearchAds", "false", Collections.singletonList(setting2)},
                }
        );
    }

    @Test
    public void testRead() {
        Map<String, String> values = new HashMap<String, String>();

        values.put("Campaign Type", datum);
        values.put("Disclaimer Ads Enabled", disclaimerAdsEnabled);

        testReadProperty(
                values,
                this.expectedResult,
                new Function<BulkCampaign, List<Setting>>() {
                    @Override
                    public List<Setting> apply(BulkCampaign c) {
                        if (c.getCampaign().getSettings() == null) {
                            return null;
                        }
                        
                        return c.getCampaign().getSettings().getSettings().stream().filter(s -> s.getClass() == DisclaimerSetting.class).collect(Collectors.toList());
                    }
                },
                new ObjectComparer<List<Setting>>()
        );
    }
}
