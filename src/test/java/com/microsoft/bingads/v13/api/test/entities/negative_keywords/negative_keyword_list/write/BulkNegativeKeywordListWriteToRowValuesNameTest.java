package com.microsoft.bingads.v13.api.test.entities.negative_keywords.negative_keyword_list.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.negative_keywords.negative_keyword_list.BulkNegativeKeywordListTest;
import com.microsoft.bingads.v13.bulk.entities.BulkNegativeKeywordList;

@RunWith(Parameterized.class)
public class BulkNegativeKeywordListWriteToRowValuesNameTest extends BulkNegativeKeywordListTest {

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
        this.<String>testWriteProperty("Name", this.datum, this.propertyValue, new BiConsumer<BulkNegativeKeywordList, String>() {
            @Override
            public void accept(BulkNegativeKeywordList c, String v) {
                c.getNegativeKeywordList().setName(v);
            }
        });
    }
}
