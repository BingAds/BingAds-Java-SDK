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
import com.microsoft.bingads.v13.campaignmanagement.DynamicSearchAdsSetting;
import com.microsoft.bingads.v13.campaignmanagement.Setting;
import com.microsoft.bingads.v13.campaignmanagement.ShoppingSetting;

@RunWith(Parameterized.class)
public class BulkCampaignReadFromRowValuesSettingsTest extends BulkCampaignTest {

    @Parameterized.Parameter(value = 1)
    public String storeId;

    @Parameterized.Parameter(value = 2)
    public String campaignPriority;

    @Parameterized.Parameter(value = 3)
    public String countryCode;

    @Parameterized.Parameter(value = 4)
    public List<Setting> expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        ShoppingSetting setting1 = new ShoppingSetting();
        setting1.setStoreId(123L);
        setting1.setPriority(1);
        setting1.setSalesCountryCode("US");
        setting1.setType("ShoppingSetting");

        ShoppingSetting setting2 = new ShoppingSetting();
        setting2.setStoreId(2147483647L);
        setting2.setPriority(2);
        setting2.setSalesCountryCode("CHINA");
        setting2.setType("ShoppingSetting");

        return Arrays.asList(
                new Object[][]{
                        {"Shopping", "123", "1", "US", Collections.singletonList(setting1)},
                        {"Shopping", "2147483647", "2", "CHINA", Collections.singletonList(setting2)},
                        {"Search", "", "", "", Collections.EMPTY_LIST},
                        {"", "", "", "", null},
                        {"Search", "1234", "123", "CANADA", Collections.EMPTY_LIST},
                }
        );
    }

    @Test
    public void testRead() {
        Map<String, String> values = new HashMap<String, String>();

        values.put("Campaign Type", datum);
        values.put("Store Id", storeId);
        values.put("Priority", campaignPriority);
        values.put("Country Code", countryCode);

        testReadProperty(
                values,
                this.expectedResult,
                new Function<BulkCampaign, List<Setting>>() {
                    @Override
                    public List<Setting> apply(BulkCampaign c) {
                        if (c.getCampaign().getSettings() == null) {
                            return null;
                        }
//                        return c.getCampaign().getSettings().getSettings();
                        return c.getCampaign().getSettings().getSettings().stream().filter(s -> s.getClass() == ShoppingSetting.class).collect(Collectors.toList());
                    }
                },
                new ObjectComparer<List<Setting>>()
        );
    }
}
