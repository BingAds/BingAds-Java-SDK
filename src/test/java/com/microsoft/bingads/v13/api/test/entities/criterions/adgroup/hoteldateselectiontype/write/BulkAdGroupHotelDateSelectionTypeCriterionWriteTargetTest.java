package com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.hoteldateselectiontype.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.hoteldateselectiontype.BulkAdGroupHotelDateSelectionTypeCriterionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupHotelDateSelectionTypeCriterion;
import com.microsoft.bingads.v13.campaignmanagement.HotelDateSelectionType;
import com.microsoft.bingads.v13.campaignmanagement.HotelDateSelectionTypeCriterion;

@RunWith(Parameterized.class)
public class BulkAdGroupHotelDateSelectionTypeCriterionWriteTargetTest extends BulkAdGroupHotelDateSelectionTypeCriterionTest {

    @Parameter(value = 1)
    public HotelDateSelectionType expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"UserSelection", HotelDateSelectionType.USER_SELECTION},
            {"DefaultSelection", HotelDateSelectionType.DEFAULT_SELECTION}
        });
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Target",
                datum,
                expectedResult,
                new BiConsumer<BulkAdGroupHotelDateSelectionTypeCriterion, HotelDateSelectionType>() {
                    @Override
                    public void accept(BulkAdGroupHotelDateSelectionTypeCriterion c, HotelDateSelectionType v) {
                        ((HotelDateSelectionTypeCriterion)c.getBiddableAdGroupCriterion().getCriterion()).setHotelDateSelectionType(v);
                    }
                }
        );
    }
}
