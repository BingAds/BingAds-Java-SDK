package com.microsoft.bingads.v12.api.test.entities.ad_extension.action.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.api.test.entities.ad_extension.action.BulkActionAdExtensionTest;
import com.microsoft.bingads.v12.bulk.entities.BulkActionAdExtension;

public class BulkActionAdExtensionReadFromRowValuesFusTest extends BulkActionAdExtensionTest {

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
                new Function<BulkActionAdExtension, String>() {
                    @Override
                    public String apply(BulkActionAdExtension c) {
                        return c.getActionAdExtension().getFinalUrlSuffix();
                    }
                });
    }
    
}
