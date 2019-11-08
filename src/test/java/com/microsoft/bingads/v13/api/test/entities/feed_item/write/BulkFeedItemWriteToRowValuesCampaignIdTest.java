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
public class BulkFeedItemWriteToRowValuesCampaignIdTest extends BulkFeedItemTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"123", "123"},
            {"delete_value", ""},
            {"9223372036854775807", "9223372036854775807"}
        });
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Target Campaign Id", this.datum, this.propertyValue, new BiConsumer<BulkFeedItem, String>() {
            @Override
            public void accept(BulkFeedItem c, String v) {
                c.setCampaignId(v);
            }
        });
    }
}
