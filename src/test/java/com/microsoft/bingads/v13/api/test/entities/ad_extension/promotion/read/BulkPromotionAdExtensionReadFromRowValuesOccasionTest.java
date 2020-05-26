package com.microsoft.bingads.v13.api.test.entities.ad_extension.promotion.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.promotion.BulkPromotionAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkPromotionAdExtension;
import com.microsoft.bingads.v13.campaignmanagement.PromotionOccasion;

public class BulkPromotionAdExtensionReadFromRowValuesOccasionTest extends BulkPromotionAdExtensionTest {


    @Parameter
    public String datum;

    @Parameter(value = 1)
    public PromotionOccasion expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"BackToSchool", PromotionOccasion.BACK_TO_SCHOOL},
        });
    }

    @Test
    public void testRead() {

        this.<PromotionOccasion>testReadProperty("Occasion", this.datum, this.expectedResult, new Function<BulkPromotionAdExtension, PromotionOccasion>() {
            @Override
            public PromotionOccasion apply(BulkPromotionAdExtension c) {
                return c.getPromotionAdExtension().getPromotionOccasion();
            }
        });
    }
}
