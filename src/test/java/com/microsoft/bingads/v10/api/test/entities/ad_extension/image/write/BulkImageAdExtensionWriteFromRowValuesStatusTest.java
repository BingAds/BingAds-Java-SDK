package com.microsoft.bingads.v10.api.test.entities.ad_extension.image.write;

import com.microsoft.bingads.v10.api.test.entities.ad_extension.image.BulkImageAdExtensionTest;
import com.microsoft.bingads.v10.bulk.entities.BulkImageAdExtension;
import com.microsoft.bingads.v10.campaignmanagement.AdExtensionStatus;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

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
