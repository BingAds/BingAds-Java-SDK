package com.microsoft.bingads.api.test.entities.negative_site.ad_group.site.read;

import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.Function;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.api.test.entities.negative_site.ad_group.site.BulkAdGroupNegativeSiteTest;
import com.microsoft.bingads.bulk.entities.Status;
import com.microsoft.bingads.bulk.entities.BulkAdGroupNegativeSite;

public class BulkAdGroupNegativeSiteReadFromRowValuesStatusTest extends BulkAdGroupNegativeSiteTest {

    @Parameter(value = 1)
    public Status expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Active", Status.ACTIVE},
            {"Deleted", Status.DELETED},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<Status>testReadProperty("Status", this.datum, this.expectedResult, new Function<BulkAdGroupNegativeSite, Status>() {
            @Override
            public Status apply(BulkAdGroupNegativeSite c) {
                return c.getStatus();
            }
        });
    }
}
