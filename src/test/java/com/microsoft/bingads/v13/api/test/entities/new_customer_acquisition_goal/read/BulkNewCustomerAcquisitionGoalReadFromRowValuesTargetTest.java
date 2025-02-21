package com.microsoft.bingads.v13.api.test.entities.new_customer_acquisition_goal.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.new_customer_acquisition_goal.BulkNewCustomerAcquisitionGoalTest;
import com.microsoft.bingads.v13.bulk.entities.BulkNewCustomerAcquisitionGoal;

public class BulkNewCustomerAcquisitionGoalReadFromRowValuesTargetTest extends BulkNewCustomerAcquisitionGoalTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"123;456;789", "123;456;789"},
            {"", ""},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Target", this.datum, this.expectedResult, new Function<BulkNewCustomerAcquisitionGoal, String>() {
            @Override
            public String apply(BulkNewCustomerAcquisitionGoal c) {
                return c.getTarget();
            }
        });
    }
}
