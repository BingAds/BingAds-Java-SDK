package com.microsoft.bingads.api.test.entities.targets.campaign.bids.negativelocation;

import com.microsoft.bingads.api.test.entities.targets.campaign.bids.negativelocation.*;
import java.util.Map;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalInterfaces.Function;
import com.microsoft.bingads.internal.functionalInterfaces.Supplier;

import com.microsoft.bingads.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.bulk.entities.BulkCampaignNegativeLocationTargetBid;
import com.microsoft.bingads.bulk.entities.LocationTargetType;

public abstract class BulkCampaignNegativeLocationTargetBidTest extends BulkEntityTest<BulkCampaignNegativeLocationTargetBid> {

    @Override
    protected void onEntityCreation(BulkCampaignNegativeLocationTargetBid entity) {
        entity.setLocationType(LocationTargetType.CITY);
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkCampaignNegativeLocationTargetBid, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkCampaignNegativeLocationTargetBid>() {
            @Override
            public BulkCampaignNegativeLocationTargetBid get() {
                return new BulkCampaignNegativeLocationTargetBid();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkCampaignNegativeLocationTargetBid, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkCampaignNegativeLocationTargetBid>() {
            @Override
            public BulkCampaignNegativeLocationTargetBid get() {
                return new BulkCampaignNegativeLocationTargetBid();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkCampaignNegativeLocationTargetBid, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkCampaignNegativeLocationTargetBid>() {
            @Override
            public BulkCampaignNegativeLocationTargetBid get() {
                return new BulkCampaignNegativeLocationTargetBid();
            }
        });
    }

}
