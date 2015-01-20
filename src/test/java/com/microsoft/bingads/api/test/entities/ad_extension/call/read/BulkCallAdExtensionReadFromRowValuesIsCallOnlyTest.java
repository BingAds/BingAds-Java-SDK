package com.microsoft.bingads.api.test.entities.ad_extension.call.read;

import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.Function;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.api.test.entities.ad_extension.call.BulkCallAdExtensionTest;
import com.microsoft.bingads.bulk.entities.BulkCallAdExtension;

@RunWith(Parameterized.class)
public class BulkCallAdExtensionReadFromRowValuesIsCallOnlyTest extends BulkCallAdExtensionTest {

    @Parameter(value = 1)
    public Boolean expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"True", true},
            {"False", false},
            {"", null},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<Boolean>testReadProperty("Call Only", this.datum, this.expectedResult, new Function<BulkCallAdExtension, Boolean>() {
            @Override
            public Boolean apply(BulkCallAdExtension c) {
                return c.getCallAdExtension().getIsCallOnly();
            }
        });
    }
}
