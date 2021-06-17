package com.microsoft.bingads.v13.api.test.entities.video.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.video.BulkVideoTest;
import com.microsoft.bingads.v13.bulk.entities.BulkVideo;

public class BulkVideoWriteToRowValuesDescriptionTest extends BulkVideoTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"This is a good video", "This is a good video"},
            {"", ""},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Description", this.datum, this.propertyValue, new BiConsumer<BulkVideo, String>() {
            @Override
            public void accept(BulkVideo c, String v) {
                c.getVideo().setDescription(v);
            }
        });
    }
}
