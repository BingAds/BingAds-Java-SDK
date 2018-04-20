package com.microsoft.bingads.v11.api.test.entities.label.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.label.BulkLabelTest;
import com.microsoft.bingads.v11.bulk.entities.BulkLabel;

@RunWith(Parameterized.class)
public class BulkLabelWriteToRowValueColorCodeTest extends BulkLabelTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"#FFFFFF", "#FFFFFF"},
                {"#000000", "#000000"},
                {"", ""},
                {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testWriteProperty("Color", this.datum, this.expectedResult, new BiConsumer<BulkLabel, String>() {
            @Override
            public void accept(BulkLabel c, String v) {
                c.getLabel().setColorCode(v);
            }
        });
    }
}
