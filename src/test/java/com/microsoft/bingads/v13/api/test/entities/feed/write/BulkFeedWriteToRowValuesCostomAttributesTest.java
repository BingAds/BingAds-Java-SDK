package com.microsoft.bingads.v13.api.test.entities.feed.write;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.microsoft.bingads.v13.bulk.entities.BulkFeed;
import com.microsoft.bingads.v13.bulk.entities.BulkFeed.FeedCustomAttribute;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;

public class BulkFeedWriteToRowValuesCostomAttributesTest {

    @Test
    public void testWrite() {
        BulkFeed entity = new BulkFeed();
        
        //"[{\"name\":\"Page Url\",\"feedAttributeType\":\"Url\",\"isPartOfKey\":true},{\"name\":\"Custom Label\",\"feedAttributeType\":\"StringList\"}]"
        List<FeedCustomAttribute> attrList = new ArrayList<FeedCustomAttribute>(2);
        
        FeedCustomAttribute attr0 = new FeedCustomAttribute();
        attr0.setName("Page Url");
        attr0.setFeedAttributeType("Url");
        attr0.setIsPartOfKey(true);
        
        FeedCustomAttribute attr1 = new FeedCustomAttribute();
        attr1.setName("Custom Label");
        attr1.setFeedAttributeType("StringList");
        attrList.add(attr0);
        attrList.add(attr1);
        
        entity.setCustomAttributes(attrList);

        RowValues rowValues = new RowValues();

        entity.writeToRowValues(rowValues, false);
        
        attrList = StringExtensions.parseFeedCustomAttributes(rowValues.get("Custom Attributes"));
        assertEquals(attrList.size(), 2);
        assertEquals(attrList.get(0).getName(), "Page Url");
        assertEquals(attrList.get(1).getName(), "Custom Label");
        assertEquals(attrList.get(0).getFeedAttributeType(), "Url");
        assertEquals(attrList.get(1).getFeedAttributeType(), "StringList");
        assertTrue(attrList.get(0).getIsPartOfKey());
        assertFalse(attrList.get(1).getIsPartOfKey());
    }
}
