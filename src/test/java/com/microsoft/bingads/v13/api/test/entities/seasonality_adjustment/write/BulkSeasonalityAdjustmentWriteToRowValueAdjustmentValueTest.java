package com.microsoft.bingads.v13.api.test.entities.seasonality_adjustment.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.seasonality_adjustment.BulkSeasonalityAdjustmentTest;
import com.microsoft.bingads.v13.bulk.entities.BulkSeasonalityAdjustment;

@RunWith(Parameterized.class)
public class BulkSeasonalityAdjustmentWriteToRowValueAdjustmentValueTest extends BulkSeasonalityAdjustmentTest {

    @Parameter(value = 1)
    public Double expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"123.123", 123.123},
                {"0.0", 0.0},
                {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<Double>testWriteProperty("Adjustment Value", this.datum, this.expectedResult, new BiConsumer<BulkSeasonalityAdjustment, Double>() {
            @Override
            public void accept(BulkSeasonalityAdjustment c, Double v) {
                c.getSeasonalityAdjustment().setAdjustmentPercentage(v);
            }
        });
    }
}
