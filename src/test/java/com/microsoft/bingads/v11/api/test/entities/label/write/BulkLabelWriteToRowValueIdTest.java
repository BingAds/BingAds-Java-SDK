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
public class BulkLabelWriteToRowValueIdTest extends BulkLabelTest {

    @Parameter(value = 1)
    public Long expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"123", 123L},
                {"9223372036854775807", 9223372036854775807L},
                {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<Long>testWriteProperty("Id", this.datum, this.expectedResult, new BiConsumer<BulkLabel, Long>() {
            @Override
            public void accept(BulkLabel c, Long v) {
                c.getLabel().setId(v);
            }
        });
    }
}
