package com.microsoft.bingads.v12.api.test.entities.negative_site.ad_group.site.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v12.api.test.entities.negative_site.ad_group.site.BulkAdGroupNegativeSiteTest;
import com.microsoft.bingads.v12.bulk.entities.BulkAdGroupNegativeSite;

public class BulkAdGroupNegativeSiteWriteFromRowValuesWebsiteTest extends BulkAdGroupNegativeSiteTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Test text", "Test text"},
            {"", ""},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Website", this.datum, this.expectedResult, new BiConsumer<BulkAdGroupNegativeSite, String>() {
            @Override
            public void accept(BulkAdGroupNegativeSite c, String v) {
                c.setWebsite(v);
            }
        });
    }
}
