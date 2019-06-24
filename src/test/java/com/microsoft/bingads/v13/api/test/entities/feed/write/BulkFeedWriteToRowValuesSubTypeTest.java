package com.microsoft.bingads.v13.api.test.entities.feed.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.feed.BulkFeedTest;
import com.microsoft.bingads.v13.bulk.entities.BulkFeed;

public class BulkFeedWriteToRowValuesSubTypeTest extends BulkFeedTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Test Feed Sub Type", "Test Feed Sub Type"},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Sub Type", this.datum, this.propertyValue, new BiConsumer<BulkFeed, String>() {
            @Override
            public void accept(BulkFeed c, String v) {
                c.setSubType(v);
            }
        });
    }
}
