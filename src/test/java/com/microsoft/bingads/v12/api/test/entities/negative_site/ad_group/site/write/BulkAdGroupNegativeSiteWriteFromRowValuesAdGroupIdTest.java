package com.microsoft.bingads.v12.api.test.entities.negative_site.ad_group.site.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v12.api.test.entities.negative_site.ad_group.site.BulkAdGroupNegativeSiteTest;
import com.microsoft.bingads.v12.bulk.entities.BulkAdGroupNegativeSite;

@RunWith(Parameterized.class)
public class BulkAdGroupNegativeSiteWriteFromRowValuesAdGroupIdTest extends BulkAdGroupNegativeSiteTest {

    @Parameter(value = 1)
    public Long expectedResult;

    @Parameters
    public static Collection<Object[]> data() {

        return Arrays.asList(new Object[][]{
            {"123", 123L},
            {"9223372036854775807", 9223372036854775807L},});
    }

    @Test
    public void testWrite() {
        this.<Long>testWriteProperty("Parent Id", this.datum, this.expectedResult, new BiConsumer<BulkAdGroupNegativeSite, Long>() {
            @Override
            public void accept(BulkAdGroupNegativeSite c, Long v) {
                c.setAdGroupId(v);
            }
        });
    }
}
