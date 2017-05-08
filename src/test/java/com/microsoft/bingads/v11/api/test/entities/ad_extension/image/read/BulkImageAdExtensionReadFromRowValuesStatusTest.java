package com.microsoft.bingads.v11.api.test.entities.ad_extension.image.read;

import com.microsoft.bingads.v11.api.test.entities.ad_extension.image.BulkImageAdExtensionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkImageAdExtension;
import com.microsoft.bingads.v11.campaignmanagement.AdExtensionStatus;
import com.microsoft.bingads.internal.functionalinterfaces.Function;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

public class BulkImageAdExtensionReadFromRowValuesStatusTest extends BulkImageAdExtensionTest {

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
        this.<AdExtensionStatus>testReadProperty("Status", this.datum, this.expectedResult, new Function<BulkImageAdExtension, AdExtensionStatus>() {
            @Override
            public AdExtensionStatus apply(BulkImageAdExtension c) {
                return c.getImageAdExtension().getStatus();
            }
        });
    }
}
