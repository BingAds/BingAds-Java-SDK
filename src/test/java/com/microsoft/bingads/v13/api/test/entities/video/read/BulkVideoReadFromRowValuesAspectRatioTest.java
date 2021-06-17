package com.microsoft.bingads.v13.api.test.entities.video.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.video.BulkVideoTest;
import com.microsoft.bingads.v13.bulk.entities.BulkVideo;

public class BulkVideoReadFromRowValuesAspectRatioTest extends BulkVideoTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"4:3", "4:3"},
            {"1.75:1", "1.75:1"},
            {"", ""},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Aspect Ratio", this.datum, this.expectedResult, new Function<BulkVideo, String>() {
            @Override
            public String apply(BulkVideo c) {
                return c.getVideo().getAspectRatio();
            }
        });
    }
}
