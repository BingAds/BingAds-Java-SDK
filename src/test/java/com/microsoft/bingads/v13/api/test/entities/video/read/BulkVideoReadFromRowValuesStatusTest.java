package com.microsoft.bingads.v13.api.test.entities.video.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.video.BulkVideoTest;
import com.microsoft.bingads.v13.bulk.entities.BulkVideo;

public class BulkVideoReadFromRowValuesStatusTest extends BulkVideoTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Active", "Active"},
            {"", ""},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Status", this.datum, this.expectedResult, new Function<BulkVideo, String>() {
            @Override
            public String apply(BulkVideo c) {
                return c.getVideo().getStatus();
            }
        });
    }
}
