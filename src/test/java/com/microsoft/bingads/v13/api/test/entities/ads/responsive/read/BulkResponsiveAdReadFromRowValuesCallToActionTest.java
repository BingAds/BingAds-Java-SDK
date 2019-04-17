package com.microsoft.bingads.v13.api.test.entities.ads.responsive.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.ads.responsive.BulkResponsiveAdTest;
import com.microsoft.bingads.v13.bulk.entities.BulkResponsiveAd;
import com.microsoft.bingads.v13.campaignmanagement.CallToAction;

public class BulkResponsiveAdReadFromRowValuesCallToActionTest extends BulkResponsiveAdTest {

    @Parameter(value = 1)
    public CallToAction expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"AddToCart", CallToAction.ADD_TO_CART},
                {null, null}
        });
    }

    @Test
    public void testRead() {
        this.testReadProperty("Call To Action", this.datum, this.expectedResult, new Function<BulkResponsiveAd, CallToAction>() {
            @Override
            public CallToAction apply(BulkResponsiveAd c) {
                return c.getResponsiveAd().getCallToAction();
            }
        });
    }
}
