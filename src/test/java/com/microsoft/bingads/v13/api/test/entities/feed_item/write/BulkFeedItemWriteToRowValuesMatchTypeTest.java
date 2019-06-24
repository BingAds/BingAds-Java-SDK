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
import com.microsoft.bingads.v13.campaignmanagement.MatchType;

@RunWith(Parameterized.class)
public class BulkFeedItemWriteToRowValuesMatchTypeTest extends BulkFeedItemTest {

    @Parameter(value = 1)
    public MatchType propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Broad", MatchType.BROAD},
            {"Exact", MatchType.EXACT},
            {"Phrase", MatchType.PHRASE},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<MatchType>testWriteProperty("Match Type", this.datum, this.propertyValue, new BiConsumer<BulkFeedItem, MatchType>() {
            @Override
            public void accept(BulkFeedItem c, MatchType v) {
                c.setMatchType(v);
            }
        });
    }
}
