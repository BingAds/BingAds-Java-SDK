package com.microsoft.bingads.v12.api.test.entities.ads.responsive.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v12.api.test.entities.ads.responsive.BulkResponsiveAdTest;
import com.microsoft.bingads.v12.bulk.entities.BulkResponsiveAd;
import com.microsoft.bingads.v12.campaignmanagement.CallToAction;

public class BulkResponsiveAdWriteFromRowValuesCallToActionTest extends BulkResponsiveAdTest {

    @Parameterized.Parameter(value = 1)
    public CallToAction expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {CallToAction.ADD_TO_CART.value(), CallToAction.ADD_TO_CART},
                {CallToAction.APPLY_NOW.value(), CallToAction.APPLY_NOW},
                {CallToAction.BOOK_NOW.value(), CallToAction.BOOK_NOW},
                {CallToAction.BUY.value(), CallToAction.BUY},
                {CallToAction.BOOK_TRAVEL.value(), CallToAction.BOOK_TRAVEL},
                {CallToAction.BUY_NOW.value(), CallToAction.BUY_NOW},
                {CallToAction.CONTACT_US.value(), CallToAction.CONTACT_US},
                {CallToAction.DOWNLOAD.value(), CallToAction.DOWNLOAD},
                {CallToAction.GET_QUOTE.value(), CallToAction.GET_QUOTE},
                {CallToAction.INSTALL.value(), CallToAction.INSTALL},
                {CallToAction.LEARN_MORE.value(), CallToAction.LEARN_MORE},
                {CallToAction.NO_BUTTON.value(), CallToAction.NO_BUTTON},
                {CallToAction.OPEN_LINK.value(), CallToAction.OPEN_LINK},
                {CallToAction.ORDER_NOW.value(), CallToAction.ORDER_NOW},
                {CallToAction.REGISTER_NOW.value(), CallToAction.REGISTER_NOW},
                {CallToAction.SEE_MORE.value(), CallToAction.SEE_MORE},
                {CallToAction.SHOP_NOW.value(), CallToAction.SHOP_NOW},
                {CallToAction.SIGN_UP.value(), CallToAction.SIGN_UP},
                {CallToAction.SUBSCRIBE.value(), CallToAction.SUBSCRIBE},
                {CallToAction.UNKNOWN.value(), CallToAction.UNKNOWN},
                {CallToAction.VISIT_SITE.value(), CallToAction.VISIT_SITE},
        });
    }

    @Test
    public void testWrite() {
        this.testWriteProperty("Call To Action", this.datum, this.expectedResult, new BiConsumer<BulkResponsiveAd, CallToAction>() {
            @Override
            public void accept(BulkResponsiveAd c, CallToAction v) {
                c.getResponsiveAd().setCallToAction(v);
            }
        });
    }
}
