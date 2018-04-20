package com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.radius.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.radius.BulkAdGroupRadiusCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupRadiusCriterion;
import com.microsoft.bingads.v11.campaignmanagement.DistanceUnit;
import com.microsoft.bingads.v11.campaignmanagement.RadiusCriterion;

@RunWith(Parameterized.class)
public class BulkAdGroupRadiusCriterionWriteRadiusUnitTest extends BulkAdGroupRadiusCriterionTest {

    @Parameter(value = 1)
    public DistanceUnit propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"Kilometers", DistanceUnit.KILOMETERS},
                        {"Miles", DistanceUnit.MILES},
                        {null, null}
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Unit",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupRadiusCriterion, DistanceUnit>() {
                    @Override
                    public void accept(BulkAdGroupRadiusCriterion c, DistanceUnit v) {
                    	((RadiusCriterion)c.getBiddableAdGroupCriterion().getCriterion()).setRadiusUnit(v);
                    }
                }
        );
    }
}
