package com.microsoft.bingads.v11.api.test.entities.campaign_product_scope.write;

import com.microsoft.bingads.v11.api.test.entities.campaign_product_scope.BulkCampaignProductScopeTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignProductScope;
import com.microsoft.bingads.v11.campaignmanagement.ArrayOfProductCondition;
import com.microsoft.bingads.v11.campaignmanagement.ProductScope;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

@RunWith(Parameterized.class)
public class WriteConditionsTest extends BulkCampaignProductScopeTest {

    @Parameter(value = 1)
    public ArrayOfProductCondition expectedResult;

    @Parameter(value = 2)
    public String[] conditions;

    @Parameter(value = 3)
    public String[] values;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                generateTestData(0, 0, 0),
                generateTestData(1, 1, 1),
                generateTestData(8, 8, 8)
        );
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
            testWriteProperty(
                    entry.getKey(),
                    entry.getValue(),
                    expectedResult,
                    new BiConsumer<BulkCampaignProductScope, ArrayOfProductCondition>() {
                        @Override
                        public void accept(BulkCampaignProductScope c, ArrayOfProductCondition v) {
                            ((ProductScope) c.getBiddableCampaignCriterion().getCriterion()).setConditions(v);
                        }
                    }
            );
        }
    }
}
