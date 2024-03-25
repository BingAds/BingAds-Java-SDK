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
public class BulkSeasonalityAdjustmentReadFromRowValueAdjustmentValueTest extends BulkSeasonalityAdjustmentTest {

    @Parameter(value = 1)
    public Double expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"123.123", 123.123},
                {"9223.372036", 9223.372036},
                {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<Double>testReadProperty("Adjustment Value", this.datum, this.expectedResult, new Function<BulkSeasonalityAdjustment, Double>() {
            @Override
            public Double apply(BulkSeasonalityAdjustment c) {
                return c.getSeasonalityAdjustment().getAdjustmentPercentage();
            }
        });
    }
}
