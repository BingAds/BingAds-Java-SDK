package com.microsoft.bingads.v13.api.test.entities.ads.responsivesearch.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.ads.responsivesearch.BulkResponsiveSearchAdTest;
import com.microsoft.bingads.v13.bulk.entities.BulkResponsiveSearchAd;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;

public class BulkRSAWriteFromRowValuesDescriptionTest extends BulkResponsiveSearchAdTest {

    @Parameterized.Parameter(value = 1)
    public String expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"[{\"id\":123456,\"text\":\"textAssetLink Text\",\"pinnedField\":\"PinnedField\",\"editorialStatus\":\"Active\",\"assetPerformanceLabel\":\"AssetPerformanceLabel\",\"name\":\"testAssetName\"},{\"id\":123,\"text\":\"textAssetLink Text\",\"pinnedField\":\"PinnedField\",\"editorialStatus\":\"Active\",\"assetPerformanceLabel\":\"AssetPerformanceLabel\",\"name\":\"testAssetName\"}]",
            "[{\"id\":123456,\"text\":\"textAssetLink Text\",\"pinnedField\":\"PinnedField\",\"editorialStatus\":\"Active\",\"assetPerformanceLabel\":\"AssetPerformanceLabel\",\"name\":\"testAssetName\"},{\"id\":123,\"text\":\"textAssetLink Text\",\"pinnedField\":\"PinnedField\",\"editorialStatus\":\"Active\",\"assetPerformanceLabel\":\"AssetPerformanceLabel\",\"name\":\"testAssetName\"}]"},
         {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.testWriteProperty("Description", this.datum, this.expectedResult, new BiConsumer<BulkResponsiveSearchAd, String>() {
            @Override
            public void accept(BulkResponsiveSearchAd c, String v) {
                c.getResponsiveSearchAd().setDescriptions(StringExtensions.parseTextAssetLinks(v));
            }
        });
    }
}
