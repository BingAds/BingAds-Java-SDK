package com.microsoft.bingads.v13.api.test.entities.video.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.video.BulkVideoTest;
import com.microsoft.bingads.v13.bulk.entities.BulkVideo;

@RunWith(Parameterized.class)
public class BulkVideoWriteToRowValuesDurationInMsTest extends BulkVideoTest {

    @Parameter(value = 1)
    public Integer propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"123", 123},
            {"28888", 28888}
        });
    }

    @Test
    public void testWrite() {
        this.<Integer>testWriteProperty("Duration In Milliseconds", this.datum, this.propertyValue, new BiConsumer<BulkVideo, Integer>() {
            @Override
            public void accept(BulkVideo c, Integer v) {
                c.getVideo().setDurationInMilliseconds(v);;
            }
        });
    }
}

