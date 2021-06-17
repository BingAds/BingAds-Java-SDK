package com.microsoft.bingads.v13.api.test.entities.video.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.video.BulkVideoTest;
import com.microsoft.bingads.v13.bulk.entities.BulkVideo;

public class BulkVideoReadFromRowValuesDurationInMsTest extends BulkVideoTest {

    @Parameter(value = 1)
    public Integer expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"123", 123},
            {"28888", 28888},});
    }

    @Test
    public void testRead() {
        this.<Integer>testReadProperty("Duration In Milliseconds", this.datum, this.expectedResult, new Function<BulkVideo, Integer>() {
            @Override
            public Integer apply(BulkVideo c) {
                return c.getVideo().getDurationInMilliseconds();
            }
        });
    }
}
