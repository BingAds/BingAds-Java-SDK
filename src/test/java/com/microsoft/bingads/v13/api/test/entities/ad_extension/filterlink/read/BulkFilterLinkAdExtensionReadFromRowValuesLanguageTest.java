package com.microsoft.bingads.v13.api.test.entities.ad_extension.filterlink.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.filterlink.BulkFilterLinkAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkFilterLinkAdExtension;

public class BulkFilterLinkAdExtensionReadFromRowValuesLanguageTest extends BulkFilterLinkAdExtensionTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            {"", ""},
            {null, null},
            {"Language", "Language"},
        });
    }

    @Test
    public void testRead() {
        this.testReadProperty("Language", this.datum, this.expectedResult,
                new Function<BulkFilterLinkAdExtension, String>() {
                    @Override
                    public String apply(BulkFilterLinkAdExtension c) {
                        return c.getFilterLinkAdExtension().getLanguage();
                    }
                });
    }
    
}
