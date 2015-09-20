package com.microsoft.bingads.v10.api.test.entities.ad_extension.app.read;

import com.microsoft.bingads.v10.api.test.entities.ad_extension.app.BulkAdGroupAppAdExtensionTest;
import com.microsoft.bingads.v10.bulk.entities.BulkAdGroupAppAdExtension;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class BulkAdGroupAppAdExtensionReadFromRowValuesCampaignNameTest extends BulkAdGroupAppAdExtensionTest {
    @Parameterized.Parameter(value = 1)
    public String expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Campaign Name String", "Campaign Name String"},
                {"", ""},
                {null, null}
        });
    }

    @Test
    public void testRead() {
        this.testReadProperty("Campaign", this.datum, this.expectedResult, new Function<BulkAdGroupAppAdExtension, String>() {
            @Override
            public String apply(BulkAdGroupAppAdExtension c) {
                return c.getCampaignName();
            }
        });
    }
}
