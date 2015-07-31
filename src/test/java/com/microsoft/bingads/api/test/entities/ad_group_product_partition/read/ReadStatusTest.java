package com.microsoft.bingads.api.test.entities.ad_group_product_partition.read;

import com.microsoft.bingads.api.test.entities.ad_group_product_partition.BulkAdGroupProductPartitionTest;
import com.microsoft.bingads.bulk.entities.BulkAdGroupProductPartition;
import com.microsoft.bingads.campaignmanagement.AdGroupCriterionStatus;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RunWith(Parameterized.class)
public class ReadStatusTest extends BulkAdGroupProductPartitionTest {

    @Parameter(value = 1)
    public AdGroupCriterionStatus expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"Active", AdGroupCriterionStatus.ACTIVE},
                        {"Paused", AdGroupCriterionStatus.PAUSED},
                        {"Deleted", AdGroupCriterionStatus.DELETED},
                        {"", null},
                        {null, null}
                }
        );
    }

    @Test
    public void testReadExcluded() {
        Map<String, String> values = new HashMap<String, String>();

        values.put("Is Excluded", "Yes");
        values.put("Status", datum);

        testReadProperty(
                values,
                expectedResult,
                new Function<BulkAdGroupProductPartition, AdGroupCriterionStatus>() {
                    @Override
                    public AdGroupCriterionStatus apply(BulkAdGroupProductPartition c) {
                        return c.getAdGroupCriterion().getStatus();
                    }
                }
        );
    }

    @Test
    public void testReadNotExcluded() {
        Map<String, String> values = new HashMap<String, String>();

        values.put("Is Excluded", "No");
        values.put("Status", datum);

        testReadProperty(
                values, expectedResult,
                new Function<BulkAdGroupProductPartition, AdGroupCriterionStatus>() {
                    @Override
                    public AdGroupCriterionStatus apply(BulkAdGroupProductPartition c) {
                        return c.getAdGroupCriterion().getStatus();
                    }
                }
        );
    }
}
