package com.microsoft.bingads.v12.api.test.entities.campaign.read;

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
import com.microsoft.bingads.v12.api.test.entities.ObjectComparer;
import com.microsoft.bingads.v12.api.test.entities.campaign.BulkCampaignTest;
import com.microsoft.bingads.v12.bulk.entities.BulkCampaign;
import com.microsoft.bingads.v12.campaignmanagement.DynamicSearchAdsSetting;
import com.microsoft.bingads.v12.campaignmanagement.DynamicSearchAdsSource;
import com.microsoft.bingads.v12.campaignmanagement.Setting;

@RunWith(Parameterized.class)
public class BulkCampaignReadFromRowValuesDSASettingsTest extends BulkCampaignTest {

    @Parameterized.Parameter(value = 1)
    public String website;

    @Parameterized.Parameter(value = 2)
    public String domainLanguage;
    
    @Parameterized.Parameter(value = 3)
    public String source;

    @Parameterized.Parameter(value = 4)
    public List<Setting> expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {       
        DynamicSearchAdsSetting setting1 = new DynamicSearchAdsSetting();
        setting1.setDomainName("bing.com");
        setting1.setLanguage("English");
        setting1.setSource(DynamicSearchAdsSource.ALL);
        setting1.setType("DynamicSearchAdsSetting");

        DynamicSearchAdsSetting setting2 = new DynamicSearchAdsSetting();
        setting2.setDomainName("baidu.com");
        setting2.setLanguage("Chinese");
        setting2.setSource(DynamicSearchAdsSource.SYSTEM_INDEX);
        setting2.setType("DynamicSearchAdsSetting");

        return Arrays.asList(
                new Object[][]{
                        {"DynamicSearchAds", "bing.com", "English", "All", Collections.singletonList(setting1)},
                        {"DynamicSearchAds", "baidu.com", "Chinese", "SystemIndex", Collections.singletonList(setting2)},
                }
        );
    }

    @Test
    public void testRead() {
        Map<String, String> values = new HashMap<String, String>();

        values.put("Campaign Type", datum);
        values.put("Website", website);
        values.put("Domain Language", domainLanguage);
        values.put("Source", source);

        testReadProperty(
                values,
                this.expectedResult,
                new Function<BulkCampaign, List<Setting>>() {
                    @Override
                    public List<Setting> apply(BulkCampaign c) {
                        if (c.getCampaign().getSettings() == null) {
                            return null;
                        }
                        
                        //List<Setting> settings = getCampaign().getSettings().getSettings().stream().filter(s -> s.getClass() == settingClass).collect(Collectors.toList());

                        return c.getCampaign().getSettings().getSettings().stream().filter(s -> s.getClass() == DynamicSearchAdsSetting.class).collect(Collectors.toList());
                    }
                },
                new ObjectComparer<List<Setting>>()
        );
    }
}
