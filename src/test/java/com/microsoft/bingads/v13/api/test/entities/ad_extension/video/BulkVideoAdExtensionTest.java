package com.microsoft.bingads.v13.api.test.entities.ad_extension.video;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.bulk.entities.BulkVideoAdExtension;
import com.microsoft.bingads.v13.campaignmanagement.VideoAdExtension;

public abstract class BulkVideoAdExtensionTest extends BulkEntityTest<BulkVideoAdExtension> {

    @Override
    protected void onEntityCreation(BulkVideoAdExtension entity) {
        VideoAdExtension e = new VideoAdExtension();
        e.setId(100L);
        entity.setVideoAdExtension(e);
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkVideoAdExtension, TProperty> setFunc) {
        this.testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkVideoAdExtension>() {
            @Override
            public BulkVideoAdExtension get() {
                return new BulkVideoAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkVideoAdExtension, TProperty> actualValueFunc) {
        this.testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkVideoAdExtension>() {
            @Override
            public BulkVideoAdExtension get() {
                return new BulkVideoAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkVideoAdExtension, TProperty> actualValueFunc) {
        this.testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkVideoAdExtension>() {
            @Override
            public BulkVideoAdExtension get() {
                return new BulkVideoAdExtension();
            }
        });
    }

}
