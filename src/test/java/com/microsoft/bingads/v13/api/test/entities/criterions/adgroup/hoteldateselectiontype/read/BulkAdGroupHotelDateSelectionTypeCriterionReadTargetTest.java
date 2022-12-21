package com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.hoteldateselectiontype.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.hoteldateselectiontype.BulkAdGroupHotelDateSelectionTypeCriterionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupHotelDateSelectionTypeCriterion;
import com.microsoft.bingads.v13.campaignmanagement.HotelDateSelectionType;
import com.microsoft.bingads.v13.campaignmanagement.HotelDateSelectionTypeCriterion;

@RunWith(Parameterized.class)
public class BulkAdGroupHotelDateSelectionTypeCriterionReadTargetTest extends BulkAdGroupHotelDateSelectionTypeCriterionTest {

    @Parameter(value = 1)
    public HotelDateSelectionType expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"DefaultSelection", HotelDateSelectionType.DEFAULT_SELECTION},
            {"UserSelection", HotelDateSelectionType.USER_SELECTION}
        });
    }

    @Test
    public void testRead() {
        testReadProperty("Target", datum, expectedResult, new Function<BulkAdGroupHotelDateSelectionTypeCriterion, HotelDateSelectionType>() {
            @Override
            public HotelDateSelectionType apply(BulkAdGroupHotelDateSelectionTypeCriterion c) {
                return ((HotelDateSelectionTypeCriterion) c.getBiddableAdGroupCriterion().getCriterion()).getHotelDateSelectionType();
            }
        });
    }
}
