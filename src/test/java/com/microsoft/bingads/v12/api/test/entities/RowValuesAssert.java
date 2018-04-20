package com.microsoft.bingads.v12.api.test.entities;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import com.microsoft.bingads.v12.internal.bulk.RowValues;

public class RowValuesAssert {

    public static void assertContains(Map<String, String> expected, RowValues actual) {        
        for (String expectedKey : expected.keySet()) {
            assertEquals(expected.get(expectedKey), actual.get(expectedKey));
        }
    }
}
