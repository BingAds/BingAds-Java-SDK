package com.microsoft.bingads.v13.api.test.entities.negative_keywords.account_content_negative_keyword_list.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.negative_keywords.account_content_negative_keyword_list.BulkAccountContentNegativeKeywordListTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAccountContentNegativeKeywordList;

@RunWith(Parameterized.class)
public class BulkAccountContentNegativeKeywordListWriteToRowValuesNameTest extends BulkAccountContentNegativeKeywordListTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Test List 1", "Test List 1"},
            {"", ""},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Name", this.datum, this.propertyValue, new BiConsumer<BulkAccountContentNegativeKeywordList, String>() {
            @Override
            public void accept(BulkAccountContentNegativeKeywordList c, String v) {
                c.getAccountContentNegativeKeywordList().setName(v);
            }
        });
    }
}
