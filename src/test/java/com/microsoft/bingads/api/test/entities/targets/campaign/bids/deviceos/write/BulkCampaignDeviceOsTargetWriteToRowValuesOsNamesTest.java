package com.microsoft.bingads.api.test.entities.targets.campaign.bids.deviceos.write;

import com.microsoft.bingads.api.test.entities.targets.campaign.bids.deviceos.write.*;
import com.microsoft.bingads.api.test.entities.targets.campaign.bids.deviceos.write.*;
import com.microsoft.bingads.api.test.entities.targets.campaign.bids.deviceos.write.*;
import com.microsoft.bingads.api.test.entities.targets.campaign.bids.deviceos.BulkCampaignDeviceOsTargetBidTest;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.bulk.entities.BulkCampaignDeviceOsTargetBid;
import com.microsoft.bingads.campaignmanagement.ArrayOfstring;
import java.util.List;

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
