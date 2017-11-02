package com.microsoft.bingads.v11.api.test.entities.negative_site.ad_group.site.read;

import com.microsoft.bingads.v11.api.test.entities.negative_site.ad_group.site.BulkAdGroupNegativeSiteTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupNegativeSite;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

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
