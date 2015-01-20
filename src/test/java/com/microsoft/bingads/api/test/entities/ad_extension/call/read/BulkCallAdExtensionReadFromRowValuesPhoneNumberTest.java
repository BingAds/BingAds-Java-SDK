package com.microsoft.bingads.api.test.entities.ad_extension.call.read;

import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.Function;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.api.test.entities.ad_extension.call.BulkCallAdExtensionTest;
import com.microsoft.bingads.bulk.entities.BulkCallAdExtension;

public class BulkCallAdExtensionReadFromRowValuesPhoneNumberTest extends BulkCallAdExtensionTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Test text", "Test text"},
            {"", ""},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Phone Number", this.datum, this.expectedResult, new Function<BulkCallAdExtension, String>() {
            @Override
            public String apply(BulkCallAdExtension c) {
                return c.getCallAdExtension().getPhoneNumber();
            }
        });
    }
}
