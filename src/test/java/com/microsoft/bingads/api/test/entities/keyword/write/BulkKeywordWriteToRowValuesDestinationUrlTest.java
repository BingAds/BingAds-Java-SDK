package com.microsoft.bingads.api.test.entities.keyword.write;

import com.microsoft.bingads.api.test.entities.keyword.BulkKeywordTest;
import com.microsoft.bingads.bulk.entities.BulkKeyword;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkKeywordWriteToRowValuesDestinationUrlTest extends BulkKeywordTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"http://testDestUrl.com", "http://testDestUrl.com"},
            {"", ""},
            {null, null},});
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Destination Url", this.datum, this.propertyValue, new BiConsumer<BulkKeyword, String>() {
            @Override
            public void accept(BulkKeyword c, String v) {
                c.getKeyword().setDestinationUrl(v);
            }
        });
    }
}
