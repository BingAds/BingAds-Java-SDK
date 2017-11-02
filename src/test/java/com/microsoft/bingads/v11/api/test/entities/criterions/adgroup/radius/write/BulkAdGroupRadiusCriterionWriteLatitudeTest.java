package com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.radius.write;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.radius.BulkAdGroupRadiusCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupRadiusCriterion;
import com.microsoft.bingads.v11.campaignmanagement.RadiusCriterion;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BulkAdGroupRadiusCriterionWriteLatitudeTest extends BulkAdGroupRadiusCriterionTest {

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
                "Latitude",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupRadiusCriterion, Double>() {
                    @Override
                    public void accept(BulkAdGroupRadiusCriterion c, Double v) {
                    	((RadiusCriterion)c.getBiddableAdGroupCriterion().getCriterion()).setLatitudeDegrees(v);
                    }
                }
        );
    }
}
