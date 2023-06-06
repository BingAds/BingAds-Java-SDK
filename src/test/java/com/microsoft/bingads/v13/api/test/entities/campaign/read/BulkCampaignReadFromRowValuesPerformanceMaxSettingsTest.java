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
import com.microsoft.bingads.v13.campaignmanagement.PerformanceMaxSetting;
import com.microsoft.bingads.v13.campaignmanagement.Setting;

@RunWith(Parameterized.class)
public class BulkCampaignReadFromRowValuesPerformanceMaxSettingsTest extends BulkCampaignTest {

    @Parameterized.Parameter(value = 1)
    public String finalUrlExpansionOptOut;
    
    @Parameterized.Parameter(value = 2)
    public List<Setting> expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {       
    	PerformanceMaxSetting setting1 = new PerformanceMaxSetting();
        setting1.setFinalUrlExpansionOptOut(true);
        setting1.setType("PerformanceMaxSetting");
        PerformanceMaxSetting setting2 = new PerformanceMaxSetting();
        setting2.setFinalUrlExpansionOptOut(false);
        setting2.setType("PerformanceMaxSetting");

        return Arrays.asList(
                new Object[][]{
                        {"PerformanceMax", "true", Collections.singletonList(setting1)},
                        {"PerformanceMax", "false", Collections.singletonList(setting2)},
                }
        );
    }

    @Test
    public void testRead() {
        Map<String, String> values = new HashMap<String, String>();

        values.put("Campaign Type", datum);
        values.put("Url Expansion Opt Out", finalUrlExpansionOptOut);

        testReadProperty(
                values,
                this.expectedResult,
                new Function<BulkCampaign, List<Setting>>() {
                    @Override
                    public List<Setting> apply(BulkCampaign c) {
                        if (c.getCampaign().getSettings() == null) {
                            return null;
                        }
                        
                        return c.getCampaign().getSettings().getSettings().stream().filter(s -> s.getClass() == PerformanceMaxSetting.class).collect(Collectors.toList());
                    }
                },
                new ObjectComparer<List<Setting>>()
        );
    }
}
