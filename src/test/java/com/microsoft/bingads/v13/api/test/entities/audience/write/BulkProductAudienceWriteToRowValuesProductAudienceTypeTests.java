package com.microsoft.bingads.v13.api.test.entities.audience.write;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.audience.BulkProductAudienceTest;
import com.microsoft.bingads.v13.bulk.entities.BulkProductAudience;
import com.microsoft.bingads.v13.campaignmanagement.ProductAudienceType;

@RunWith(Parameterized.class)
public class BulkProductAudienceWriteToRowValuesProductAudienceTypeTests extends BulkProductAudienceTest {

    @Parameter(value = 1)
    public ProductAudienceType propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        // In this example, the parameter generator returns a List of
        // arrays.  Each array has two elements: { datum, expected }.
        // These data are hard-coded into the class, but they could be
        // generated or loaded in any way you like.
        return Arrays.asList(new Object[][]{
            {ProductAudienceType.GENERAL_VISITORS.value(), ProductAudienceType.GENERAL_VISITORS},
            {ProductAudienceType.PAST_BUYERS.value(), ProductAudienceType.PAST_BUYERS},
            {ProductAudienceType.PRODUCT_SEARCHERS.value(), ProductAudienceType.PRODUCT_SEARCHERS},
            {ProductAudienceType.PRODUCT_VIEWERS.value(), ProductAudienceType.PRODUCT_VIEWERS},
            {ProductAudienceType.SHOPPING_CART_ABANDONERS.value(), ProductAudienceType.SHOPPING_CART_ABANDONERS}
        });
    }

    @Test
    public void testWrite() {
        this.<ProductAudienceType>testWriteProperty("Product Audience Type", this.datum, this.propertyValue, new BiConsumer<BulkProductAudience, ProductAudienceType>() {
            @Override
            public void accept(BulkProductAudience c, ProductAudienceType v) {
                c.getProductAudience().setProductAudienceType(Collections.singleton(v));
            }
        });
    }
}
