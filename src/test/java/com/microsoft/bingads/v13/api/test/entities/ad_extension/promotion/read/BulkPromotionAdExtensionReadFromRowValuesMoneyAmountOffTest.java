package com.microsoft.bingads.v13.api.test.entities.ad_extension.promotion.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.promotion.BulkPromotionAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkPromotionAdExtension;

public class BulkPromotionAdExtensionReadFromRowValuesMoneyAmountOffTest extends BulkPromotionAdExtensionTest {

    @Parameter
    public String datum;

    @Parameter(value = 1)
    public Double expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"123.4", 123.4},
        });
    }

    @Test
    public void testRead() {
        this.<Double>testReadProperty("Money Amount Off", this.datum, this.expectedResult, new Function<BulkPromotionAdExtension, Double>() {
            @Override
            public Double apply(BulkPromotionAdExtension c) {
                return c.getPromotionAdExtension().getMoneyAmountOff();
            }
        });
    }
}
