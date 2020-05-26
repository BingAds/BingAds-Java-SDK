package com.microsoft.bingads.v13.api.test.entities.ad_extension.promotion.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.promotion.BulkPromotionAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkPromotionAdExtension;
import com.microsoft.bingads.v13.campaignmanagement.PromotionDiscountModifier;

@RunWith(Parameterized.class)
public class BulkPromotionAdExtensionWriteToValuesDiscountModifierTest extends BulkPromotionAdExtensionTest {
    @Parameter(value = 1)
    public PromotionDiscountModifier propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        // In this example, the parameter generator returns a List of
        // arrays.  Each array has two elements: { datum, expected }.
        // These data are hard-coded into the class, but they could be
        // generated or loaded in any way you like.
        return Arrays.asList(new Object[][]{
            {"None", PromotionDiscountModifier.NONE},
        });
    }

    @Test
    public void testWrite() {
        this.<PromotionDiscountModifier>testWriteProperty("Discount Modifier", this.datum, this.propertyValue, new BiConsumer<BulkPromotionAdExtension, PromotionDiscountModifier>() {
            @Override
            public void accept(BulkPromotionAdExtension c, PromotionDiscountModifier v) {
                c.getPromotionAdExtension().setDiscountModifier(v);
            }
        });
    }
}
