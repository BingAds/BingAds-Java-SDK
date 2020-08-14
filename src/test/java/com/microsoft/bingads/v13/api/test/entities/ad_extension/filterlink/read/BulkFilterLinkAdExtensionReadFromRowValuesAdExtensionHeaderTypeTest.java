package com.microsoft.bingads.v13.api.test.entities.ad_extension.filterlink.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.filterlink.BulkFilterLinkAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkFilterLinkAdExtension;
import com.microsoft.bingads.v13.campaignmanagement.AdExtensionHeaderType;

public class BulkFilterLinkAdExtensionReadFromRowValuesAdExtensionHeaderTypeTest extends BulkFilterLinkAdExtensionTest {

    @Parameter(value = 1)
    public AdExtensionHeaderType headerType;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Amenities", AdExtensionHeaderType.AMENITIES},
            {"Brands", AdExtensionHeaderType.BRANDS},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<AdExtensionHeaderType>testReadProperty("AdExtension Header Type", this.datum, this.headerType, new Function<BulkFilterLinkAdExtension, AdExtensionHeaderType>() {
            @Override
            public AdExtensionHeaderType apply(BulkFilterLinkAdExtension c) {
                return c.getFilterLinkAdExtension().getAdExtensionHeaderType();
            }
        });
    }
}
