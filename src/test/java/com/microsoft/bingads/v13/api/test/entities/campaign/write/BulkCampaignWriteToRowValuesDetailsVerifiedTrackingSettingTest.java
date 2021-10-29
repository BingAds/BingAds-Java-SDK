
package com.microsoft.bingads.v13.api.test.entities.campaign.write;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.junit.Test;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.campaign.BulkCampaignTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaign;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfArrayOfKeyValuePairOfstringstring;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfKeyValuePairOfstringstring;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfSetting;
import com.microsoft.bingads.v13.campaignmanagement.CampaignType;
import com.microsoft.bingads.v13.campaignmanagement.KeyValuePairOfstringstring;
import com.microsoft.bingads.v13.campaignmanagement.VerifiedTrackingSetting;

public class BulkCampaignWriteToRowValuesDetailsVerifiedTrackingSettingTest extends BulkCampaignTest {
    @Parameterized.Parameter(value = 1)
    public ArrayOfArrayOfKeyValuePairOfstringstring propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
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
        return Arrays.asList(
                new Object[][]{
                        {"[[{\"key\":\"vendorName\",\"value\":\"IAS\"},{\"key\":\"advertiserEntityId\",\"value\":\"CampaignId_1\"},{\"key\":\"publisherEntityId\",\"value\":\"PlacementId_1\"}]]", 
                        	verifiedTrackingDatasCollection}
                }
        );
    }
    
    @Test
    public void testWrite() {
        testWriteProperty("Verified Tracking Setting", this.datum, this.propertyValue, new BiConsumer<BulkCampaign, ArrayOfArrayOfKeyValuePairOfstringstring>() {
            @Override
            public void accept(BulkCampaign c, ArrayOfArrayOfKeyValuePairOfstringstring v) {
                c.getCampaign().setCampaignType(Collections.singletonList(CampaignType.DYNAMIC_SEARCH_ADS));
                c.getCampaign().setSettings(new ArrayOfSetting());
                VerifiedTrackingSetting setting = new VerifiedTrackingSetting();
                setting.setDetails(v);
                c.getCampaign().getSettings().getSettings().add(setting);
            }
        });
    }
}
