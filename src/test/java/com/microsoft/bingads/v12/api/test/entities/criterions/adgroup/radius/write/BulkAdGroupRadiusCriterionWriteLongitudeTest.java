package com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.radius.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.radius.BulkAdGroupRadiusCriterionTest;
import com.microsoft.bingads.v12.bulk.entities.BulkAdGroupRadiusCriterion;
import com.microsoft.bingads.v12.campaignmanagement.RadiusCriterion;

@RunWith(Parameterized.class)
public class BulkAdGroupRadiusCriterionWriteLongitudeTest extends BulkAdGroupRadiusCriterionTest {

    @Parameter(value = 1)
    public Double propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"12.3", 12.3},
                        {null, null}
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Longitude",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupRadiusCriterion, Double>() {
                    @Override
                    public void accept(BulkAdGroupRadiusCriterion c, Double v) {
                    	((RadiusCriterion)c.getBiddableAdGroupCriterion().getCriterion()).setLongitudeDegrees(v);
                    }
                }
        );
    }
}
