package com.microsoft.bingads.v10.api.test.entities.ad_extension.call.write;

import com.microsoft.bingads.v10.api.test.entities.ad_extension.call.BulkCallAdExtensionTest;
import com.microsoft.bingads.v10.bulk.entities.BulkCallAdExtension;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkCallAdExtensionWriteFromRowValuesRequireTollFreeTrackingNumberTest extends BulkCallAdExtensionTest {

    @Parameter(value = 1)
    public Boolean expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"True", true},
            {"False", false},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<Boolean>testWriteProperty("Call Only", this.datum, this.expectedResult, new BiConsumer<BulkCallAdExtension, Boolean>() {
            @Override
            public void accept(BulkCallAdExtension c, Boolean v) {
                c.getCallAdExtension().setIsCallOnly(v);
            }
        });
    }
}
