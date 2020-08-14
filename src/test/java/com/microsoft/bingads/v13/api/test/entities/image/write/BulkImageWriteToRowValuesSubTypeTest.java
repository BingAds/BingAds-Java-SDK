package com.microsoft.bingads.v13.api.test.entities.image.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.image.BulkImageTest;
import com.microsoft.bingads.v13.bulk.entities.BulkImage;

public class BulkImageWriteToRowValuesSubTypeTest extends BulkImageTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Sub Type", "Sub Type"},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Sub Type", this.datum, this.propertyValue, new BiConsumer<BulkImage, String>() {
            @Override
            public void accept(BulkImage c, String v) {
                c.setSubType(v);
            }
        });
    }
}
