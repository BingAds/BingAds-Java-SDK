package com.microsoft.bingads.v13.api.test.entities.content_placement.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.content_placement.BulkContentPlacementTest;
import com.microsoft.bingads.v13.bulk.entities.BulkContentPlacement;

@RunWith(Parameterized.class)
public class BulkContentPlacementWriteToRowValuesNameTest extends BulkContentPlacementTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
    	return Arrays.asList(new Object[][]{
    		{"Content Placement Name", "Content Placement Name"},
            {null, null}
    	});
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Name", this.datum, this.propertyValue, new BiConsumer<BulkContentPlacement, String>() {
            @Override
            public void accept(BulkContentPlacement c, String v) {
                c.setName(v);
            }
        });
    }
}
