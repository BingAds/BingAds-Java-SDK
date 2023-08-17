package com.microsoft.bingads.v13.api.test.entities.ads.responsive.write;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.junit.Test;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.ads.responsive.BulkResponsiveAdTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaign;
import com.microsoft.bingads.v13.bulk.entities.BulkResponsiveAd;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfArrayOfKeyValuePairOfstringstring;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfKeyValuePairOfstringstring;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfSetting;
import com.microsoft.bingads.v13.campaignmanagement.CampaignType;
import com.microsoft.bingads.v13.campaignmanagement.KeyValuePairOfstringstring;
import com.microsoft.bingads.v13.campaignmanagement.VerifiedTrackingSetting;

public class BulkResponsiveAdWriteFromRowValuesVerifiedTrackingDatasTest extends BulkResponsiveAdTest {

	@Parameterized.Parameter(value = 1)
	public VerifiedTrackingSetting expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
    	VerifiedTrackingSetting setting1 = new VerifiedTrackingSetting();
        ArrayOfKeyValuePairOfstringstring verifiedTrackingDatas = new ArrayOfKeyValuePairOfstringstring();
        KeyValuePairOfstringstring verifiedTrackingData1 = new KeyValuePairOfstringstring();
        verifiedTrackingData1.setKey("vendorName");
        verifiedTrackingData1.setValue("IAS");
        verifiedTrackingDatas.getKeyValuePairOfstringstrings().add(verifiedTrackingData1);
        KeyValuePairOfstringstring verifiedTrackingData2 = new KeyValuePairOfstringstring();
        verifiedTrackingData2.setKey("advertiserEntityId");
        verifiedTrackingData2.setValue("CampaignId_1");
        verifiedTrackingDatas.getKeyValuePairOfstringstrings().add(verifiedTrackingData2);
        KeyValuePairOfstringstring verifiedTrackingData3 = new KeyValuePairOfstringstring();
        verifiedTrackingData3.setKey("publisherEntityId");
        verifiedTrackingData3.setValue("PlacementId_1");
        verifiedTrackingDatas.getKeyValuePairOfstringstrings().add(verifiedTrackingData3);
        ArrayOfArrayOfKeyValuePairOfstringstring verifiedTrackingDatasCollection = new ArrayOfArrayOfKeyValuePairOfstringstring();
        verifiedTrackingDatasCollection.getArrayOfKeyValuePairOfstringstrings().add(verifiedTrackingDatas);
        setting1.setDetails(verifiedTrackingDatasCollection);
        setting1.setType("VerifiedTrackingSetting");
        return Arrays.asList(
                new Object[][]{
                        {"[[{\"key\":\"vendorName\",\"value\":\"IAS\"},{\"key\":\"advertiserEntityId\",\"value\":\"CampaignId_1\"},{\"key\":\"publisherEntityId\",\"value\":\"PlacementId_1\"}]]", setting1},
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty("Verified Tracking Settings", this.datum, this.expectedResult, new BiConsumer<BulkResponsiveAd, VerifiedTrackingSetting>() {
            @Override
            public void accept(BulkResponsiveAd c, VerifiedTrackingSetting v) {
            	c.getResponsiveAd().setVerifiedTrackingSettings(v);
            }
        });
    }
}
