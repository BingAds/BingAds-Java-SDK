package com.microsoft.bingads.v12.api.test.entities.ads.responsivesearch.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v12.api.test.entities.ads.responsivesearch.BulkResponsiveSearchAdTest;
import com.microsoft.bingads.v12.bulk.entities.BulkResponsiveSearchAd;

public class BulkRSAWriteFromRowValuesDomainTest extends BulkResponsiveSearchAdTest {

    @Parameterized.Parameter(value = 1)
    public String expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Text string", "Text string"},
                {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.testWriteProperty("Domain", this.datum, this.expectedResult, new BiConsumer<BulkResponsiveSearchAd, String>() {
            @Override
            public void accept(BulkResponsiveSearchAd c, String v) {
                c.getResponsiveSearchAd().setDomain(v);
            }
        });
    }
}
