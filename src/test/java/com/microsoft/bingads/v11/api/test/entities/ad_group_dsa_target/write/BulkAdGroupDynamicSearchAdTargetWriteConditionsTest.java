package com.microsoft.bingads.v11.api.test.entities.ad_group_dsa_target.write;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.ad_group_dsa_target.BulkAdGroupDynamicSearchAdTargetTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupDynamicSearchAdTarget;
import com.microsoft.bingads.v11.campaignmanagement.ArrayOfWebpageCondition;
import com.microsoft.bingads.v11.campaignmanagement.Webpage;

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
public class BulkAdGroupDynamicSearchAdTargetWriteConditionsTest extends BulkAdGroupDynamicSearchAdTargetTest {

    @Parameter(value = 1)
    public ArrayOfWebpageCondition expectedResult;

    @Parameter(value = 2)
    public String[] conditions;

    @Parameter(value = 3)
    public String[] values;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                generateTestData(0, 0, 0),
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

        for (Entry<String, String> entry : rowValues.entrySet()) {
            testWriteProperty(
                    entry.getKey(),
                    entry.getValue(),
                    expectedResult,
                    new BiConsumer<BulkAdGroupDynamicSearchAdTarget, ArrayOfWebpageCondition>() {
                        @Override
                        public void accept(BulkAdGroupDynamicSearchAdTarget c, ArrayOfWebpageCondition v) {
                            ((Webpage) c.getAdGroupCriterion().getCriterion()).getParameter().setConditions(v);
                        }
                    }
            );
        }
    }
}
