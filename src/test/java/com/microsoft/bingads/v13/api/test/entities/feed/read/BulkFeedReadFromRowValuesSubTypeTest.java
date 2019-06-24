package com.microsoft.bingads.v13.api.test.entities.feed.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.feed.BulkFeedTest;
import com.microsoft.bingads.v13.bulk.entities.BulkFeed;

public class BulkFeedReadFromRowValuesSubTypeTest extends BulkFeedTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Test Sub Type", "Test Sub Type"},
            {"", ""},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Sub Type", this.datum, this.expectedResult, new Function<BulkFeed, String>() {
            @Override
            public String apply(BulkFeed c) {
                return c.getSubType();
            }
        });
    }
}
