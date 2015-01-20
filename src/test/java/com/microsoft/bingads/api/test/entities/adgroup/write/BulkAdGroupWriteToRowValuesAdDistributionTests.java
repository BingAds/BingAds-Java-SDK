package com.microsoft.bingads.api.test.entities.adgroup.write;

import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;

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
public class BulkAdGroupWriteToRowValuesAdDistributionTests extends BulkAdGroupTest {

    @Parameter(value = 1)
    public List<AdDistribution> propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        // In this example, the parameter generator returns a List of
        // arrays.  Each array has two elements: { datum, expected }.
        // These data are hard-coded into the class, but they could be
        // generated or loaded in any way you like.
        return Arrays.asList(new Object[][]{
            {"On", Arrays.asList(new AdDistribution[]{AdDistribution.SEARCH})},
            {"On", Arrays.asList(new AdDistribution[]{AdDistribution.SEARCH, AdDistribution.CONTENT})},
            {"Off", Arrays.asList(new AdDistribution[]{AdDistribution.CONTENT})},
            {"Off", Arrays.asList(new AdDistribution[]{})}
        });
    }

    @Test
    public void testWrite() {
        this.<List<AdDistribution>>testWriteProperty("Search Network", this.datum, this.propertyValue, new BiConsumer<BulkAdGroup, List<AdDistribution>>() {
            @Override
            public void accept(BulkAdGroup c, List<AdDistribution> v) {
                c.getAdGroup().setAdDistribution(v);
            }
        });
    }
}
