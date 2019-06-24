package com.microsoft.bingads.v13.api.test.entities.feed_item.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.feed_item.BulkFeedItemTest;
import com.microsoft.bingads.v13.bulk.entities.BulkFeedItem;

@RunWith(Parameterized.class)
public class BulkFeedItemWriteToRowValuesDevicePreferenceTest extends BulkFeedItemTest {

    @Parameterized.Parameter(value = 1)
    public Long expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"All", 0L},
                {"Mobile", 30001L},
                {"All", null},
        });
    }

    @Test
    public void testWrite() {
        this.testWriteProperty("Device Preference", this.datum, this.expectedResult, new BiConsumer<BulkFeedItem, Long>() {
            @Override
            public void accept(BulkFeedItem c, Long v) {
                c.setDevicePreference(v);
            }
        });
    }
}
