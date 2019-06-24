package com.microsoft.bingads.v13.api.test.entities.feed.read;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.microsoft.bingads.v13.bulk.entities.BulkFeed;
import com.microsoft.bingads.v13.bulk.entities.BulkFeed.FeedCustomAttribute;
import com.microsoft.bingads.v13.internal.bulk.RowValues;

public class BulkFeedReadFromRowValuesCustomAttributesTest {


    @Test
    public void testRead() {
        BulkFeed entity = new BulkFeed();
        Map<String, String> rowValues = new HashMap<String, String>();
        rowValues.put("Custom Attributes", "[{\"name\":\"Page Url\",\"feedAttributeType\":\"Url\",\"isPartOfKey\":true},{\"name\":\"Custom Label\",\"feedAttributeType\":\"StringList\"}]");
        
        entity.readFromRowValues(new RowValues(rowValues));
        List<FeedCustomAttribute> s = entity.getCustomAttributes();
        assertEquals(s.size(), 2);
        assertEquals(s.get(0).getName(), "Page Url");
        assertEquals(s.get(1).getName(), "Custom Label");
        assertEquals(s.get(0).getFeedAttributeType(), "Url");
        assertEquals(s.get(1).getFeedAttributeType(), "StringList");
        assertEquals(s.get(0).getIsPartOfKey(),true);
        assertEquals(s.get(1).getIsPartOfKey(),false);
    }
}
