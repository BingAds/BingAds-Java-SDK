package com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.age.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.age.BulkAdGroupAgeCriterionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupAgeCriterion;
import com.microsoft.bingads.v13.campaignmanagement.AgeCriterion;
import com.microsoft.bingads.v13.campaignmanagement.AgeRange;

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
