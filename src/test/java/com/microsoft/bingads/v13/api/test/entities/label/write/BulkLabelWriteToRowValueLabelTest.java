package com.microsoft.bingads.v13.api.test.entities.label.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.label.BulkLabelTest;
import com.microsoft.bingads.v13.bulk.entities.BulkLabel;

@RunWith(Parameterized.class)
public class BulkLabelWriteToRowValueLabelTest extends BulkLabelTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"A Label Name", "A Label Name"},
                {"", ""},
                {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testWriteProperty("Label", this.datum, this.expectedResult, new BiConsumer<BulkLabel, String>() {
            @Override
            public void accept(BulkLabel c, String v) {
                c.getLabel().setName(v);
            }
        });
    }
}
