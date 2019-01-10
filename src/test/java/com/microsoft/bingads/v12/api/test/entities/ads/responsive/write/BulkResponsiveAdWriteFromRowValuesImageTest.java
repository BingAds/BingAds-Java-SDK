package com.microsoft.bingads.v12.api.test.entities.ads.responsive.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v12.api.test.entities.ads.responsive.BulkResponsiveAdTest;
import com.microsoft.bingads.v12.bulk.entities.BulkResponsiveAd;
import com.microsoft.bingads.v12.internal.bulk.StringExtensions;

public class BulkResponsiveAdWriteFromRowValuesImageTest extends BulkResponsiveAdTest {

    @Parameterized.Parameter(value = 1)
    public String expectedResult;


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"[{\"id\":123456,\"subType\":\"subType\",\"cropHeight\":1234,\"cropWidth\":1234,\"cropX\":1234,\"cropY\":1234,\"pinnedField\":\"PinnedField\",\"editorialStatus\":\"Active\",\"assetPerformanceLabel\":\"AssetPerformanceLabel\",\"name\":\"testAssetName\"},{\"id\":123456,\"subType\":\"subType\",\"cropHeight\":1234,\"cropWidth\":1234,\"cropX\":1234,\"cropY\":1234,\"pinnedField\":\"PinnedField\",\"editorialStatus\":\"Active\",\"assetPerformanceLabel\":\"AssetPerformanceLabel\",\"name\":\"testAssetName\"}]",
            "[{\"id\":123456,\"subType\":\"subType\",\"cropHeight\":1234,\"cropWidth\":1234,\"cropX\":1234,\"cropY\":1234,\"pinnedField\":\"PinnedField\",\"editorialStatus\":\"Active\",\"assetPerformanceLabel\":\"AssetPerformanceLabel\",\"name\":\"testAssetName\"},{\"id\":123456,\"subType\":\"subType\",\"cropHeight\":1234,\"cropWidth\":1234,\"cropX\":1234,\"cropY\":1234,\"pinnedField\":\"PinnedField\",\"editorialStatus\":\"Active\",\"assetPerformanceLabel\":\"AssetPerformanceLabel\",\"name\":\"testAssetName\"}]"},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.testWriteProperty("Images", this.datum, this.expectedResult, new BiConsumer<BulkResponsiveAd, String>() {
            @Override
            public void accept(BulkResponsiveAd c, String v) {
                c.getResponsiveAd().setImages(StringExtensions.parseImageAssetLinks(v));
            }
        });
    }
}
