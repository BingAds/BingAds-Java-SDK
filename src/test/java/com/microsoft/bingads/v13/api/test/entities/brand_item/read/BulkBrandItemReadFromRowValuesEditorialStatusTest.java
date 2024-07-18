package com.microsoft.bingads.v13.api.test.entities.brand_item.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.brand_item.BulkBrandItemTest;
import com.microsoft.bingads.v13.bulk.entities.BulkBrandItem;

@RunWith(Parameterized.class)
public class BulkBrandItemReadFromRowValuesEditorialStatusTest extends BulkBrandItemTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Pending", "Pending"},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Editorial Status", this.datum, this.expectedResult, new Function<BulkBrandItem, String>() {
            @Override
            public String apply(BulkBrandItem c) {
                return c.getEditorialStatus();
            }
        });
    }
}
