package com.microsoft.bingads.v11.api.test.entities.ad_extension.call.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.ad_extension.call.BulkCallAdExtensionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCallAdExtension;

public class BulkCallAdExtensionWriteFromRowValuesPhoneNumberTest extends BulkCallAdExtensionTest {

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
    public void testWrite() {
        this.<String>testWriteProperty("Phone Number", this.datum, this.expectedResult, new BiConsumer<BulkCallAdExtension, String>() {
            @Override
            public void accept(BulkCallAdExtension c, String v) {
                c.getCallAdExtension().setPhoneNumber(v);
            }
        });
    }
}
