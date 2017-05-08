package com.microsoft.bingads.v11.api.test.entities.criterions.campaign.daytime;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v11.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignDayTimeCriterion;
import com.microsoft.bingads.v11.campaignmanagement.DayTimeCriterion;
import com.microsoft.bingads.v11.campaignmanagement.BiddableCampaignCriterion;
import java.util.Map;

public abstract class BulkCampaignDayTimeCriterionTest extends BulkEntityTest<BulkCampaignDayTimeCriterion> {

    @Override
    protected void onEntityCreation(BulkCampaignDayTimeCriterion entity) {
        DayTimeCriterion daytimeCriterion = new DayTimeCriterion();
        daytimeCriterion.setType("DayTimeCriterion");

        BiddableCampaignCriterion biddableCampaignCriterion = new BiddableCampaignCriterion();
        biddableCampaignCriterion.setCriterion(daytimeCriterion);

        entity.setCampaignCriterion(biddableCampaignCriterion);
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue,
            TProperty propertyValue,
            BiConsumer<BulkCampaignDayTimeCriterion, TProperty> setFunc
    ) {
        testWriteProperty(
                header,
                expectedRowValue,
                propertyValue,
                setFunc,
                new Supplier<BulkCampaignDayTimeCriterion>() {
                    @Override
                    public BulkCampaignDayTimeCriterion get() {
                        return new BulkCampaignDayTimeCriterion();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkCampaignDayTimeCriterion, TProperty> actualValueFunc
    ) {
        testReadProperty(
                header,
                input,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkCampaignDayTimeCriterion>() {
                    @Override
                    public BulkCampaignDayTimeCriterion get() {
                        return new BulkCampaignDayTimeCriterion();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkCampaignDayTimeCriterion, TProperty> actualValueFunc
    ) {
        testReadProperty(
                rowValues,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkCampaignDayTimeCriterion>() {
                    @Override
                    public BulkCampaignDayTimeCriterion get() {
                        return new BulkCampaignDayTimeCriterion();
                    }
                }
        );
    }
}
