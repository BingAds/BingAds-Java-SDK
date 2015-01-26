package com.microsoft.bingads.api.test.entities.targets.campaign.bids.radius;

import com.microsoft.bingads.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.bulk.entities.BulkCampaignRadiusTargetBid;
import com.microsoft.bingads.campaignmanagement.RadiusTargetBid2;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import java.util.Map;

public abstract class BulkCampaignRadiusTargetBidTest extends BulkEntityTest<BulkCampaignRadiusTargetBid> {

    @Override
    protected void onEntityCreation(BulkCampaignRadiusTargetBid entity) {
        RadiusTargetBid2 bid = new RadiusTargetBid2();
        
        entity.setRadiusTargetBid(bid);
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkCampaignRadiusTargetBid, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkCampaignRadiusTargetBid>() {
            @Override
            public BulkCampaignRadiusTargetBid get() {
                return new BulkCampaignRadiusTargetBid();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkCampaignRadiusTargetBid, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkCampaignRadiusTargetBid>() {
            @Override
            public BulkCampaignRadiusTargetBid get() {
                return new BulkCampaignRadiusTargetBid();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkCampaignRadiusTargetBid, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkCampaignRadiusTargetBid>() {
            @Override
            public BulkCampaignRadiusTargetBid get() {
                return new BulkCampaignRadiusTargetBid();
            }
        });
    }

}
