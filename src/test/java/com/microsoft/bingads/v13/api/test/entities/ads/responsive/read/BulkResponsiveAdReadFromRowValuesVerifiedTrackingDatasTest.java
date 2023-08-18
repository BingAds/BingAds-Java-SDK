package com.microsoft.bingads.v13.api.test.entities.ads.responsive.read;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.ObjectComparer;
import com.microsoft.bingads.v13.api.test.entities.ads.responsive.BulkResponsiveAdTest;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfArrayOfKeyValuePairOfstringstring;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfKeyValuePairOfstringstring;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaign;
import com.microsoft.bingads.v13.bulk.entities.BulkResponsiveAd;
import com.microsoft.bingads.v13.campaignmanagement.KeyValuePairOfstringstring;
import com.microsoft.bingads.v13.campaignmanagement.Setting;
import com.microsoft.bingads.v13.campaignmanagement.VerifiedTrackingSetting;

public class BulkResponsiveAdReadFromRowValuesVerifiedTrackingDatasTest extends BulkResponsiveAdTest {

	@Parameterized.Parameter(value = 1)
	public VerifiedTrackingSetting expectedResult;

    @Parameters
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
        return Arrays.asList(
                new Object[][]{
                        {"[[{\"key\":\"vendorName\",\"value\":\"IAS\"},{\"key\":\"advertiserEntityId\",\"value\":\"CampaignId_1\"},{\"key\":\"publisherEntityId\",\"value\":\"PlacementId_1\"}]]", setting1},
                }
        );
    }

    @Test
    public void testRead() {
    	Map<String, String> values = new HashMap<String, String>();

        values.put("Verified Tracking Settings", datum);

        testReadProperty(
                values,
                this.expectedResult,
                new Function<BulkResponsiveAd, VerifiedTrackingSetting>() {
                    @Override
                    public VerifiedTrackingSetting apply(BulkResponsiveAd c) {
                    	return c.getResponsiveAd().getVerifiedTrackingSettings();
                    }
                },
                new ObjectComparer<VerifiedTrackingSetting>()
        );
    }
}
