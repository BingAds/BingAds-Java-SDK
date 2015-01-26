package com.microsoft.bingads.api.test.entities.targets.campaign.bids.location;

import com.microsoft.bingads.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.bulk.entities.BulkCampaignLocationTargetBid;
import com.microsoft.bingads.bulk.entities.LocationTargetType;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import java.util.Map;

public abstract class BulkCampaignLocationTargetBidTest extends BulkEntityTest<BulkCampaignLocationTargetBid> {

    @Override
    protected void onEntityCreation(BulkCampaignLocationTargetBid entity) {
        entity.setLocationType(LocationTargetType.CITY);
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkCampaignLocationTargetBid, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkCampaignLocationTargetBid>() {
            @Override
            public BulkCampaignLocationTargetBid get() {
                return new BulkCampaignLocationTargetBid();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkCampaignLocationTargetBid, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkCampaignLocationTargetBid>() {
            @Override
            public BulkCampaignLocationTargetBid get() {
                return new BulkCampaignLocationTargetBid();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkCampaignLocationTargetBid, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkCampaignLocationTargetBid>() {
            @Override
            public BulkCampaignLocationTargetBid get() {
                return new BulkCampaignLocationTargetBid();
            }
        });
    }

}
