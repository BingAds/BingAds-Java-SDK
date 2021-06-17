package com.microsoft.bingads.v13.api.test.entities.ads.responsive.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.ads.responsive.BulkResponsiveAdTest;
import com.microsoft.bingads.v13.bulk.entities.BulkResponsiveAd;
import com.microsoft.bingads.v13.campaignmanagement.LanguageName;

public class BulkResponsiveAdWriteFromRowValuesCallToActionLanguageTest extends BulkResponsiveAdTest {

    @Parameterized.Parameter(value = 1)
    public LanguageName expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
        		{LanguageName.ARABIC.value(), LanguageName.ARABIC},
                {LanguageName.FRENCH.value(), LanguageName.FRENCH},
                {LanguageName.NONE.value(), LanguageName.NONE},
        });
    }

    @Test
    public void testWrite() {
        this.testWriteProperty("Call To Action Language", this.datum, this.expectedResult, new BiConsumer<BulkResponsiveAd, LanguageName>() {
            @Override
            public void accept(BulkResponsiveAd c, LanguageName v) {
                c.getResponsiveAd().setCallToActionLanguage(v);
            }
        });
    }
}
