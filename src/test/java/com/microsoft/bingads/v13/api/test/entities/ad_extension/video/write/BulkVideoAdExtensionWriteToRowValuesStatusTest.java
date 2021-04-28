package com.microsoft.bingads.v13.api.test.entities.ad_extension.video.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.video.BulkVideoAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkVideoAdExtension;
import com.microsoft.bingads.v13.campaignmanagement.AdExtensionStatus;

public class BulkVideoAdExtensionWriteToRowValuesStatusTest extends BulkVideoAdExtensionTest {

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
        this.testWriteProperty("Status", this.datum, this.expectedResult, new BiConsumer<BulkVideoAdExtension, AdExtensionStatus>() {
            @Override
            public void accept(BulkVideoAdExtension c, AdExtensionStatus v) {
                c.getVideoAdExtension().setStatus(v);
            }
        });
    }
}
