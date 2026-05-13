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
import com.microsoft.bingads.v13.campaignmanagement.Setting;
import com.microsoft.bingads.v13.campaignmanagement.AISearchSetting;

@RunWith(Parameterized.class)
public class BulkCampaignReadFromRowValuesAISearchEnabledTest extends BulkCampaignTest {

    @Parameterized.Parameter(value = 1)
    public String aiMaxEnabled;

    @Parameterized.Parameter(value = 2)
    public List<Setting> expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        AISearchSetting setting1 = new AISearchSetting();
        setting1.setAISearchEnabled(true);

        return Arrays.asList(
                new Object[][]{
                        {"Search", "true", Collections.singletonList(setting1)},
                }
        );
    }

    @Test
    public void testRead() {
        Map<String, String> values = new HashMap<String, String>();

        values.put("Campaign Type", datum);
        values.put("AI Search Enabled", aiMaxEnabled);

        testReadProperty(
                values,
                this.expectedResult,
                new Function<BulkCampaign, List<Setting>>() {
                    @Override
                    public List<Setting> apply(BulkCampaign c) {
                        if (c.getCampaign().getSettings() == null) {
                            return null;
                        }

                        return c.getCampaign().getSettings().getSettings().stream().filter(s -> s.getClass() == AISearchSetting.class).collect(Collectors.toList());
                    }
                },
                new ObjectComparer<List<Setting>>()
        );
    }
}
