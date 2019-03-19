package com.microsoft.bingads.v12.api.test.entities.ads.appInstall;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v12.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v12.bulk.entities.BulkAppInstallAd;
import com.microsoft.bingads.v12.campaignmanagement.AppInstallAd;

public abstract class BulkAppInstallAdTest extends BulkEntityTest<BulkAppInstallAd> {

    @Override
    protected void onEntityCreation(BulkAppInstallAd entity) {
        AppInstallAd ad = new AppInstallAd();
        ad.setId(100L);
        entity.setAppInstallAd(ad);
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkAppInstallAd, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkAppInstallAd>() {
            @Override
            public BulkAppInstallAd get() {
                return new BulkAppInstallAd();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkAppInstallAd, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAppInstallAd>() {
            @Override
            public BulkAppInstallAd get() {
                return new BulkAppInstallAd();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkAppInstallAd, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkAppInstallAd>() {
            @Override
            public BulkAppInstallAd get() {
                return new BulkAppInstallAd();
            }
        });
    }
}
