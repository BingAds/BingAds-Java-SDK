package com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.negative_location.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.negative_location.BulkAdGroupNegativeLocationCriterionTest;
import com.microsoft.bingads.v12.bulk.entities.BulkAdGroupNegativeLocationCriterion;

@RunWith(Parameterized.class)
public class BulkAdGroupNegativeLocationCriterionReadParentIdTest extends BulkAdGroupNegativeLocationCriterionTest {

    @Parameter(value = 1)
    public Long expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"123", 123L},
                        {"9223372036854775807", 9223372036854775807L},
                }
        );
    }

    @Test
    public void testRead() {
        testReadProperty(
                "Parent Id",
                datum,
                expectedResult,
                new Function<BulkAdGroupNegativeLocationCriterion, Long>() {
                    @Override
                    public Long apply(BulkAdGroupNegativeLocationCriterion c) {
                        return c.getNegativeAdGroupCriterion().getAdGroupId();
                    }
                }
        );
    }
}
