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
public class BulkSeasonalityAdjustmentWriteToRowValuesSeasonalityAdjustmentTest extends BulkSeasonalityAdjustmentTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
    	return Arrays.asList(new Object[][]{
    		{"SeasonalityAdjustmentName", "SeasonalityAdjustmentName"},
            {null, null}
    	});
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Seasonality Adjustment", this.datum, this.propertyValue, new BiConsumer<BulkSeasonalityAdjustment, String>() {
            @Override
            public void accept(BulkSeasonalityAdjustment c, String v) {
                c.getSeasonalityAdjustment().setName(v);
            }
        });
    }
}
