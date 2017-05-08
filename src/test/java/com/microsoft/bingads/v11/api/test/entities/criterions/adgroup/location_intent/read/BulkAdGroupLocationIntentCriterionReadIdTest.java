package com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.location_intent.read;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.location_intent.BulkAdGroupLocationIntentCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupLocationIntentCriterion;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BulkAdGroupLocationIntentCriterionReadIdTest extends BulkAdGroupLocationIntentCriterionTest {

    @Parameter(value = 1)
    public Long expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"123", 123L},
                        {"9223372036854775807", 9223372036854775807L},
                        {"", null},
                        {null, null}
                }
        );
    }

    @Test
    public void testRead() {
        testReadProperty(
                "Id",
                datum,
                expectedResult,
                new Function<BulkAdGroupLocationIntentCriterion, Long>() {
                    @Override
                    public Long apply(BulkAdGroupLocationIntentCriterion c) {
                        return c.getAdGroupCriterion().getId();
                    }
                }
        );
    }
}
