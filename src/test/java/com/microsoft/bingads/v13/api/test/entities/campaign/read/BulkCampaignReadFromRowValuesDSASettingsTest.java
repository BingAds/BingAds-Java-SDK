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
import com.microsoft.bingads.v13.campaignmanagement.ArrayOflong;
import com.microsoft.bingads.v13.campaignmanagement.DynamicSearchAdsSetting;
import com.microsoft.bingads.v13.campaignmanagement.DynamicSearchAdsSource;
import com.microsoft.bingads.v13.campaignmanagement.Setting;

@RunWith(Parameterized.class)
public class BulkCampaignReadFromRowValuesDSASettingsTest extends BulkCampaignTest {

    @Parameterized.Parameter(value = 1)
    public String website;

    @Parameterized.Parameter(value = 2)
    public String domainLanguage;
    
    @Parameterized.Parameter(value = 3)
    public String source;

    @Parameterized.Parameter(value = 4)
    public String pageFeedIds;
    
    @Parameterized.Parameter(value = 5)
    public String dynamicDescriptionEnabled;

    @Parameterized.Parameter(value = 6)
    public List<Setting> expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {       
        DynamicSearchAdsSetting setting1 = new DynamicSearchAdsSetting();
        setting1.setDomainName("bing.com");
        setting1.setLanguage("English");
        setting1.setSource(DynamicSearchAdsSource.ALL);
        setting1.setType("DynamicSearchAdsSetting");
        ArrayOflong pids = new ArrayOflong();
        pids.getLongs().addAll(Arrays.asList(1L, 2L, 3L, 4L));
        setting1.setPageFeedIds(pids);
        setting1.setDynamicDescriptionEnabled(true);
        
        DynamicSearchAdsSetting setting2 = new DynamicSearchAdsSetting();
        setting2.setDomainName("baidu.com");
        setting2.setLanguage("Chinese");
        setting2.setSource(DynamicSearchAdsSource.SYSTEM_INDEX);
        setting2.setType("DynamicSearchAdsSetting");
        ArrayOflong pids2 = new ArrayOflong();
        pids2.getLongs().addAll(Arrays.asList(101L, 102L, 103L, 104L));
        setting2.setPageFeedIds(pids2);
        setting2.setDynamicDescriptionEnabled(false);

        return Arrays.asList(
                new Object[][]{
                        {"DynamicSearchAds", "bing.com", "English", "All", "1;2;3;4", "true", Collections.singletonList(setting1)},
                        {"DynamicSearchAds", "baidu.com", "Chinese", "SystemIndex", "101;102;103;104", "false", Collections.singletonList(setting2)},
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
        values.put("Page Feed Ids", pageFeedIds);
        values.put("Dynamic Description Enabled", dynamicDescriptionEnabled);

        testReadProperty(
                values,
                this.expectedResult,
                new Function<BulkCampaign, List<Setting>>() {
                    @Override
                    public List<Setting> apply(BulkCampaign c) {
                        if (c.getCampaign().getSettings() == null) {
                            return null;
                        }
                        
                        return c.getCampaign().getSettings().getSettings().stream().filter(s -> s.getClass() == DynamicSearchAdsSetting.class).collect(Collectors.toList());
                    }
                },
                new ObjectComparer<List<Setting>>()
        );
    }
}
