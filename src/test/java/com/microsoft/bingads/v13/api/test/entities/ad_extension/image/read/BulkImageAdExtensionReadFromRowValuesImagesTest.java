package com.microsoft.bingads.v13.api.test.entities.ad_extension.image.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.image.BulkImageAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkImageAdExtension;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;

public class BulkImageAdExtensionReadFromRowValuesImagesTest extends BulkImageAdExtensionTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"[{\"id\":123456,\"subType\":\"subType\",\"cropHeight\":1234,\"cropWidth\":1234,\"cropX\":1234,\"cropY\":1234,\"pinnedField\":\"PinnedField\",\"editorialStatus\":\"Active\",\"assetPerformanceLabel\":\"AssetPerformanceLabel\",\"name\":\"testAssetName\",\"targetWidth\":100,\"targetHeight\":100},{\"id\":123456,\"subType\":\"subType\",\"cropHeight\":1234,\"cropWidth\":1234,\"cropX\":1234,\"cropY\":1234,\"pinnedField\":\"PinnedField\",\"editorialStatus\":\"Active\",\"assetPerformanceLabel\":\"AssetPerformanceLabel\",\"name\":\"testAssetName\",\"targetWidth\":100,\"targetHeight\":100}]",
                "[{\"id\":123456,\"subType\":\"subType\",\"cropHeight\":1234,\"cropWidth\":1234,\"cropX\":1234,\"cropY\":1234,\"pinnedField\":\"PinnedField\",\"editorialStatus\":\"Active\",\"assetPerformanceLabel\":\"AssetPerformanceLabel\",\"name\":\"testAssetName\",\"targetWidth\":100,\"targetHeight\":100},{\"id\":123456,\"subType\":\"subType\",\"cropHeight\":1234,\"cropWidth\":1234,\"cropX\":1234,\"cropY\":1234,\"pinnedField\":\"PinnedField\",\"editorialStatus\":\"Active\",\"assetPerformanceLabel\":\"AssetPerformanceLabel\",\"name\":\"testAssetName\",\"targetWidth\":100,\"targetHeight\":100}]"},
            {null, null}
    });
    }

    @Test
    public void testRead() {
        this.testReadProperty("Images", this.datum, this.expectedResult, new Function<BulkImageAdExtension, String>() {
            @Override
            public String apply(BulkImageAdExtension c) {
                return StringExtensions.toImageAssetLinksBulkString(c.getImageAdExtension().getImages());
            }
        });
    }
}
