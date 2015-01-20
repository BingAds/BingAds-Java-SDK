package com.microsoft.bingads.api.test.entities.keyword.write;

import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.api.test.entities.keyword.BulkKeywordTest;
import com.microsoft.bingads.bulk.entities.BulkKeyword;
import com.microsoft.bingads.campaignmanagement.KeywordStatus;

@RunWith(Parameterized.class)
public class BulkKeywordWriteToRowValuesStatusTest extends BulkKeywordTest {

    @Parameter(value = 1)
    public KeywordStatus propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Active", KeywordStatus.ACTIVE},
            {"Paused", KeywordStatus.PAUSED},
            {"Inactive", KeywordStatus.INACTIVE},
            {"Deleted", KeywordStatus.DELETED},
            {null, null},});
    }

    @Test
    public void testWrite() {
        this.<KeywordStatus>testWriteProperty("Status", this.datum, this.propertyValue, new BiConsumer<BulkKeyword, KeywordStatus>() {
            @Override
            public void accept(BulkKeyword c, KeywordStatus v) {
                c.getKeyword().setStatus(v);
            }
        });
    }
}
