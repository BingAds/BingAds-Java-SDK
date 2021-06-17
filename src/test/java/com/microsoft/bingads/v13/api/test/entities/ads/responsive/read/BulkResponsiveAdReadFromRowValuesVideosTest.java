package com.microsoft.bingads.v13.api.test.entities.ads.responsive.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.ads.responsive.BulkResponsiveAdTest;
import com.microsoft.bingads.v13.bulk.entities.BulkResponsiveAd;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;

public class BulkResponsiveAdReadFromRowValuesVideosTest extends BulkResponsiveAdTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"[{\"id\":123456,\"subType\":\"subType\",\"thumbnailImage\":{\"id\":456,\"name\":\"testName\",\"type\":\"ImageAsset\",\"cropX\":1234,\"cropY\":1234,\"cropWidth\":1234,\"cropHeight\":1234,\"subType\":\"subType\"},\"pinnedField\":\"PinnedField\",\"editorialStatus\":\"Active\",\"assetPerformanceLabel\":\"AssetPerformanceLabel\",\"name\":\"testAssetName\"},{\"id\":1234567,\"subType\":\"subType\",\"thumbnailImage\":{\"id\":456,\"name\":\"testName\",\"type\":\"ImageAsset\",\"cropHeight\":1234,\"cropWidth\":1234, \"cropX\":1234,\"cropY\":1234,\"subType\":\"subType\"},\"pinnedField\":\"PinnedField\",\"editorialStatus\":\"Active\",\"assetPerformanceLabel\":\"AssetPerformanceLabel\",\"name\":\"testAssetName\"}]",
                "[{\"id\":123456,\"subType\":\"subType\",\"thumbnailImage\":{\"id\":456,\"name\":\"testName\",\"type\":\"ImageAsset\",\"cropHeight\":1234,\"cropWidth\":1234,\"cropX\":1234,\"cropY\":1234,\"subType\":\"subType\"},\"pinnedField\":\"PinnedField\",\"editorialStatus\":\"Active\",\"assetPerformanceLabel\":\"AssetPerformanceLabel\",\"name\":\"testAssetName\"},{\"id\":1234567,\"subType\":\"subType\",\"thumbnailImage\":{\"id\":456,\"name\":\"testName\",\"type\":\"ImageAsset\",\"cropHeight\":1234,\"cropWidth\":1234,\"cropX\":1234,\"cropY\":1234,\"subType\":\"subType\"},\"pinnedField\":\"PinnedField\",\"editorialStatus\":\"Active\",\"assetPerformanceLabel\":\"AssetPerformanceLabel\",\"name\":\"testAssetName\"}]"},
            {null, null}
    });
    }
    @Test
    public void testRead() {
        this.testReadProperty("Videos", this.datum, this.expectedResult, new Function<BulkResponsiveAd, String>() {
            @Override
            public String apply(BulkResponsiveAd c) {
                return StringExtensions.toVideoAssetLinksBulkString(c.getResponsiveAd().getVideos());
            }
        });
    }
}
