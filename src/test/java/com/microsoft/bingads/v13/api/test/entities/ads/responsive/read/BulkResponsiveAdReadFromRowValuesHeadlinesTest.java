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

public class BulkResponsiveAdReadFromRowValuesHeadlinesTest extends BulkResponsiveAdTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"[{\"id\":123456,\"text\":\"a sample headline\",\"pinnedField\":\"PinnedField\",\"editorialStatus\":\"Active\",\"assetPerformanceLabel\":\"AssetPerformanceLabel\",\"name\":\"testAssetName\"},{\"id\":123456,\"text\":\"a sample headline 2\",\"pinnedField\":\"PinnedField\",\"editorialStatus\":\"Active\",\"assetPerformanceLabel\":\"AssetPerformanceLabel\",\"name\":\"testAssetName\"}]",
                "[{\"id\":123456,\"text\":\"a sample headline\",\"pinnedField\":\"PinnedField\",\"editorialStatus\":\"Active\",\"assetPerformanceLabel\":\"AssetPerformanceLabel\",\"name\":\"testAssetName\"},{\"id\":123456,\"text\":\"a sample headline 2\",\"pinnedField\":\"PinnedField\",\"editorialStatus\":\"Active\",\"assetPerformanceLabel\":\"AssetPerformanceLabel\",\"name\":\"testAssetName\"}]"},
            {null, null}
    });
    }

    @Test
    public void testRead() {
        this.testReadProperty("Headlines", this.datum, this.expectedResult, new Function<BulkResponsiveAd, String>() {
            @Override
            public String apply(BulkResponsiveAd c) {
                return StringExtensions.toTextAssetLinksBulkString(c.getResponsiveAd().getHeadlines());
            }
        });
    }
}
