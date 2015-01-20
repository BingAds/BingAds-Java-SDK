package com.microsoft.bingads.api.test.entities.targets.campaign.bids.gender;

import com.microsoft.bingads.api.test.entities.targets.campaign.bids.gender.*;
import com.microsoft.bingads.api.test.entities.targets.campaign.bids.gender.*;
import java.util.Map;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalInterfaces.Function;
import com.microsoft.bingads.internal.functionalInterfaces.Supplier;

import com.microsoft.bingads.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.bulk.entities.BulkCampaignGenderTargetBid;
import com.microsoft.bingads.campaignmanagement.GenderType;
import com.microsoft.bingads.campaignmanagement.GenderTargetBid;

public abstract class BulkCampaignGenderTargetBidTest extends BulkEntityTest<BulkCampaignGenderTargetBid> {

    @Override
    protected void onEntityCreation(BulkCampaignGenderTargetBid entity) {
        GenderTargetBid bid = new GenderTargetBid();

        bid.setGender(GenderType.FEMALE);

        entity.setGenderTargetBid(bid);
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkCampaignGenderTargetBid, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkCampaignGenderTargetBid>() {
            @Override
            public BulkCampaignGenderTargetBid get() {
                return new BulkCampaignGenderTargetBid();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkCampaignGenderTargetBid, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkCampaignGenderTargetBid>() {
            @Override
            public BulkCampaignGenderTargetBid get() {
                return new BulkCampaignGenderTargetBid();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkCampaignGenderTargetBid, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkCampaignGenderTargetBid>() {
            @Override
            public BulkCampaignGenderTargetBid get() {
                return new BulkCampaignGenderTargetBid();
            }
        });
    }

}
