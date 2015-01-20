package com.microsoft.bingads.api.test.entities.ad_extension.call.write;

import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.api.test.entities.ad_extension.call.BulkCallAdExtensionTest;
import com.microsoft.bingads.bulk.entities.BulkCallAdExtension;

@RunWith(Parameterized.class)
public class BulkCallAdExtensionWriteFromRowValuesVersionTest extends BulkCallAdExtensionTest {

    @Parameter(value = 1)
    public Integer expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"123", 123},
            {"2147483647", 2147483647},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<Integer>testWriteProperty("Version", this.datum, this.expectedResult, new BiConsumer<BulkCallAdExtension, Integer>() {
            @Override
            public void accept(BulkCallAdExtension c, Integer v) {
                c.getCallAdExtension().setVersion(v);
            }
        });
    }
}
