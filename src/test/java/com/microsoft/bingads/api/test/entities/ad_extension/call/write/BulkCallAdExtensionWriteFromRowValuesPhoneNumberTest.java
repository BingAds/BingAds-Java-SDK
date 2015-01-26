package com.microsoft.bingads.api.test.entities.ad_extension.call.write;

import com.microsoft.bingads.api.test.entities.ad_extension.call.BulkCallAdExtensionTest;
import com.microsoft.bingads.bulk.entities.BulkCallAdExtension;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

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
