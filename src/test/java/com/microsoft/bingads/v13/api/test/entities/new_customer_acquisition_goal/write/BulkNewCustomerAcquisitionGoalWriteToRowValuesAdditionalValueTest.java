package com.microsoft.bingads.v13.api.test.entities.new_customer_acquisition_goal.write;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.new_customer_acquisition_goal.BulkNewCustomerAcquisitionGoalTest;
import com.microsoft.bingads.v13.bulk.entities.BulkNewCustomerAcquisitionGoal;

@RunWith(Parameterized.class)
public class BulkNewCustomerAcquisitionGoalWriteToRowValuesAdditionalValueTest extends BulkNewCustomerAcquisitionGoalTest {

    @Parameter(value = 1)
    public BigDecimal propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"12.34", BigDecimal.valueOf(12.34)},
            {"123.0", BigDecimal.valueOf(123.0)},
            {null, null}});
    }

    @Test
    public void testRead() {
        this.<BigDecimal>testWriteProperty("Additional Conversion Value", this.datum, this.propertyValue, new BiConsumer<BulkNewCustomerAcquisitionGoal, BigDecimal>() {
            @Override
            public void accept(BulkNewCustomerAcquisitionGoal c, BigDecimal v) {
                c.getNewCustomerAcquisitionGoal().setAdditionalValue(v);;
            }
        });
    }
}
