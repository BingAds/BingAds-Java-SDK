package com.microsoft.bingads.v11.api.test.entities;

import com.microsoft.bingads.v11.internal.bulk.RowValues;
import java.util.Map;
import static org.junit.Assert.assertEquals;

public class RowValuesAssert {

    public static void assertContains(Map<String, String> expected, RowValues actual) {        
        for (String expectedKey : expected.keySet()) {
            assertEquals(expected.get(expectedKey), actual.get(expectedKey));
        }
    }
}
