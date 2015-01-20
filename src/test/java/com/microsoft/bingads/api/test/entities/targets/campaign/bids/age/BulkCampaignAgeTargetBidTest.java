package com.microsoft.bingads.api.test.entities.targets.campaign.bids.age;

import com.microsoft.bingads.api.test.entities.targets.campaign.bids.age.*;
import java.util.Map;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalInterfaces.Function;
import com.microsoft.bingads.internal.functionalInterfaces.Supplier;

import com.microsoft.bingads.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.bulk.entities.BulkCampaignAgeTargetBid;
import com.microsoft.bingads.campaignmanagement.AgeRange;
import com.microsoft.bingads.campaignmanagement.AgeTargetBid;

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
