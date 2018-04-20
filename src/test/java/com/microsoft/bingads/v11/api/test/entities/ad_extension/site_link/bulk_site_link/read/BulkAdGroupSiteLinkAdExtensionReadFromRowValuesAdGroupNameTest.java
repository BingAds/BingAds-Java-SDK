package com.microsoft.bingads.v11.api.test.entities.ad_extension.site_link.bulk_site_link.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.ad_extension.site_link.bulk_site_link.BulkAdGroupSiteLinkAdExtensionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupSiteLinkAdExtension;

public class BulkAdGroupSiteLinkAdExtensionReadFromRowValuesAdGroupNameTest extends BulkAdGroupSiteLinkAdExtensionTest {
    @Parameterized.Parameter(value = 1)
    public String expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Ad Group Name String", "Ad Group Name String"},
                {"", ""},
                {null, null}
        });
    }

    @Test
    public void testRead() {
        this.testReadProperty("Ad Group", this.datum, this.expectedResult, new Function<BulkAdGroupSiteLinkAdExtension, String>() {
            @Override
            public String apply(BulkAdGroupSiteLinkAdExtension c) {
                return c.getAdGroupName();
            }
        });
    }
}
