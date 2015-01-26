package com.microsoft.bingads.api.test.entities.ads.mobile.write;

import com.microsoft.bingads.api.test.entities.ads.mobile.BulkMobileAdTest;
import com.microsoft.bingads.bulk.entities.BulkMobileAd;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkMobileAdWriteToRowValuesPhoneNumberTest extends BulkMobileAdTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"123-456-7890", "123-456-7890"},
            {"", ""},
            {null, null},});
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Phone Number", this.datum, this.propertyValue, new BiConsumer<BulkMobileAd, String>() {
            @Override
            public void accept(BulkMobileAd c, String v) {
                c.getMobileAd().setPhoneNumber(v);
            }
        });
    }
}
