package com.microsoft.bingads.v13.api.test.entities.image.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.image.BulkImageTest;
import com.microsoft.bingads.v13.bulk.entities.BulkImage;

public class BulkImageWriteToRowValuesHeightTest extends BulkImageTest {

    @Parameter(value = 1)
    public Integer propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"123", 123},
            {"2147483647", Integer.MAX_VALUE},
            {null, null},});
    }

    @Test
    public void testWrite() {
        this.<Integer>testWriteProperty("Height", this.datum, this.propertyValue, new BiConsumer<BulkImage, Integer>() {
            @Override
            public void accept(BulkImage c, Integer v) {
                c.setHeight(v);
            }
        });
    }
}