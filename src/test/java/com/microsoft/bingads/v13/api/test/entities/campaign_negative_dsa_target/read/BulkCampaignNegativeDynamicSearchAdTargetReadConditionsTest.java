package com.microsoft.bingads.v13.api.test.entities.campaign_negative_dsa_target.read;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.ArrayOfWebpageConditionComparer;
import com.microsoft.bingads.v13.api.test.entities.campaign_negative_dsa_target.BulkCampaignNegativeDynamicSearchAdTargetTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignNegativeDynamicSearchAdTarget;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfWebpageCondition;
import com.microsoft.bingads.v13.campaignmanagement.Webpage;

public class BulkCampaignNegativeDynamicSearchAdTargetReadConditionsTest extends BulkCampaignNegativeDynamicSearchAdTargetTest {
    @Parameterized.Parameter(value = 1)
    public ArrayOfWebpageCondition expectedResult;

    @Parameterized.Parameter(value = 2)
    public String[] conditions;

    @Parameterized.Parameter(value = 3)
    public String[] values;
    
    @Parameterized.Parameter(value = 4)
    public String[] operators;

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

        for (int i = 1; i <= values.length; i++) {
            rowValues.put("Dynamic Ad Target Condition Operator " + i, operators[i - 1]);
        }

        testReadProperty(
                rowValues,
                expectedResult,
                new Function<BulkCampaignNegativeDynamicSearchAdTarget, ArrayOfWebpageCondition>() {
                    @Override
                    public ArrayOfWebpageCondition apply(BulkCampaignNegativeDynamicSearchAdTarget c) {
                        return ((Webpage) c.getNegativeCampaignCriterion().getCriterion()).getParameter().getConditions();
                    }
                },
                new Supplier<BulkCampaignNegativeDynamicSearchAdTarget>() {
                    @Override
                    public BulkCampaignNegativeDynamicSearchAdTarget get() {
                        return new BulkCampaignNegativeDynamicSearchAdTarget();
                    }
                },
                new ArrayOfWebpageConditionComparer()
        );
    }
}
