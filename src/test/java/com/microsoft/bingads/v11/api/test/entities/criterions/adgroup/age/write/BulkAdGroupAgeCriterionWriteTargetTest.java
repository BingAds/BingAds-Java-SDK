package com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.age.write;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.age.BulkAdGroupAgeCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupAgeCriterion;
import com.microsoft.bingads.v11.campaignmanagement.AgeRange;
import com.microsoft.bingads.v11.campaignmanagement.AgeCriterion;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BulkAdGroupAgeCriterionWriteTargetTest extends BulkAdGroupAgeCriterionTest {

    @Parameterized.Parameter(value = 1)
    public AgeRange propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"EighteenToTwentyFour", AgeRange.EIGHTEEN_TO_TWENTY_FOUR},
                        {"FiftyToSixtyFour", AgeRange.FIFTY_TO_SIXTY_FOUR},
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
                new BiConsumer<BulkAdGroupAgeCriterion, AgeRange>() {
                    @Override
                    public void accept(BulkAdGroupAgeCriterion c, AgeRange v) {
                        ((AgeCriterion)c.getBiddableAdGroupCriterion().getCriterion()).setAgeRange(v);
                    }
                }
        );
    }
}
