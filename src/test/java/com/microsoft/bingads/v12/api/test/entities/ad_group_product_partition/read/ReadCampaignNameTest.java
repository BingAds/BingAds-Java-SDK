package com.microsoft.bingads.v12.api.test.entities.ad_group_product_partition.read;

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
import com.microsoft.bingads.v12.api.test.entities.ad_group_product_partition.BulkAdGroupProductPartitionTest;
import com.microsoft.bingads.v12.bulk.entities.BulkAdGroupProductPartition;

@RunWith(Parameterized.class)
public class ReadCampaignNameTest extends BulkAdGroupProductPartitionTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"123", "123"},
                        {"XXX YYY", "XXX YYY"},
                        {"", ""},
                        {null, null}
                }
        );
    }

    @Test
    public void testReadExcluded() {
        Map<String, String> values = new HashMap<String, String>();

        values.put("Is Excluded", "Yes");
        values.put("Campaign", datum);

        testReadProperty(
                values,
                expectedResult,
                new Function<BulkAdGroupProductPartition, String>() {
                    @Override
                    public String apply(BulkAdGroupProductPartition c) {
                        return c.getCampaignName();
                    }
                }
        );
    }

    @Test
    public void testReadNotExcluded() {
        Map<String, String> values = new HashMap<String, String>();

        values.put("Is Excluded", "No");
        values.put("Campaign", datum);

        testReadProperty(
                values,
                expectedResult,
                new Function<BulkAdGroupProductPartition, String>() {
                    @Override
                    public String apply(BulkAdGroupProductPartition c) {
                        return c.getCampaignName();
                    }
                }
        );
    }
}
