package com.microsoft.bingads.v13.api.test.entities.audience.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.audience.BulkProductAudienceTest;
import com.microsoft.bingads.v13.bulk.entities.BulkProductAudience;

@RunWith(Parameterized.class)
public class BulkProductAudienceWriteToRowValuesAudienceTests extends BulkProductAudienceTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        // In this example, the parameter generator returns a List of
        // arrays.  Each array has two elements: { datum, expected }.
        // These data are hard-coded into the class, but they could be
        // generated or loaded in any way you like.
        return Arrays.asList(new Object[][]{
            {"Audience Name","Audience Name"},
            {"",""},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Audience", this.datum, this.propertyValue, new BiConsumer<BulkProductAudience, String>() {
            @Override
            public void accept(BulkProductAudience c, String v) {
                c.getProductAudience().setName(v);
            }
        });
    }
}
