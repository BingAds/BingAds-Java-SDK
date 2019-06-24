package com.microsoft.bingads.v13.api.test.entities.feed_item.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.feed_item.BulkFeedItemTest;
import com.microsoft.bingads.v13.bulk.entities.BulkFeedItem;

@RunWith(Parameterized.class)
public class BulkFeedItemReadFromRowValuesCustomAttrsTest extends BulkFeedItemTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Name", "Name"},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.testReadProperty("Custom Attributes", this.datum, this.expectedResult, new Function<BulkFeedItem, String>() {
            @Override
            public String apply(BulkFeedItem c) {
                return c.getCustomAttributes();
            }
        });
    }
}
