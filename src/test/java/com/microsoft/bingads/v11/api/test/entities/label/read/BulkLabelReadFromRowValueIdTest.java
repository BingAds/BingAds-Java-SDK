package com.microsoft.bingads.v11.api.test.entities.label.read;

import com.microsoft.bingads.v11.api.test.entities.label.BulkLabelTest;
import com.microsoft.bingads.v11.bulk.entities.BulkLabel;
import com.microsoft.bingads.internal.functionalinterfaces.Function;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkLabelReadFromRowValueIdTest extends BulkLabelTest {

    @Parameter(value = 1)
    public Long expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"123", 123L},
                {"9223372036854775807", 9223372036854775807L},
                {"", null},
                {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<Long>testReadProperty("Id", this.datum, this.expectedResult, new Function<BulkLabel, Long>() {
            @Override
            public Long apply(BulkLabel c) {
                return c.getLabel().getId();
            }
        });
    }
}
