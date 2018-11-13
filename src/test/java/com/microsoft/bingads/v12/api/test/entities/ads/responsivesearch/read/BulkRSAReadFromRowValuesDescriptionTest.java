package com.microsoft.bingads.v12.api.test.entities.ads.responsivesearch.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.api.test.entities.ads.responsivesearch.BulkResponsiveSearchAdTest;
import com.microsoft.bingads.v12.bulk.entities.BulkResponsiveSearchAd;
import com.microsoft.bingads.v12.internal.bulk.StringExtensions;

public class BulkRSAReadFromRowValuesDescriptionTest extends BulkResponsiveSearchAdTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"[{\"id\":123456,\"text\":\"textAssetLink Text\",\"pinnedField\":\"PinnedField\",\"editorialStatus\":\"Active\",\"assetPerformanceLabel\":\"AssetPerformanceLabel\",\"name\":\"testAssetName\"},{\"id\":123,\"text\":\"textAssetLink Text\",\"pinnedField\":\"PinnedField\",\"editorialStatus\":\"Active\",\"assetPerformanceLabel\":\"AssetPerformanceLabel\",\"name\":\"testAssetName\"}]",
                    "[{\"id\":123456,\"text\":\"textAssetLink Text\",\"pinnedField\":\"PinnedField\",\"editorialStatus\":\"Active\",\"assetPerformanceLabel\":\"AssetPerformanceLabel\",\"name\":\"testAssetName\"},{\"id\":123,\"text\":\"textAssetLink Text\",\"pinnedField\":\"PinnedField\",\"editorialStatus\":\"Active\",\"assetPerformanceLabel\":\"AssetPerformanceLabel\",\"name\":\"testAssetName\"}]"},
                {null, null}
        });
    }

    @Test
    public void testRead() {
        this.testReadProperty("Description", this.datum, this.expectedResult, new Function<BulkResponsiveSearchAd, String>() {
            @Override
            public String apply(BulkResponsiveSearchAd c) {
                return StringExtensions.toTextAssetLinksBulkString(c.getResponsiveSearchAd().getDescriptions());
            }
        });
    }
}
