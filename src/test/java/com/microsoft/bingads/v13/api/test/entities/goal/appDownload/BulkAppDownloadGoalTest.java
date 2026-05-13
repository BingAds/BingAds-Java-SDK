package com.microsoft.bingads.v13.api.test.entities.goal.appDownload;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAppDownloadGoal;
import com.microsoft.bingads.v13.campaignmanagement.AppDownloadGoal;

public abstract class BulkAppDownloadGoalTest extends BulkEntityTest<BulkAppDownloadGoal> {

    @Override
    protected void onEntityCreation(BulkAppDownloadGoal entity) {
        entity.setAppDownloadGoal(new AppDownloadGoal());
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkAppDownloadGoal, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkAppDownloadGoal>() {
            @Override
            public BulkAppDownloadGoal get() {
                return new BulkAppDownloadGoal();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkAppDownloadGoal, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAppDownloadGoal>() {
            @Override
            public BulkAppDownloadGoal get() {
                return new BulkAppDownloadGoal();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkAppDownloadGoal, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkAppDownloadGoal>() {
            @Override
            public BulkAppDownloadGoal get() {
                return new BulkAppDownloadGoal();
            }
        });
    }
}
