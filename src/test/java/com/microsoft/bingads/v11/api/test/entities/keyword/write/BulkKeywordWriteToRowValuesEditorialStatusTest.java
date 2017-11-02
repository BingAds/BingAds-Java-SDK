package com.microsoft.bingads.v11.api.test.entities.keyword.write;

import com.microsoft.bingads.v11.api.test.entities.keyword.BulkKeywordTest;
import com.microsoft.bingads.v11.bulk.entities.BulkKeyword;
import com.microsoft.bingads.v11.campaignmanagement.KeywordEditorialStatus;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkKeywordWriteToRowValuesEditorialStatusTest extends BulkKeywordTest {

    @Parameter(value = 1)
    public KeywordEditorialStatus propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Active", KeywordEditorialStatus.ACTIVE},
            {"ActiveLimited", KeywordEditorialStatus.ACTIVE_LIMITED},
            {"Disapproved", KeywordEditorialStatus.DISAPPROVED},
            {"Inactive", KeywordEditorialStatus.INACTIVE},
            {null, null}});
    }

    @Test
    public void testWrite() {
        this.<KeywordEditorialStatus>testWriteProperty("Editorial Status", this.datum, this.propertyValue, new BiConsumer<BulkKeyword, KeywordEditorialStatus>() {
            @Override
            public void accept(BulkKeyword c, KeywordEditorialStatus v) {
                c.getKeyword().setEditorialStatus(v);
            }
        });
    }
}
