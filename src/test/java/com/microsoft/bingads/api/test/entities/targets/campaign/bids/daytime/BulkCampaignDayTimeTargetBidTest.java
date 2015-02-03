package com.microsoft.bingads.api.test.entities.targets.campaign.bids.daytime;

import com.microsoft.bingads.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.bulk.entities.BulkCampaignDayTimeTargetBid;
import com.microsoft.bingads.campaignmanagement.Day;
import com.microsoft.bingads.campaignmanagement.DayTimeTargetBid;
import com.microsoft.bingads.campaignmanagement.Minute;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import java.util.Map;

public abstract class BulkCampaignDayTimeTargetBidTest extends BulkEntityTest<BulkCampaignDayTimeTargetBid> {

    @Override
    protected void onEntityCreation(BulkCampaignDayTimeTargetBid entity) {
        DayTimeTargetBid bid = new DayTimeTargetBid();
        bid.setDay(Day.SUNDAY);
        bid.setFromMinute(Minute.ZERO);
        bid.setToMinute(Minute.ZERO);
        
        entity.setDayTimeTargetBid(bid);
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkCampaignDayTimeTargetBid, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkCampaignDayTimeTargetBid>() {
            @Override
            public BulkCampaignDayTimeTargetBid get() {
                return new BulkCampaignDayTimeTargetBid();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkCampaignDayTimeTargetBid, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkCampaignDayTimeTargetBid>() {
            @Override
            public BulkCampaignDayTimeTargetBid get() {
                return new BulkCampaignDayTimeTargetBid();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkCampaignDayTimeTargetBid, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkCampaignDayTimeTargetBid>() {
            @Override
            public BulkCampaignDayTimeTargetBid get() {
                return new BulkCampaignDayTimeTargetBid();
            }
        });
    }

}
