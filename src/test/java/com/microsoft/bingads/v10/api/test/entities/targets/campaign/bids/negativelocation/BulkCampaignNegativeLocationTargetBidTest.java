package com.microsoft.bingads.v10.api.test.entities.targets.campaign.bids.negativelocation;

import com.microsoft.bingads.v10.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaignNegativeLocationTargetBid;
import com.microsoft.bingads.v10.bulk.entities.LocationTargetType;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import java.util.Map;

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
