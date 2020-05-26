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
import com.microsoft.bingads.v13.campaignmanagement.PromotionOccasion;

@RunWith(Parameterized.class)
public class BulkPromotionAdExtensionWriteToValuesOccasionTest extends BulkPromotionAdExtensionTest {
    @Parameter(value = 1)
    public PromotionOccasion propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        // In this example, the parameter generator returns a List of
        // arrays.  Each array has two elements: { datum, expected }.
        // These data are hard-coded into the class, but they could be
        // generated or loaded in any way you like.
        return Arrays.asList(new Object[][]{
            {PromotionOccasion.BLACK_FRIDAY.value(), PromotionOccasion.BLACK_FRIDAY},
            {PromotionOccasion.CYBER_MONDAY.value(), PromotionOccasion.CYBER_MONDAY},
        });
    }

    @Test
    public void testWrite() {
        this.<PromotionOccasion>testWriteProperty("Occasion", this.datum, this.propertyValue, new BiConsumer<BulkPromotionAdExtension, PromotionOccasion>() {
            @Override
            public void accept(BulkPromotionAdExtension c, PromotionOccasion v) {
                c.getPromotionAdExtension().setPromotionOccasion(v);
            }
        });
    }
}
