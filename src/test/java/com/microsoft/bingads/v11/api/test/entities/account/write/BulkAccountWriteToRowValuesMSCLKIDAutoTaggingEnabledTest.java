package com.microsoft.bingads.v11.api.test.entities.account.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.account.BulkAccountTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAccount;

@RunWith(Parameterized.class)
public class BulkAccountWriteToRowValuesMSCLKIDAutoTaggingEnabledTest extends BulkAccountTest {

    @Parameter(value = 1)
    public Boolean propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        // In this example, the parameter generator returns a List of
        // arrays.  Each array has two elements: { datum, expected }.
        // These data are hard-coded into the class, but they could be
        // generated or loaded in any way you like.
        return Arrays.asList(new Object[][]{
            {"false", false},
            {"true", true},
        });
    }

    @Test
    public void testWrite() {
        this.<Boolean>testWriteProperty("MSCLKID Auto Tagging Enabled", this.datum, this.propertyValue, new BiConsumer<BulkAccount, Boolean>() {
            @Override
            public void accept(BulkAccount c, Boolean v) {
                c.setMSCLKIDAutoTaggingEnabled(v);
            }
        });
    }
}
