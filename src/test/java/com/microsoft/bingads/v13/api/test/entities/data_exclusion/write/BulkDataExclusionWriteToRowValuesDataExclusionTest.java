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
public class BulkDataExclusionWriteToRowValuesDataExclusionTest extends BulkDataExclusionTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
    	return Arrays.asList(new Object[][]{
    		{"DataExclusionName", "DataExclusionName"},
            {null, null}
    	});
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Data Exclusion", this.datum, this.propertyValue, new BiConsumer<BulkDataExclusion, String>() {
            @Override
            public void accept(BulkDataExclusion c, String v) {
                c.getDataExclusion().setName(v);
            }
        });
    }
}
