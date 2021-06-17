package com.microsoft.bingads.v13.api.test.entities.ads.responsive.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.ads.responsive.BulkResponsiveAdTest;
import com.microsoft.bingads.v13.bulk.entities.BulkResponsiveAd;
import com.microsoft.bingads.v13.campaignmanagement.LanguageName;

public class BulkResponsiveAdReadFromRowValuesCallToActionLanguageTest extends BulkResponsiveAdTest {

    @Parameter(value = 1)
    public LanguageName expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {LanguageName.FRENCH.value(), LanguageName.FRENCH},
            {LanguageName.NONE.value(), LanguageName.NONE},
            {null, null}
    });
    }

    @Test
    public void testRead() {
        this.testReadProperty("Call To Action Language", this.datum, this.expectedResult, new Function<BulkResponsiveAd, LanguageName>() {
            @Override
            public LanguageName apply(BulkResponsiveAd c) {
                return c.getAd().getCallToActionLanguage();
            }
        });
    }
}
