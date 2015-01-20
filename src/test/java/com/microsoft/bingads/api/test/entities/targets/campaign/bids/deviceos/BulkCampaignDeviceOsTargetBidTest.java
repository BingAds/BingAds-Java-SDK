package com.microsoft.bingads.api.test.entities.targets.campaign.bids.deviceos;

import com.microsoft.bingads.api.test.entities.targets.campaign.bids.deviceos.*;
import com.microsoft.bingads.api.test.entities.targets.campaign.bids.deviceos.*;
import java.util.Map;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalInterfaces.Function;
import com.microsoft.bingads.internal.functionalInterfaces.Supplier;

import com.microsoft.bingads.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.bulk.entities.BulkCampaignDeviceOsTargetBid;
import com.microsoft.bingads.campaignmanagement.DeviceOSTargetBid;

public abstract class BulkCampaignDeviceOsTargetBidTest extends BulkEntityTest<BulkCampaignDeviceOsTargetBid> {

    @Override
    protected void onEntityCreation(BulkCampaignDeviceOsTargetBid entity) {
        DeviceOSTargetBid bid = new DeviceOSTargetBid();       

        entity.setDeviceOsTargetBid(bid);
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkCampaignDeviceOsTargetBid, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkCampaignDeviceOsTargetBid>() {
            @Override
            public BulkCampaignDeviceOsTargetBid get() {
                return new BulkCampaignDeviceOsTargetBid();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkCampaignDeviceOsTargetBid, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkCampaignDeviceOsTargetBid>() {
            @Override
            public BulkCampaignDeviceOsTargetBid get() {
                return new BulkCampaignDeviceOsTargetBid();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkCampaignDeviceOsTargetBid, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkCampaignDeviceOsTargetBid>() {
            @Override
            public BulkCampaignDeviceOsTargetBid get() {
                return new BulkCampaignDeviceOsTargetBid();
            }
        });
    }

}
