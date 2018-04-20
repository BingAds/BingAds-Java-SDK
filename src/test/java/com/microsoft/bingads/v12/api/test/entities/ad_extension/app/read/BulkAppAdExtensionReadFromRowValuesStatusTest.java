package com.microsoft.bingads.v12.api.test.entities.ad_extension.app.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.api.test.entities.ad_extension.app.BulkAppAdExtensionTest;
import com.microsoft.bingads.v12.bulk.entities.BulkAppAdExtension;
import com.microsoft.bingads.v12.campaignmanagement.AdExtensionStatus;

public class BulkAppAdExtensionReadFromRowValuesStatusTest extends BulkAppAdExtensionTest {

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
    public void testRead() {
        this.testReadProperty("Status", this.datum, this.expectedResult, new Function<BulkAppAdExtension, AdExtensionStatus>() {
            @Override
            public AdExtensionStatus apply(BulkAppAdExtension c) {
                return c.getAppAdExtension().getStatus();
            }
        });
    }
}
