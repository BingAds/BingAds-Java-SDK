package com.microsoft.bingads.v10.api.test.entities.targets.campaign.bids.deviceos.write;

import com.microsoft.bingads.v10.api.test.entities.targets.campaign.bids.deviceos.BulkCampaignDeviceOsTargetBidTest;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaignDeviceOsTargetBid;
import com.microsoft.bingads.v10.campaignmanagement.ArrayOfstring;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkCampaignDeviceOsTargetWriteToRowValuesOsNamesTest extends BulkCampaignDeviceOsTargetBidTest {

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
    public void testWrite() {
        this.<List<String>>testWriteProperty("OS Names", this.datum, this.expectedResult, new BiConsumer<BulkCampaignDeviceOsTargetBid, List<String>>() {
            @Override
            public void accept(BulkCampaignDeviceOsTargetBid c, List<String> v) {
                if (v == null) {
                    return;
                }

                ArrayOfstring array = new ArrayOfstring();
                array.getStrings().addAll(v);
                
                c.getDeviceOsTargetBid().setOSNames(array);
            }
        });
    }
}
