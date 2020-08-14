package com.microsoft.bingads.v13.api.test.entities.ad_extension.filterlink.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.filterlink.BulkFilterLinkAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkFilterLinkAdExtension;
import com.microsoft.bingads.v13.campaignmanagement.AdExtensionHeaderType;

public class BulkFilterLinkAdExtensionWriteFromRowValuesAdExtensionHeaderTypeTest extends BulkFilterLinkAdExtensionTest {

    @Parameter(value = 1)
    public AdExtensionHeaderType expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Amenities", AdExtensionHeaderType.AMENITIES},
            {"Unknown", AdExtensionHeaderType.UNKNOWN},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<AdExtensionHeaderType>testWriteProperty("AdExtension Header Type", this.datum, this.expectedResult, new BiConsumer<BulkFilterLinkAdExtension, AdExtensionHeaderType>() {
            @Override
            public void accept(BulkFilterLinkAdExtension c, AdExtensionHeaderType v) {
                c.getFilterLinkAdExtension().setAdExtensionHeaderType(v);
            }
        });
    }
}
