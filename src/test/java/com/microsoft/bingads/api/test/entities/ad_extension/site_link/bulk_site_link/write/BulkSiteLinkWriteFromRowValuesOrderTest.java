package com.microsoft.bingads.api.test.entities.ad_extension.site_link.bulk_site_link.write;

import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.api.test.entities.ad_extension.site_link.bulk_site_link.BulkSiteLinkTest;
import com.microsoft.bingads.bulk.entities.BulkSiteLink;

public class BulkSiteLinkWriteFromRowValuesOrderTest extends BulkSiteLinkTest {

    @Parameter(value = 1)
    public Integer expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"123", 123},
            {"2147483647", 2147483647},});
    }

    @Test
    public void testWrite() {
        this.<Integer>testWriteProperty("Sitelink Extension Order", this.datum, this.expectedResult, new BiConsumer<BulkSiteLink, Integer>() {
            @Override
            public void accept(BulkSiteLink c, Integer v) {
                c.setOrder(v);
            }
        });
    }
}
