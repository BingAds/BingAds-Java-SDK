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
import com.microsoft.bingads.v13.campaignmanagement.IntentOption;

@RunWith(Parameterized.class)
public class BulkFeedItemWriteToRowValuesPhysicalIntentTest extends BulkFeedItemTest {

    @Parameter(value = 1)
    public IntentOption propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"PeopleIn", IntentOption.PEOPLE_IN},
            {"PeopleInOrSearchingForOrViewingPages", IntentOption.PEOPLE_IN_OR_SEARCHING_FOR_OR_VIEWING_PAGES},
            {"PeopleSearchingForOrViewingPages", IntentOption.PEOPLE_SEARCHING_FOR_OR_VIEWING_PAGES},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<IntentOption>testWriteProperty("Physical Intent", this.datum, this.propertyValue, new BiConsumer<BulkFeedItem, IntentOption>() {
            @Override
            public void accept(BulkFeedItem c, IntentOption v) {
                c.setIntentOption(v);
            }
        });
    }
}
