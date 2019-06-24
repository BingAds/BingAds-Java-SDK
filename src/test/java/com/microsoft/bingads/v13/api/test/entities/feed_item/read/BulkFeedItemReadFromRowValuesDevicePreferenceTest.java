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
public class BulkFeedItemReadFromRowValuesDevicePreferenceTest extends BulkFeedItemTest {

    @Parameter(value = 1)
    public Long expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {null, null},
                {"All", 0L},
                {"Mobile", 30001L},
                {"", 0L},
        });
    }

    @Test
    public void testRead() {
        this.testReadProperty("Device Preference", this.datum, this.expectedResult, new Function<BulkFeedItem, Long>() {
            @Override
            public Long apply(BulkFeedItem c) {
                return c.getDevicePreference();
            }
        });
    }
}
