
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
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfArrayOfKeyValuePairOfstringstring;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfKeyValuePairOfstringstring;
import com.microsoft.bingads.v13.campaignmanagement.KeyValuePairOfstringstring;
import com.microsoft.bingads.v13.campaignmanagement.VerifiedTrackingSetting;
import com.microsoft.bingads.v13.campaignmanagement.Setting;

@RunWith(Parameterized.class)
public class BulkCampaignReadFromRowValuesVerifiedTrackingSettingsTest extends BulkCampaignTest {

    @Parameterized.Parameter(value = 1)
    public String details;
    
    @Parameterized.Parameter(value = 2)
    public List<Setting> expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {       
        VerifiedTrackingSetting setting1 = new VerifiedTrackingSetting();
        ArrayOfKeyValuePairOfstringstring verifiedTrackingDatas = new ArrayOfKeyValuePairOfstringstring();
        KeyValuePairOfstringstring verifiedTrackingData = new KeyValuePairOfstringstring();
        verifiedTrackingData.setKey("vendorName");
        verifiedTrackingData.setValue("IAS");
        verifiedTrackingDatas.getKeyValuePairOfstringstrings().add(verifiedTrackingData);
        verifiedTrackingData = new KeyValuePairOfstringstring();
        verifiedTrackingData.setKey("advertiserEntityId");
        verifiedTrackingData.setValue("CampaignId_1");
        verifiedTrackingDatas.getKeyValuePairOfstringstrings().add(verifiedTrackingData);
        verifiedTrackingData = new KeyValuePairOfstringstring();
        verifiedTrackingData.setKey("publisherEntityId");
        verifiedTrackingData.setValue("PlacementId_1");
        verifiedTrackingDatas.getKeyValuePairOfstringstrings().add(verifiedTrackingData);
        ArrayOfArrayOfKeyValuePairOfstringstring verifiedTrackingDatasCollection = new ArrayOfArrayOfKeyValuePairOfstringstring();
        verifiedTrackingDatasCollection.getArrayOfKeyValuePairOfstringstrings().add(verifiedTrackingDatas);
        setting1.setDetails(verifiedTrackingDatasCollection);
        setting1.setType("VerifiedTrackingSetting");
        return Arrays.asList(
                new Object[][]{
                        {"Audience", "[[{\"key\":\"vendorName\",\"value\":\"IAS\"},{\"key\":\"advertiserEntityId\",\"value\":\"CampaignId_1\"},{\"key\":\"publisherEntityId\",\"value\":\"PlacementId_1\"}]]", Collections.singletonList(setting1)},
                }
        );
    }

    @Test
    public void testRead() {
        Map<String, String> values = new HashMap<String, String>();

        values.put("Campaign Type", datum);
        values.put("Verified Tracking Setting", details);

        testReadProperty(
                values,
                this.expectedResult,
                new Function<BulkCampaign, List<Setting>>() {
                    @Override
                    public List<Setting> apply(BulkCampaign c) {
                        if (c.getCampaign().getSettings() == null) {
                            return null;
                        }
                        
                        return c.getCampaign().getSettings().getSettings().stream().filter(s -> s.getClass() == VerifiedTrackingSetting.class).collect(Collectors.toList());
                    }
                },
                new ObjectComparer<List<Setting>>()
        );
    }
}
