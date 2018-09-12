package com.microsoft.bingads.v12.api.test.entities;

import static com.microsoft.bingads.v12.api.test.entities.RowValuesAssert.assertContains;

import java.util.HashMap;
import java.util.Map;

import com.microsoft.bingads.v12.internal.bulk.RowValues;
import com.microsoft.bingads.v12.bulk.entities.BulkEntity;

public class QualityScoreDataTestHelper {

    public static <T extends BulkEntity> void testQualityScoreDataReadWrite(T entity) {
        Map<String, String> perfData = createTestQualityScoreData();

        entity.readFromRowValues(new RowValues(perfData));

        RowValues writtenValues = new RowValues();

        entity.writeToRowValues(writtenValues, false);

        assertContains(perfData, writtenValues);
    }

    private static Map<String, String> createTestQualityScoreData() {
        Map<String, String> perfData = new HashMap<String, String>();

        perfData.put("Quality Score", "123");
        perfData.put("Keyword Relevance", "456");
        perfData.put("Landing Page Relevance", "789");
        perfData.put("Landing Page User Experience", "111");        

        return perfData;
    }
}
