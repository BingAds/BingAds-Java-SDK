package com.microsoft.bingads.v13.api.test.entities.ad_extension.flyer.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.flyer.BulkFlyerAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkFlyerAdExtension;

public class BulkFlyerAdExtensionReadFromRowValuesDescriptionTest extends BulkFlyerAdExtensionTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            {"", ""},
            {"Display Text", "Display Text"},
        });
    }

    @Test
    public void testRead() {
        this.testReadProperty("Description", this.datum, this.expectedResult,
                new Function<BulkFlyerAdExtension, String>() {
                    @Override
                    public String apply(BulkFlyerAdExtension c) {
                        return c.getFlyerAdExtension().getDescription();
                    }
                });
    }
    
}
