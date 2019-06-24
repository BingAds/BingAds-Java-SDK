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
import com.microsoft.bingads.v13.campaignmanagement.IntentOption;

@RunWith(Parameterized.class)
public class BulkFeedItemReadFromRowValuesPhysicalIntentTest extends BulkFeedItemTest {

    @Parameter
    public String datum;

    @Parameter(value = 1)
    public IntentOption expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"PeopleIn", IntentOption.PEOPLE_IN},
            {"PeopleInOrSearchingForOrViewingPages", IntentOption.PEOPLE_IN_OR_SEARCHING_FOR_OR_VIEWING_PAGES},
            {"PeopleSearchingForOrViewingPages", IntentOption.PEOPLE_SEARCHING_FOR_OR_VIEWING_PAGES},
            {"", null},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<IntentOption>testReadProperty("Physical Intent", this.datum, this.expectedResult, new Function<BulkFeedItem, IntentOption>() {
            @Override
            public IntentOption apply(BulkFeedItem c) {
                return c.getIntentOption();
            }
        });
    }
}
