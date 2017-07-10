package com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.radius.read;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.radius.BulkAdGroupRadiusCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupRadiusCriterion;
import com.microsoft.bingads.v11.campaignmanagement.RadiusCriterion;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BulkAdGroupRadiusCriterionReadNameTest extends BulkAdGroupRadiusCriterionTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"Test1", "Test1"},
                        {"Test 2", "Test 2"},
                        {"", ""},
                        {null, null}
                }
        );
    }

    @Test
    public void testRead() {
        testReadProperty(
                "Name",
                datum,
                expectedResult,
                new Function<BulkAdGroupRadiusCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupRadiusCriterion c) {
                        return ((RadiusCriterion)c.getBiddableAdGroupCriterion().getCriterion()).getName();
                    }
                }
        );
    }
}
