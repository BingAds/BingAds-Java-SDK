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
public class BulkAdGroupLocationIntentCriterionReadAdGroupNameTest extends BulkAdGroupLocationIntentCriterionTest {

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
    public void testRead() {
        testReadProperty(
                "Ad Group",
                datum,
                expectedResult,
                new Function<BulkAdGroupLocationIntentCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupLocationIntentCriterion c) {
                        return c.getAdGroupName();
                    }
                }
        );
    }
}
