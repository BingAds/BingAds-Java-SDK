package com.microsoft.bingads.v13.api.test.entities.feed_item.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.feed_item.BulkFeedItemTest;
import com.microsoft.bingads.v13.bulk.entities.BulkFeedItem;

@RunWith(Parameterized.class)
public class BulkFeedItemWriteToRowValuesAudienceIdTest extends BulkFeedItemTest {

    @Parameter(value = 1)
    public Long propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"123", 123L},
            {"9223372036854775807", 9223372036854775807L}
        });
    }

    @Test
    public void testWrite() {
        this.<Long>testWriteProperty("Audience Id", this.datum, this.propertyValue, new BiConsumer<BulkFeedItem, Long>() {
            @Override
            public void accept(BulkFeedItem c, Long v) {
                c.setAudienceId(v);
            }
        });
    }
}
