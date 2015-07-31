package com.microsoft.bingads.api.test.entities.campaign_product_scope.read;

import com.microsoft.bingads.api.test.entities.ArrayOfProductConditionComparer;
import com.microsoft.bingads.api.test.entities.campaign_product_scope.BulkCampaignProductScopeTest;
import com.microsoft.bingads.bulk.entities.BulkCampaignProductScope;
import com.microsoft.bingads.campaignmanagement.ArrayOfProductCondition;
import com.microsoft.bingads.campaignmanagement.ProductScope;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ReadConditionsTest extends BulkCampaignProductScopeTest {
    @Parameterized.Parameter(value = 1)
    public ArrayOfProductCondition expectedResult;

    @Parameterized.Parameter(value = 2)
    public String[] conditions;

    @Parameterized.Parameter(value = 3)
    public String[] values;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                generateTestData(0, 0, 0),
                generateTestData(0, 1, 0),
                generateTestData(0, 0, 1),
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

        testReadProperty(
                rowValues,
                expectedResult,
                new Function<BulkCampaignProductScope, ArrayOfProductCondition>() {
                    @Override
                    public ArrayOfProductCondition apply(BulkCampaignProductScope c) {
                        return ((ProductScope) c.getCampaignCriterion().getCriterion()).getConditions();
                    }
                },
                new Supplier<BulkCampaignProductScope>() {
                    @Override
                    public BulkCampaignProductScope get() {
                        return new BulkCampaignProductScope();
                    }
                },
                new ArrayOfProductConditionComparer()
        );
    }
}
