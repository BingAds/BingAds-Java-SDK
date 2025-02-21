package com.microsoft.bingads.v13.api.test.entities.new_customer_acquisition_goal.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.new_customer_acquisition_goal.BulkNewCustomerAcquisitionGoalTest;
import com.microsoft.bingads.v13.bulk.entities.BulkNewCustomerAcquisitionGoal;

public class BulkNewCustomerAcquisitionGoalWriteToRowValuesTargetTest extends BulkNewCustomerAcquisitionGoalTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Test NewCustomerAcquisitionGoal 1", "Test NewCustomerAcquisitionGoal 1"},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Target", this.datum, this.propertyValue, new BiConsumer<BulkNewCustomerAcquisitionGoal, String>() {
            @Override
            public void accept(BulkNewCustomerAcquisitionGoal c, String v) {
                c.setTarget(v);;
            }
        });
    }
}
