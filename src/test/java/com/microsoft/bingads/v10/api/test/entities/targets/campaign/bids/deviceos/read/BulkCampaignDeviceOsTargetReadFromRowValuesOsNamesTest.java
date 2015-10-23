package com.microsoft.bingads.v10.api.test.entities.targets.campaign.bids.deviceos.read;

import com.microsoft.bingads.v10.api.test.entities.targets.campaign.bids.deviceos.BulkCampaignDeviceOsTargetBidTest;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaignDeviceOsTargetBid;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkCampaignDeviceOsTargetReadFromRowValuesOsNamesTest extends BulkCampaignDeviceOsTargetBidTest {

    @Parameter(value = 1)
    public List<String> expectedResult;
    
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Windows;Linux", Arrays.asList("Windows", "Linux")},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<List<String>>testReadProperty("OS Names", this.datum, this.expectedResult, new Function<BulkCampaignDeviceOsTargetBid, List<String>>() {
            @Override
            public List<String> apply(BulkCampaignDeviceOsTargetBid c) {
                if (c.getDeviceOsTargetBid().getOSNames() == null) {
                    return null;
                }

                return c.getDeviceOsTargetBid().getOSNames().getStrings();
            }
        });
    }        
}
