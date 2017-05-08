package com.microsoft.bingads.v11.api.test.entities.ad_extension.callout.read;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.ad_extension.callout.BulkAdGroupCalloutAdExtensionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupCalloutAdExtension;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class BulkAdGroupCalloutAdExtensionReadFromRowValuesCampaignNameTest extends BulkAdGroupCalloutAdExtensionTest {
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
        this.testReadProperty("Campaign", this.datum, this.expectedResult, new Function<BulkAdGroupCalloutAdExtension, String>() {
            @Override
            public String apply(BulkAdGroupCalloutAdExtension c) {
                return c.getCampaignName();
            }
        });
    }
}
