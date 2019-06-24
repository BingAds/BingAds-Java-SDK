package com.microsoft.bingads.v13.api.test.entities.feed_item.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.feed_item.BulkFeedItemTest;
import com.microsoft.bingads.v13.bulk.entities.BulkFeedItem;

public class BulkFeedItemWriteToRowValuesKeywordTest extends BulkFeedItemTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Name", "Name"},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Keyword", this.datum, this.propertyValue, new BiConsumer<BulkFeedItem, String>() {
            @Override
            public void accept(BulkFeedItem c, String v) {
                c.setKeyword(v);
            }
        });
    }
}
