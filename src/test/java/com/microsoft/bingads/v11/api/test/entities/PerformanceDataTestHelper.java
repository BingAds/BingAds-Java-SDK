/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microsoft.bingads.v11.api.test.entities;

import static com.microsoft.bingads.v11.api.test.entities.RowValuesAssert.assertContains;
import com.microsoft.bingads.v11.bulk.entities.BulkEntity;
import com.microsoft.bingads.v11.internal.bulk.RowValues;
import java.util.HashMap;
import java.util.Map;

public class PerformanceDataTestHelper {

    public static <T extends BulkEntity> void testPerformanceDataReadWrite(T entity) {
        Map<String, String> perfData = createTestPerformanceData();

        entity.readFromRowValues(new RowValues(perfData));

        RowValues writtenValues = new RowValues();

        entity.writeToRowValues(writtenValues, false);

        assertContains(perfData, writtenValues);
    }

    private static Map<String, String> createTestPerformanceData() {
        Map<String, String> perfData = new HashMap<String, String>();

        perfData.put("Clicks", "123");
        perfData.put("Spend", "45.67");
        perfData.put("Impressions", "456");
        perfData.put("CTR", "11.22");
        perfData.put("Avg CPC", "33.44");
        perfData.put("Avg CPM", "55.66");
        perfData.put("Avg position", "77.88");
        perfData.put("Conversions", "100");
        perfData.put("CPA", "3.4");

        return perfData;
    }
}
