package com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.gender.read;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.gender.BulkAdGroupGenderCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupGenderCriterion;
import com.microsoft.bingads.v11.campaignmanagement.GenderCriterion;
import com.microsoft.bingads.v11.campaignmanagement.GenderType;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BulkAdGroupGenderCriterionReadTargetTest extends BulkAdGroupGenderCriterionTest {

    @Parameter(value = 1)
    public GenderType expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"Female", GenderType.FEMALE},
                        {"Male", GenderType.MALE},
                        {"", null},
                        {null, null}
                }
        );
    }

    @Test
    public void testRead() {
        testReadProperty(
                "Target",
                datum,
                expectedResult,
                new Function<BulkAdGroupGenderCriterion, GenderType>() {
                    @Override
                    public GenderType apply(BulkAdGroupGenderCriterion c) {
                        return ((GenderCriterion)c.getBiddableAdGroupCriterion().getCriterion()).getGenderType();
                    }
                }
        );
    }
}
