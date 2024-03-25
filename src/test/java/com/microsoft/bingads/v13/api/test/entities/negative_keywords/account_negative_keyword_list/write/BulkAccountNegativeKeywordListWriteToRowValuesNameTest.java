package com.microsoft.bingads.v13.api.test.entities.negative_keywords.account_negative_keyword_list.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.negative_keywords.account_negative_keyword_list.BulkAccountNegativeKeywordListTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAccountNegativeKeywordList;

@RunWith(Parameterized.class)
public class BulkAccountNegativeKeywordListWriteToRowValuesNameTest extends BulkAccountNegativeKeywordListTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Test Keyword 1", "Test Keyword 1"},
            {"", ""},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Name", this.datum, this.propertyValue, new BiConsumer<BulkAccountNegativeKeywordList, String>() {
            @Override
            public void accept(BulkAccountNegativeKeywordList c, String v) {
                c.getAccountNegativeKeywordList().setName(v);
            }
        });
    }
}
