package com.microsoft.bingads.api.test.entities.negative_site.ad_group.site.read;

import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.Function;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.api.test.entities.negative_site.ad_group.site.BulkAdGroupNegativeSiteTest;
import com.microsoft.bingads.bulk.entities.BulkAdGroupNegativeSite;

@RunWith(Parameterized.class)
public class BulkAdGroupNegativeSiteReadFromRowValuesAdGroupIdTest extends BulkAdGroupNegativeSiteTest {

    @Parameter(value = 1)
    public Long expectedResult;

    @Parameters
    public static Collection<Object[]> data() {

        return Arrays.asList(new Object[][]{
            {"123", 123L},
            {"9223372036854775807", 9223372036854775807L},});
    }

    @Test
    public void testRead() {
        this.<Long>testReadProperty("Parent Id", this.datum, this.expectedResult, new Function<BulkAdGroupNegativeSite, Long>() {
            @Override
            public Long apply(BulkAdGroupNegativeSite c) {
                return c.getAdGroupId();
            }
        });
    }
}
