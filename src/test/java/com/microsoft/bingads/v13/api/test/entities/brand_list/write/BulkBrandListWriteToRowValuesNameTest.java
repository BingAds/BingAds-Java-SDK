package com.microsoft.bingads.v13.api.test.entities.brand_list.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.brand_list.BulkBrandListTest;
import com.microsoft.bingads.v13.bulk.entities.BulkBrandList;

@RunWith(Parameterized.class)
public class BulkBrandListWriteToRowValuesNameTest extends BulkBrandListTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
    	return Arrays.asList(new Object[][]{
    		{"Brand List Name", "Brand List Name"},
            {null, null}
    	});
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Name", this.datum, this.propertyValue, new BiConsumer<BulkBrandList, String>() {
            @Override
            public void accept(BulkBrandList c, String v) {
                c.getBrandList().setName(v);
            }
        });
    }
}
