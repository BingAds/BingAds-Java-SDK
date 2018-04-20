package com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.location.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.location.BulkAdGroupLocationCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupLocationCriterion;
import com.microsoft.bingads.v11.campaignmanagement.LocationCriterion;

@RunWith(Parameterized.class)
public class BulkAdGroupLocationCriterionReadDisplayNameTest extends BulkAdGroupLocationCriterionTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"Test", "Test"},
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
                new Function<BulkAdGroupLocationCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupLocationCriterion c) {
                        return ((LocationCriterion)c.getBiddableAdGroupCriterion().getCriterion()).getDisplayName();
                    }
                }
        );
    }
}
