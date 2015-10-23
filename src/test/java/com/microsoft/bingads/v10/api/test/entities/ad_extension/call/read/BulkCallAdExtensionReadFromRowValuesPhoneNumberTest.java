package com.microsoft.bingads.v10.api.test.entities.ad_extension.call.read;

import com.microsoft.bingads.v10.api.test.entities.ad_extension.call.BulkCallAdExtensionTest;
import com.microsoft.bingads.v10.bulk.entities.BulkCallAdExtension;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

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
