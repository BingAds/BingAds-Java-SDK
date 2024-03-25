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
public class BulkSeasonalityAdjustmentReadFromRowValuesSeasonalityAdjustmentTest extends BulkSeasonalityAdjustmentTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"SeasonalityAdjustment Name", "SeasonalityAdjustment Name"},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Seasonality Adjustment", this.datum, this.expectedResult, new Function<BulkSeasonalityAdjustment, String>() {
            @Override
            public String apply(BulkSeasonalityAdjustment c) {
                return c.getSeasonalityAdjustment().getName();
            }
        });
    }
}
