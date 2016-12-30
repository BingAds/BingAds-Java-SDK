package com.microsoft.bingads.v10.api.test.entities.ads.dynamicSearch.write;

import com.microsoft.bingads.v10.api.test.entities.ads.dynamicSearch.BulkDynamicSearchAdTest;
import com.microsoft.bingads.v10.bulk.entities.BulkDynamicSearchAd;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkDynamicSearchAdWriteToRowValuesPath1Test extends BulkDynamicSearchAdTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"path1", "path1"},
            {"", ""},
            {null, null},});
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Path 1", this.datum, this.propertyValue, new BiConsumer<BulkDynamicSearchAd, String>() {
            @Override
            public void accept(BulkDynamicSearchAd c, String v) {
                c.getDynamicSearchAd().setPath1(v);
            }
        });
    }
}
