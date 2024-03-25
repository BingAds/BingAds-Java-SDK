package com.microsoft.bingads.v13.api.test.entities.data_exclusion.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.data_exclusion.BulkDataExclusionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkDataExclusion;

@RunWith(Parameterized.class)
public class BulkDataExclusionWriteToRowValuesIdTest extends BulkDataExclusionTest {

    @Parameter(value = 1)
    public Long propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
    	return Arrays.asList(new Object[][]{
            {"123", 123L},
            {"9223372036854775807", 9223372036854775807L},
            {null, null}
    	});
    }

    @Test
    public void testWrite() {
        this.<Long>testWriteProperty("Id", this.datum, this.propertyValue, new BiConsumer<BulkDataExclusion, Long>() {
            @Override
            public void accept(BulkDataExclusion c, Long v) {
                c.getDataExclusion().setId(v);
            }
        });
    }
}
