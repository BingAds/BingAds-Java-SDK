package com.microsoft.bingads.v13.api.test.entities.ad_extension.location.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.location.BulkLocationAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkLocationAdExtension;
import com.microsoft.bingads.v13.campaignmanagement.AdExtensionStatus;

public class BulkLocationAdExtensionWriteFromRowValuesStatusTest extends BulkLocationAdExtensionTest {

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
        this.<AdExtensionStatus>testWriteProperty("Status", this.datum, this.expectedResult, new BiConsumer<BulkLocationAdExtension, AdExtensionStatus>() {
            @Override
            public void accept(BulkLocationAdExtension c, AdExtensionStatus v) {
                c.getLocationAdExtension().setStatus(v);
            }
        });
    }
}
