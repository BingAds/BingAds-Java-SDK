package com.microsoft.bingads.v13.api.test.entities.seasonality_adjustment.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.seasonality_adjustment.BulkSeasonalityAdjustmentTest;
import com.microsoft.bingads.v13.bulk.entities.BulkSeasonalityAdjustment;

@RunWith(Parameterized.class)
public class BulkSeasonalityAdjustmentReadFromRowValuesIdTest extends BulkSeasonalityAdjustmentTest {

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
        this.<Long>testReadProperty("Id", this.datum, this.expectedResult, new Function<BulkSeasonalityAdjustment, Long>() {
            @Override
            public Long apply(BulkSeasonalityAdjustment c) {
                return c.getSeasonalityAdjustment().getId();
            }
        });
    }
}
