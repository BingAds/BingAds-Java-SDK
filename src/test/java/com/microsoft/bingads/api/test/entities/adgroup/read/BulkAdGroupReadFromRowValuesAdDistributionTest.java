package com.microsoft.bingads.api.test.entities.adgroup.read;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import com.microsoft.bingads.internal.functionalInterfaces.Function;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.api.test.entities.adgroup.BulkAdGroupTest;
import com.microsoft.bingads.bulk.entities.BulkAdGroup;
import com.microsoft.bingads.campaignmanagement.AdDistribution;
import java.util.List;

@RunWith(Parameterized.class)
public class BulkAdGroupReadFromRowValuesAdDistributionTest extends BulkAdGroupTest {

    @Parameter(value = 1)
    public String content;

    @Parameter(value = 2)
    public List<AdDistribution> expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"On", "Off", Arrays.asList(new AdDistribution[]{AdDistribution.SEARCH})},
            {"Off", "On", Arrays.asList(new AdDistribution[]{AdDistribution.CONTENT})},
            {"On", "On", Arrays.asList(new AdDistribution[]{AdDistribution.SEARCH, AdDistribution.CONTENT})},
            {"Off", "Off", Arrays.asList(new AdDistribution[]{})},
            {"On", "", Arrays.asList(new AdDistribution[]{AdDistribution.SEARCH})},
            {"On", null, Arrays.asList(new AdDistribution[]{AdDistribution.SEARCH})},
            {"", "", Arrays.asList(new AdDistribution[]{})},
            {null, null, Arrays.asList(new AdDistribution[]{})}
        });
    }

    @Test
    public void testRead() {
        Map<String, String> values = new HashMap<String, String>();
        values.put("Search Network", this.datum);
        values.put("Content Network", this.content);
        this.<List<AdDistribution>>testReadProperty(values, this.expectedResult, new Function<BulkAdGroup, List<AdDistribution>>() {
            @Override
            public List<AdDistribution> apply(BulkAdGroup c) {
                return c.getAdGroup().getAdDistribution();
            }
        });
    }
}
