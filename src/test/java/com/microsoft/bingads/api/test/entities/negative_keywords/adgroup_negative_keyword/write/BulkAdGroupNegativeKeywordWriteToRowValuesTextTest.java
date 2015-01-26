package com.microsoft.bingads.api.test.entities.negative_keywords.adgroup_negative_keyword.write;

import com.microsoft.bingads.api.test.entities.negative_keywords.adgroup_negative_keyword.BulkAdGroupNegativeKeywordTest;
import com.microsoft.bingads.bulk.entities.BulkAdGroupNegativeKeyword;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkAdGroupNegativeKeywordWriteToRowValuesTextTest extends BulkAdGroupNegativeKeywordTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        // In this example, the parameter generator returns a List of
        // arrays.  Each array has two elements: { datum, expected }.
        // These data are hard-coded into the class, but they could be
        // generated or loaded in any way you like.
        return Arrays.asList(new Object[][]{
            {"Test NegativeKeyword text", "Test NegativeKeyword text"},
            {"", ""},
            {null, null},});
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Keyword", this.datum, this.propertyValue, new BiConsumer<BulkAdGroupNegativeKeyword, String>() {
            @Override
            public void accept(BulkAdGroupNegativeKeyword c, String v) {
                c.getNegativeKeyword().setText(v);
            }
        });
    }
}
