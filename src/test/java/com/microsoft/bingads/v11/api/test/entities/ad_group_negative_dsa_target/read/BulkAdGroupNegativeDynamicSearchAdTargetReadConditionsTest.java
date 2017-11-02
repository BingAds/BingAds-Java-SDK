package com.microsoft.bingads.v11.api.test.entities.ad_group_negative_dsa_target.read;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v11.api.test.entities.ArrayOfWebpageConditionComparer;
import com.microsoft.bingads.v11.api.test.entities.ad_group_negative_dsa_target.BulkAdGroupNegativeDynamicSearchAdTargetTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupNegativeDynamicSearchAdTarget;
import com.microsoft.bingads.v11.campaignmanagement.ArrayOfWebpageCondition;
import com.microsoft.bingads.v11.campaignmanagement.Webpage;

import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class BulkAdGroupNegativeDynamicSearchAdTargetReadConditionsTest extends BulkAdGroupNegativeDynamicSearchAdTargetTest {
    @Parameterized.Parameter(value = 1)
    public ArrayOfWebpageCondition expectedResult;

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
                generateTestData(3, 3, 3)
        );
    }

    @Test
    public void testRead() {
        Map<String, String> rowValues = new HashMap<String, String>();

        for (int i = 1; i <= conditions.length; i++) {
            rowValues.put("Dynamic Ad Target Condition " + i, conditions[i - 1]);
        }

        for (int i = 1; i <= values.length; i++) {
            rowValues.put("Dynamic Ad Target Value " + i, values[i - 1]);
        }

        testReadProperty(
                rowValues,
                expectedResult,
                new Function<BulkAdGroupNegativeDynamicSearchAdTarget, ArrayOfWebpageCondition>() {
                    @Override
                    public ArrayOfWebpageCondition apply(BulkAdGroupNegativeDynamicSearchAdTarget c) {
                        return ((Webpage) c.getNegativeAdGroupCriterion().getCriterion()).getParameter().getConditions();
                    }
                },
                new Supplier<BulkAdGroupNegativeDynamicSearchAdTarget>() {
                    @Override
                    public BulkAdGroupNegativeDynamicSearchAdTarget get() {
                        return new BulkAdGroupNegativeDynamicSearchAdTarget();
                    }
                },
                new ArrayOfWebpageConditionComparer()
        );
    }
}
