package com.microsoft.bingads.api.test.entities.ad_extension.image.write;

import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.api.test.entities.ad_extension.image.BulkImageAdExtensionTest;
import com.microsoft.bingads.bulk.entities.BulkImageAdExtension;
import com.microsoft.bingads.campaignmanagement.AdExtensionStatus;

public class BulkImageAdExtensionWriteFromRowValuesStatusTest extends BulkImageAdExtensionTest {

    @Parameter(value = 1)
    public AdExtensionStatus expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Active", AdExtensionStatus.ACTIVE},
            {"Deleted", AdExtensionStatus.DELETED},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<AdExtensionStatus>testWriteProperty("Status", this.datum, this.expectedResult, new BiConsumer<BulkImageAdExtension, AdExtensionStatus>() {
            @Override
            public void accept(BulkImageAdExtension c, AdExtensionStatus v) {
                c.getImageAdExtension().setStatus(v);
            }
        });
    }
}
