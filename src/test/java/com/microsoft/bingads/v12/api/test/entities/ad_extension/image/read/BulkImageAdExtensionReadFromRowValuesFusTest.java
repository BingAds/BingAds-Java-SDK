package com.microsoft.bingads.v12.api.test.entities.ad_extension.image.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.api.test.entities.ad_extension.image.BulkImageAdExtensionTest;
import com.microsoft.bingads.v12.bulk.entities.BulkImageAdExtension;

public class BulkImageAdExtensionReadFromRowValuesFusTest extends BulkImageAdExtensionTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            {"", ""},
            {"delete_value", ""},
            {"final url suffix", "final url suffix"},
            {"?src=bing&param=123", "?src=bing&param=123"}
        });
    }

    @Test
    public void testRead() {
        this.testReadProperty("Final Url Suffix", this.datum, this.expectedResult,
                new Function<BulkImageAdExtension, String>() {
                    @Override
                    public String apply(BulkImageAdExtension c) {
                        return c.getImageAdExtension().getFinalUrlSuffix();
                    }
                });
    }
    
}
