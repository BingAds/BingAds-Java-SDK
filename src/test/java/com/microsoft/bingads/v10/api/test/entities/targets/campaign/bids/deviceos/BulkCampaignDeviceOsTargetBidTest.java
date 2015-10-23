package com.microsoft.bingads.v10.api.test.entities.targets.campaign.bids.deviceos;

import com.microsoft.bingads.v10.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaignDeviceOsTargetBid;
import com.microsoft.bingads.v10.campaignmanagement.DeviceOSTargetBid;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;

import java.util.Map;

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
