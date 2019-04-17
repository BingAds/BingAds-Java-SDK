package com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.radius.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.radius.BulkAdGroupRadiusCriterionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupRadiusCriterion;
import com.microsoft.bingads.v13.campaignmanagement.RadiusCriterion;

@RunWith(Parameterized.class)
public class BulkAdGroupRadiusCriterionReadRadiusTest extends BulkAdGroupRadiusCriterionTest {

    @Parameter(value = 1)
    public Long expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"123", 123L},
                        {"", null},
                        {null, null}
                }
        );
    }

    @Test
    public void testRead() {
        testReadProperty(
                "Radius",
                datum,
                expectedResult,
                new Function<BulkAdGroupRadiusCriterion, Long>() {
                    @Override
                    public Long apply(BulkAdGroupRadiusCriterion c) {
                        return ((RadiusCriterion)c.getBiddableAdGroupCriterion().getCriterion()).getRadius();
                    }
                }
        );
    }
}
