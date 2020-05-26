package com.microsoft.bingads.v13.api.test.entities.ad_extension.promotion.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.promotion.BulkPromotionAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkPromotionAdExtension;
import com.microsoft.bingads.v13.campaignmanagement.PromotionDiscountModifier;

public class BulkPromotionAdExtensionReadFromRowValuesDiscountModifierTest extends BulkPromotionAdExtensionTest {


    @Parameter
    public String datum;

    @Parameter(value = 1)
    public PromotionDiscountModifier expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"None", PromotionDiscountModifier.NONE},
        });
    }

    @Test
    public void testRead() {

        this.<PromotionDiscountModifier>testReadProperty("Discount Modifier", this.datum, this.expectedResult, new Function<BulkPromotionAdExtension, PromotionDiscountModifier>() {
            @Override
            public PromotionDiscountModifier apply(BulkPromotionAdExtension c) {
                return c.getPromotionAdExtension().getDiscountModifier();
            }
        });
    }
}
