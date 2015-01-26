package com.microsoft.bingads.api.test.entities.keyword.write;

import com.microsoft.bingads.api.test.entities.keyword.BulkKeywordTest;
import com.microsoft.bingads.bulk.entities.BulkKeyword;
import com.microsoft.bingads.campaignmanagement.Bid;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkKeywordWriteToRowValuesBidTest extends BulkKeywordTest {

    @Parameter(value = 1)
    public Bid propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        Bid withValue = new Bid();
        withValue.setAmount(12.34);

        Bid zeroValue = new Bid();
        return Arrays.asList(new Object[][]{
            {"12.34", withValue},
            {"delete_value", zeroValue},
            {null, null},});
    }

    @Test
    public void testWrite() {
        this.<Bid>testWriteProperty("Bid", this.datum, this.propertyValue, new BiConsumer<BulkKeyword, Bid>() {
            @Override
            public void accept(BulkKeyword c, Bid v) {
                c.getKeyword().setBid(v);
            }
        });
    }
}
