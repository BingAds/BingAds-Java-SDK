package com.microsoft.bingads.v13.api.test.entities.adgroup.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.adgroup.BulkAdGroupTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroup;

@RunWith(Parameterized.class)
public class BulkAdGroupWriteToRowValuesUseOptimizedTargetingTest extends BulkAdGroupTest {

    @Parameter(value = 1)
    public Boolean propertyValue;

    @Parameters
    public static Collection<Object[]> data() {

        return Arrays.asList(new Object[][]{
            {"False", false},
            {"True", true},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<Boolean>testWriteProperty("Use Optimized Targeting", this.datum, this.propertyValue, new BiConsumer<BulkAdGroup, Boolean>() {
            @Override
            public void accept(BulkAdGroup c, Boolean v) {
                c.getAdGroup().setUseOptimizedTargeting(v);
            }
        });
    }
}
