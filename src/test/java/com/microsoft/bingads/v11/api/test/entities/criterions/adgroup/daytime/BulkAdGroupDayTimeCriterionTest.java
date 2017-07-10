package com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.daytime;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v11.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupDayTimeCriterion;
import com.microsoft.bingads.v11.campaignmanagement.DayTimeCriterion;
import com.microsoft.bingads.v11.campaignmanagement.BiddableAdGroupCriterion;
import java.util.Map;

public abstract class BulkAdGroupDayTimeCriterionTest extends BulkEntityTest<BulkAdGroupDayTimeCriterion> {

    @Override
    protected void onEntityCreation(BulkAdGroupDayTimeCriterion entity) {
        DayTimeCriterion daytimeCriterion = new DayTimeCriterion();
        daytimeCriterion.setType("DayTimeCriterion");

        BiddableAdGroupCriterion biddableAdGroupCriterion = new BiddableAdGroupCriterion();
        biddableAdGroupCriterion.setCriterion(daytimeCriterion);

        entity.setBiddableAdGroupCriterion(biddableAdGroupCriterion);
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue,
            TProperty propertyValue,
            BiConsumer<BulkAdGroupDayTimeCriterion, TProperty> setFunc
    ) {
        testWriteProperty(
                header,
                expectedRowValue,
                propertyValue,
                setFunc,
                new Supplier<BulkAdGroupDayTimeCriterion>() {
                    @Override
                    public BulkAdGroupDayTimeCriterion get() {
                        return new BulkAdGroupDayTimeCriterion();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkAdGroupDayTimeCriterion, TProperty> actualValueFunc
    ) {
        testReadProperty(
                header,
                input,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkAdGroupDayTimeCriterion>() {
                    @Override
                    public BulkAdGroupDayTimeCriterion get() {
                        return new BulkAdGroupDayTimeCriterion();
                    }
                }
        );
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkAdGroupDayTimeCriterion, TProperty> actualValueFunc
    ) {
        testReadProperty(
                rowValues,
                expectedResult,
                actualValueFunc,
                new Supplier<BulkAdGroupDayTimeCriterion>() {
                    @Override
                    public BulkAdGroupDayTimeCriterion get() {
                        return new BulkAdGroupDayTimeCriterion();
                    }
                }
        );
    }
}
