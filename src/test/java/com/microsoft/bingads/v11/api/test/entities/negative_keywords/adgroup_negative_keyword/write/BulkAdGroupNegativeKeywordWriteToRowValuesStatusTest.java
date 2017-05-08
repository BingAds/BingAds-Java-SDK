package com.microsoft.bingads.v11.api.test.entities.negative_keywords.adgroup_negative_keyword.write;

import com.microsoft.bingads.v11.api.test.entities.negative_keywords.adgroup_negative_keyword.BulkAdGroupNegativeKeywordTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupNegativeKeyword;
import com.microsoft.bingads.v11.bulk.entities.Status;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkAdGroupNegativeKeywordWriteToRowValuesStatusTest extends BulkAdGroupNegativeKeywordTest {

    @Parameter(value = 1)
    public Status propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Active", Status.ACTIVE},
            {"Deleted", Status.DELETED},
            {null, null},});
    }

    @Test
    public void testWrite() {
        this.<Status>testWriteProperty("Status", this.datum, this.propertyValue, new BiConsumer<BulkAdGroupNegativeKeyword, Status>() {
            @Override
            public void accept(BulkAdGroupNegativeKeyword c, Status v) {
                c.setStatus(v);
            }
        });
    }
}
