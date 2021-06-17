package com.microsoft.bingads.v13.api.test.entities.account.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.account.BulkAccountTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAccount;

@RunWith(Parameterized.class)
public class BulkAccountReadFromRowValuesAdClickParallelTrackingTest extends BulkAccountTest {

    @Parameter(value = 1)
    public Boolean expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"true", true},
            {"false", false},
            {null, null},
        });
    }

    @Test
    public void testRead() {
        this.<Boolean>testReadProperty("Ad Click Parallel Tracking", this.datum, this.expectedResult, new Function<BulkAccount, Boolean>() {
            @Override
            public Boolean apply(BulkAccount c) {
                return c.getAdClickParallelTracking();
            }
        });
    }
}
