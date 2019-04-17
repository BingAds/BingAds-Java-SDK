package com.microsoft.bingads.v13.api.test.entities.account.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.account.BulkAccountTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAccount;

@RunWith(Parameterized.class)
public class BulkAccountWriteToRowValuesFinalUrlSuffixTest extends BulkAccountTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        // In this example, the parameter generator returns a List of
        // arrays.  Each array has two elements: { datum, expected }.
        // These data are hard-coded into the class, but they could be
        // generated or loaded in any way you like.
        return Arrays.asList(new Object[][]{
            {"delete_value", ""},
            {null, null},
            {"Final Url Suffix", "Final Url Suffix"},
            {"?src=bing&param=123", "?src=bing&param=123"},
        });
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Final Url Suffix", this.datum, this.propertyValue, new BiConsumer<BulkAccount, String>() {
            @Override
            public void accept(BulkAccount c, String v) {
                c.setFinalUrlSuffix(v);
            }
        });
    }
}
