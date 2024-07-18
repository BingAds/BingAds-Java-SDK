package com.microsoft.bingads.v13.api.test.entities.brand_list.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.brand_list.BulkBrandListTest;
import com.microsoft.bingads.v13.bulk.entities.BulkBrandList;

@RunWith(Parameterized.class)
public class BulkBrandListReadFromRowValuesNameTest extends BulkBrandListTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Brand List Name", "Brand List Name"},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Name", this.datum, this.expectedResult, new Function<BulkBrandList, String>() {
            @Override
            public String apply(BulkBrandList c) {
                return c.getBrandList().getName();
            }
        });
    }
}
