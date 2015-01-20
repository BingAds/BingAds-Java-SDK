package com.microsoft.bingads.api.test.entities.adgroup_product_target.write;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.api.test.entities.adgroup_product_target.BulkAdGroupProductTargetTest;
import com.microsoft.bingads.bulk.entities.BulkAdGroupProductTarget;
import com.microsoft.bingads.campaignmanagement.ArrayOfProductCondition;
import com.microsoft.bingads.campaignmanagement.Product;

@RunWith(Parameterized.class)
public class BulkAdGroupProductTargetWriteToRowValuesConditionsTest extends BulkAdGroupProductTargetTest {

    @Parameter(value = 1)
    public ArrayOfProductCondition expectedResult;

    @Parameter(value = 2)
    public String[] conditions;

    @Parameter(value = 3)
    public String[] values;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            generateTestData(0, 0, 0),
            generateTestData(1, 1, 1),
            generateTestData(8, 8, 8)
        });
    }

    @Test
    public void testRead() {
        Map<String, String> rowValues = new HashMap<String, String>();

        for (int i = 1; i <= conditions.length; i++) {
            rowValues.put("Product Condition " + i, conditions[i - 1]);
        }

        for (int i = 1; i <= values.length; i++) {
            rowValues.put("Product Value " + i, values[i - 1]);
        }

        for (Entry<String, String> entry : rowValues.entrySet()) {
            this.<ArrayOfProductCondition>testWriteProperty(entry.getKey(), entry.getValue(), this.expectedResult, new BiConsumer<BulkAdGroupProductTarget, ArrayOfProductCondition>() {
                @Override
                public void accept(BulkAdGroupProductTarget c,
                        ArrayOfProductCondition v) {
                    ((Product)c.getBiddableAdGroupCriterion().getCriterion()).setConditions(v);
                }
            });
        }
    } 
}
