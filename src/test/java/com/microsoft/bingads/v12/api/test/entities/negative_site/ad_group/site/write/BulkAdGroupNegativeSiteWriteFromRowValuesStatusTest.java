package com.microsoft.bingads.v12.api.test.entities.negative_site.ad_group.site.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v12.api.test.entities.negative_site.ad_group.site.BulkAdGroupNegativeSiteTest;
import com.microsoft.bingads.v12.bulk.entities.BulkAdGroupNegativeSite;
import com.microsoft.bingads.v12.bulk.entities.Status;

public class BulkAdGroupNegativeSiteWriteFromRowValuesStatusTest extends BulkAdGroupNegativeSiteTest {

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
    public void testWrite() {
        this.<Status>testWriteProperty("Status", this.datum, this.expectedResult, new BiConsumer<BulkAdGroupNegativeSite, Status>() {
            @Override
            public void accept(BulkAdGroupNegativeSite c, Status v) {
                c.setStatus(v);
            }
        });
    }
}
