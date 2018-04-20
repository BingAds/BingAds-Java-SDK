package com.microsoft.bingads.v11.api.test.entities.ad_group_product_partition.read;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.ad_group_product_partition.BulkAdGroupProductPartitionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupProductPartition;
import com.microsoft.bingads.v11.campaignmanagement.ProductPartition;
import com.microsoft.bingads.v11.campaignmanagement.ProductPartitionType;

@RunWith(Parameterized.class)
public class ReadPartitionTypeTest extends BulkAdGroupProductPartitionTest {

    @Parameter(value = 1)
    public ProductPartitionType expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"Unit", ProductPartitionType.UNIT},
                        {"Subdivision", ProductPartitionType.SUBDIVISION},
                        {"", null},
                        {null, null}
                }
        );
    }

    @Test
    public void testReadExcluded() {
        Map<String, String> values = new HashMap<String, String>();

        values.put("Is Excluded", "Yes");
        values.put("Sub Type", datum);

        testReadProperty(
                values,
                expectedResult,
                new Function<BulkAdGroupProductPartition, ProductPartitionType>() {
                    @Override
                    public ProductPartitionType apply(BulkAdGroupProductPartition c) {
                        return ((ProductPartition) c.getAdGroupCriterion().getCriterion()).getPartitionType();
                    }
                }
        );
    }

    @Test
    public void testReadNotExcluded() {
        Map<String, String> values = new HashMap<String, String>();

        values.put("Is Excluded", "No");
        values.put("Sub Type", datum);

        testReadProperty(
                values, expectedResult,
                new Function<BulkAdGroupProductPartition, ProductPartitionType>() {
                    @Override
                    public ProductPartitionType apply(BulkAdGroupProductPartition c) {
                        return ((ProductPartition) c.getAdGroupCriterion().getCriterion()).getPartitionType();
                    }
                }
        );
    }
}
