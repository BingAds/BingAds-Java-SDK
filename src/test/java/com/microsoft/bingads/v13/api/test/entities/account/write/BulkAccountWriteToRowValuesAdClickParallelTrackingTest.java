package com.microsoft.bingads.v13.api.test.entities.account.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.account.BulkAccountTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAccount;

@RunWith(Parameterized.class)
public class BulkAccountWriteToRowValuesAdClickParallelTrackingTest extends BulkAccountTest {

    @Parameter(value = 1)
    public Boolean propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"true", true},
            {"false", false},
            {null, null},
        });
    }

    @Test
    public void testWrite() {
        this.<Boolean>testWriteProperty("Ad Click Parallel Tracking", this.datum, this.propertyValue, new BiConsumer<BulkAccount, Boolean>() {
            @Override
            public void accept(BulkAccount c, Boolean v) {
                c.setAdClickParallelTracking(v);
            }
        });
    }
}
