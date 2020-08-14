package com.microsoft.bingads.v13.api.test.entities.image.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.image.BulkImageTest;
import com.microsoft.bingads.v13.bulk.entities.BulkImage;

@RunWith(Parameterized.class)
public class BulkImageWriteToRowValuesParentIdTest extends BulkImageTest {

    @Parameter(value = 1)
    public Long propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"123", 123L},
            {"9223372036854775807", 9223372036854775807L}
        });
    }

    @Test
    public void testWrite() {
        this.<Long>testWriteProperty("Id", this.datum, this.propertyValue, new BiConsumer<BulkImage, Long>() {
            @Override
            public void accept(BulkImage c, Long v) {
                c.setId(v);;
            }
        });
    }
}

