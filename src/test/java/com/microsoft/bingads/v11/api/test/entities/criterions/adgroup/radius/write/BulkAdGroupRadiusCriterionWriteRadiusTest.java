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
public class BulkAdGroupRadiusCriterionWriteRadiusTest extends BulkAdGroupRadiusCriterionTest {

    @Parameter(value = 1)
    public Long propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"123", 123L},
                        {null, null}
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Radius",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupRadiusCriterion, Long>() {
                    @Override
                    public void accept(BulkAdGroupRadiusCriterion c, Long v) {
                    	((RadiusCriterion)c.getAdGroupCriterion().getCriterion()).setRadius(v);;
                    }
                }
        );
    }
}
