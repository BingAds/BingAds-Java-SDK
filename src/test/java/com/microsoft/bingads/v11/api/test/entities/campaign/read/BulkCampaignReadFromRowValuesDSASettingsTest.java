package com.microsoft.bingads.v11.api.test.entities.campaign.read;

import com.microsoft.bingads.v11.api.test.entities.ObjectComparer;
import com.microsoft.bingads.v11.api.test.entities.campaign.BulkCampaignTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaign;
import com.microsoft.bingads.v11.campaignmanagement.DynamicSearchAdsSetting;
import com.microsoft.bingads.v11.campaignmanagement.Setting;
import com.microsoft.bingads.internal.functionalinterfaces.Function;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;

@RunWith(Parameterized.class)
public class BulkCampaignReadFromRowValuesDSASettingsTest extends BulkCampaignTest {

    @Parameterized.Parameter(value = 1)
    public String website;

    @Parameterized.Parameter(value = 2)
    public String domainLanguage;

    @Parameterized.Parameter(value = 3)
    public List<Setting> expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {       
        DynamicSearchAdsSetting setting1 = new DynamicSearchAdsSetting();
        setting1.setDomainName("bing.com");
        setting1.setLanguage("English");
        setting1.setType("DynamicSearchAdsSetting");

        DynamicSearchAdsSetting setting2 = new DynamicSearchAdsSetting();
        setting2.setDomainName("baidu.com");
        setting2.setLanguage("Chinese");
        setting2.setType("DynamicSearchAdsSetting");

        return Arrays.asList(
                new Object[][]{
                        {"DynamicSearchAds", "bing.com", "English", Collections.singletonList(setting1)},
                        {"DynamicSearchAds", "baidu.com", "Chinese", Collections.singletonList(setting2)},
                }
        );
    }

    @Test
    public void testRead() {
        Map<String, String> values = new HashMap<String, String>();

        values.put("Campaign Type", datum);
        values.put("Website", website);
        values.put("Domain Language", domainLanguage);

        testReadProperty(
                values,
                this.expectedResult,
                new Function<BulkCampaign, List<Setting>>() {
                    @Override
                    public List<Setting> apply(BulkCampaign c) {
                        if (c.getCampaign().getSettings() == null) {
                            return null;
                        }
                        return c.getCampaign().getSettings().getSettings();
                    }
                },
                new ObjectComparer<List<Setting>>()
        );
    }
}
