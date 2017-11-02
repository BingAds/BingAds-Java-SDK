package com.microsoft.bingads.v11.api.test.entities.ads.text.read;

import java.util.Arrays;
import java.util.Collection;


import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v11.api.test.entities.ObjectComparer;
import com.microsoft.bingads.v11.api.test.entities.ads.text.BulkTextAdTest;
import com.microsoft.bingads.v11.bulk.entities.BulkTextAd;
import com.microsoft.bingads.v11.campaignmanagement.ArrayOfKeyValuePairOfstringstring;
import com.microsoft.bingads.v11.campaignmanagement.KeyValuePairOfstringstring;

public class BulkTextAdReadFromRowValuesNativePreferenceTest extends BulkTextAdTest {

    @Parameter(value = 1)
    public String expected;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
            new Object[][] { 
                { null, "" }, 
                { "", "" }, 
                { "All", "All" }, 
                { "Native", "Native" }
                }
            );
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Ad Format Preference", datum, expected, new Function<BulkTextAd, String>() {
                @Override
                public String apply(BulkTextAd c) {
                        return c.getAd().getAdFormatPreference();
                }
        }, new Supplier<BulkTextAd>() {
                @Override
                public BulkTextAd get() {
                        return new BulkTextAd();
                }
        }, new ObjectComparer<String>());
    }
}
