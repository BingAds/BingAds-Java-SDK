package com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.gender.write;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.gender.BulkAdGroupGenderCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupGenderCriterion;
import com.microsoft.bingads.v11.campaignmanagement.GenderCriterion;
import com.microsoft.bingads.v11.campaignmanagement.GenderType;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BulkAdGroupGenderCriterionWriteTargetTest extends BulkAdGroupGenderCriterionTest {

    @Parameterized.Parameter(value = 1)
    public GenderType propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                	{"Female", GenderType.FEMALE},
                    {"Male", GenderType.MALE},
                    {null, null}
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Target",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupGenderCriterion, GenderType>() {
                    @Override
                    public void accept(BulkAdGroupGenderCriterion c, GenderType v) {
                        ((GenderCriterion)c.getAdGroupCriterion().getCriterion()).setGenderType(v);
                    }
                }
        );
    }
}
