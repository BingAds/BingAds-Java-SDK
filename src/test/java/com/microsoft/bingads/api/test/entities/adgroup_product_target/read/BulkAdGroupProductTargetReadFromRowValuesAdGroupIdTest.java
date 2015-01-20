package com.microsoft.bingads.api.test.entities.adgroup_product_target.read;

import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.Function;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.api.test.entities.adgroup_product_target.BulkAdGroupProductTargetTest;
import com.microsoft.bingads.bulk.entities.BulkAdGroupProductTarget;

public class BulkAdGroupProductTargetReadFromRowValuesAdGroupIdTest extends BulkAdGroupProductTargetTest {

    @Parameter(value = 1)
    public Long expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"123", 123L},
            {"9223372036854775807", 9223372036854775807L},});
    }

    @Test
    public void testRead() {
        this.<Long>testReadProperty("Parent Id", this.datum, this.expectedResult, new Function<BulkAdGroupProductTarget, Long>() {
            @Override
            public Long apply(BulkAdGroupProductTarget c) {
                return c.getBiddableAdGroupCriterion().getAdGroupId();
            }
        });
    }
}
