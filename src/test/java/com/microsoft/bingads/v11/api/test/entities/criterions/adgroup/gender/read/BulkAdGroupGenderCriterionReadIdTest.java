package com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.gender.read;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.gender.BulkAdGroupGenderCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupGenderCriterion;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BulkAdGroupGenderCriterionReadIdTest extends BulkAdGroupGenderCriterionTest {

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
                new Function<BulkAdGroupGenderCriterion, Long>() {
                    @Override
                    public Long apply(BulkAdGroupGenderCriterion c) {
                        return c.getBiddableAdGroupCriterion().getId();
                    }
                }
        );
    }
}
