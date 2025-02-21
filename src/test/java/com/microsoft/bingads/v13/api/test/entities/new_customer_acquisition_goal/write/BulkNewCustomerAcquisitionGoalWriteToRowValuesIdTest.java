package com.microsoft.bingads.v13.api.test.entities.new_customer_acquisition_goal.write;

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
public class BulkNewCustomerAcquisitionGoalWriteToRowValuesIdTest extends BulkNewCustomerAcquisitionGoalTest {

    @Parameter(value = 1)
    public Long propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"123", 123L},
            {"9223372036854775807", 9223372036854775807L}
        });
    }

    @Test
    public void testWrite() {
        this.<Long>testWriteProperty("Id", this.datum, this.propertyValue, new BiConsumer<BulkNewCustomerAcquisitionGoal, Long>() {
            @Override
            public void accept(BulkNewCustomerAcquisitionGoal c, Long v) {
                c.getNewCustomerAcquisitionGoal().setId(v);;
            }
        });
    }
}
