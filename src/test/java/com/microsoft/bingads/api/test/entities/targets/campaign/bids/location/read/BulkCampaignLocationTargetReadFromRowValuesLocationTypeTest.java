package com.microsoft.bingads.api.test.entities.targets.campaign.bids.location.read;

import com.microsoft.bingads.api.test.entities.targets.campaign.bids.location.BulkCampaignLocationTargetBidTest;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.Function;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.bulk.entities.BulkCampaignLocationTargetBid;
import com.microsoft.bingads.bulk.entities.LocationTargetType;

@RunWith(Parameterized.class)
public class BulkCampaignLocationTargetReadFromRowValuesLocationTypeTest extends BulkCampaignLocationTargetBidTest {

    @Parameter(value = 1)
    public LocationTargetType expectedResult;
    
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Postal Code", LocationTargetType.POSTAL_CODE},
            {"City", LocationTargetType.CITY},
            {"Metro Area", LocationTargetType.METRO_AREA},
            {"State", LocationTargetType.STATE},
            {"Country", LocationTargetType.COUNTRY}
        });
    }

    @Test
    public void testRead() {
        this.<LocationTargetType>testReadProperty("Sub Type", this.datum, this.expectedResult, new Function<BulkCampaignLocationTargetBid, LocationTargetType>() {
            @Override
            public LocationTargetType apply(BulkCampaignLocationTargetBid c) {
                return c.getLocationType();
            }
        });
    }        
}
