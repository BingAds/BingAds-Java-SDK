package com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.age.read;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.age.BulkAdGroupAgeCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupAgeCriterion;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BulkAdGroupAgeCriterionReadCampaignNameTest extends BulkAdGroupAgeCriterionTest {

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
                "Campaign",
                datum,
                expectedResult,
                new Function<BulkAdGroupAgeCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupAgeCriterion c) {
                        return c.getCampaignName();
                    }
                }
        );
    }
}
