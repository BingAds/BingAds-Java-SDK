package com.microsoft.bingads.v13.api.test.entities.feed.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.feed.BulkFeedTest;
import com.microsoft.bingads.v13.bulk.entities.BulkFeed;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

public class BulkFeedWriteToRowValuesScheduleTest extends BulkFeedTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"* * 31 12 *", "* * 31 12 *"},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty(StringTable.Schedule, this.datum, this.propertyValue, new BiConsumer<BulkFeed, String>() {
            @Override
            public void accept(BulkFeed c, String v) {
                c.setSchedule(v);
            }
        });
    }
}
