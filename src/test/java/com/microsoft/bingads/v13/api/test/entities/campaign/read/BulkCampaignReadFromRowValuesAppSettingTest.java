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
import com.microsoft.bingads.v13.campaignmanagement.AppStore;
import com.microsoft.bingads.v13.campaignmanagement.AppSetting;
import com.microsoft.bingads.v13.campaignmanagement.Setting;

@RunWith(Parameterized.class)
public class BulkCampaignReadFromRowValuesAppSettingTest extends BulkCampaignTest {

    @Parameterized.Parameter(value = 1)
    public String appId;
    
    @Parameterized.Parameter(value = 2)
    public String appStore;
    
    @Parameterized.Parameter(value = 3)
    public List<Setting> expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {       
    	AppSetting setting1 = new AppSetting();
    	setting1.setAppId("1");
    	setting1.setAppStore(Collections.singletonList(AppStore.APPLE_APP_STORE));
    	setting1.setType("AppSetting");
        
        AppSetting setting2 = new AppSetting();
        setting2.setAppId("2");
        setting2.setAppStore(Collections.singletonList(AppStore.MICROSOFT_APP_STORE));
        setting2.setType("AppSetting");

        return Arrays.asList(
                new Object[][]{
                        {"App", "1", "AppleAppStore", Collections.singletonList(setting1)},
                        {"App", "2", "MicrosoftAppStore", Collections.singletonList(setting2)},
                }
        );
    }

    @Test
    public void testRead() {
        Map<String, String> values = new HashMap<String, String>();

        values.put("Campaign Type", datum);
        values.put("App Id", appId);
        values.put("App Store", appStore);


        testReadProperty(
                values,
                this.expectedResult,
                new Function<BulkCampaign, List<Setting>>() {
                    @Override
                    public List<Setting> apply(BulkCampaign c) {
                        if (c.getCampaign().getSettings() == null) {
                            return null;
                        }
                        
                        return c.getCampaign().getSettings().getSettings().stream().filter(s -> s.getClass() == AppSetting.class).collect(Collectors.toList());
                    }
                },
                new ObjectComparer<List<Setting>>()
        );
    }
}
