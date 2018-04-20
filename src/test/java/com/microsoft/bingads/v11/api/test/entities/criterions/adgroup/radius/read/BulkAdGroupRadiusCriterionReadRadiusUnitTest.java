package com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.radius.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.radius.BulkAdGroupRadiusCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupRadiusCriterion;
import com.microsoft.bingads.v11.campaignmanagement.DistanceUnit;
import com.microsoft.bingads.v11.campaignmanagement.RadiusCriterion;

@RunWith(Parameterized.class)
public class BulkAdGroupRadiusCriterionReadRadiusUnitTest extends BulkAdGroupRadiusCriterionTest {

    @Parameter(value = 1)
    public DistanceUnit expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"Kilometers", DistanceUnit.KILOMETERS},
                        {"Miles", DistanceUnit.MILES},
                        {"", null},
                        {null, null}
                }
        );
    }

    @Test
    public void testRead() {
        testReadProperty(
                "Unit",
                datum,
                expectedResult,
                new Function<BulkAdGroupRadiusCriterion, DistanceUnit>() {
                    @Override
                    public DistanceUnit apply(BulkAdGroupRadiusCriterion c) {
                        return ((RadiusCriterion)c.getBiddableAdGroupCriterion().getCriterion()).getRadiusUnit();
                    }
                }
        );
    }
}
