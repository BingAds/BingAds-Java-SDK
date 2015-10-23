package com.microsoft.bingads.v10.api.test.entities.targets.campaign.bids.age;

import com.microsoft.bingads.v10.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaignAgeTargetBid;
import com.microsoft.bingads.v10.campaignmanagement.AgeRange;
import com.microsoft.bingads.v10.campaignmanagement.AgeTargetBid;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;

import java.util.Map;

public abstract class BulkCampaignAgeTargetBidTest extends BulkEntityTest<BulkCampaignAgeTargetBid> {

    @Override
    protected void onEntityCreation(BulkCampaignAgeTargetBid entity) {
        AgeTargetBid bid = new AgeTargetBid();

        bid.setAge(AgeRange.EIGHTEEN_TO_TWENTY_FIVE);

        entity.setAgeTargetBid(bid);
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkCampaignAgeTargetBid, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkCampaignAgeTargetBid>() {
            @Override
            public BulkCampaignAgeTargetBid get() {
                return new BulkCampaignAgeTargetBid();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkCampaignAgeTargetBid, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkCampaignAgeTargetBid>() {
            @Override
            public BulkCampaignAgeTargetBid get() {
                return new BulkCampaignAgeTargetBid();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkCampaignAgeTargetBid, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkCampaignAgeTargetBid>() {
            @Override
            public BulkCampaignAgeTargetBid get() {
                return new BulkCampaignAgeTargetBid();
            }
        });
    }

}
