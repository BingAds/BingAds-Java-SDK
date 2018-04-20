package com.microsoft.bingads.v12.api.test.entities.label.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v12.api.test.entities.label.BulkLabelTest;
import com.microsoft.bingads.v12.bulk.entities.BulkLabel;

@RunWith(Parameterized.class)
public class BulkLabelWriteToRowValueDescriptionTest extends BulkLabelTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Some descriptions", "Some descriptions"},
                {"", ""},
                {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testWriteProperty("Description", this.datum, this.expectedResult, new BiConsumer<BulkLabel, String>() {
            @Override
            public void accept(BulkLabel c, String v) {
                c.getLabel().setDescription(v);
            }
        });
    }
}
