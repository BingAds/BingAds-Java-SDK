package com.microsoft.bingads.v13.api.test.entities.feed.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.feed.BulkFeedTest;
import com.microsoft.bingads.v13.bulk.entities.BulkFeed;

public class BulkFeedWriteToRowValuesNameTest extends BulkFeedTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Test Feed 1", "Test Feed 1"},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Feed Name", this.datum, this.propertyValue, new BiConsumer<BulkFeed, String>() {
            @Override
            public void accept(BulkFeed c, String v) {
                c.setName(v);;
            }
        });
    }
}
