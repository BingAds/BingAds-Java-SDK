package com.microsoft.bingads.v13.api.test.entities.ad_extension.disclaimer.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.disclaimer.BulkDisclaimerAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkDisclaimerAdExtension;

public class BulkDisclaimerAdExtensionWriteToValuesTitleTest extends BulkDisclaimerAdExtensionTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Title", "Title"},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Disclaimer Title", this.datum, this.expectedResult, new BiConsumer<BulkDisclaimerAdExtension, String>() {
            @Override
            public void accept(BulkDisclaimerAdExtension c, String v) {
                c.getDisclaimerAdExtension().setTitle(v);
            }
        });
    }
}
