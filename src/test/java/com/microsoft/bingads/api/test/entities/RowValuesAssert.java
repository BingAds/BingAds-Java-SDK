package com.microsoft.bingads.api.test.entities;

import com.microsoft.bingads.internal.bulk.RowValues;
import java.util.Map;
import static org.junit.Assert.assertEquals;

public class RowValuesAssert {

    public static void assertContains(Map<String, String> expected, RowValues actual) {        
        for (Map.Entry<String, String> stringStringEntry : expected.entrySet()) {
            assertEquals(stringStringEntry.getValue(), actual.get(stringStringEntry.getKey()));
        }
    }
}
