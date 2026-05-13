package com.microsoft.bingads.v13.api.test.entities.negative_keywords.account_content_negative_keyword_list.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.negative_keywords.account_content_negative_keyword_list.BulkAccountContentNegativeKeywordListTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAccountContentNegativeKeywordList;

public class BulkAccountContentNegativeKeywordListReadFromRowValuesNameTest extends BulkAccountContentNegativeKeywordListTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Test List 1", "Test List 1"},
            {"", ""},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Name", this.datum, this.expectedResult, new Function<BulkAccountContentNegativeKeywordList, String>() {
            @Override
            public String apply(BulkAccountContentNegativeKeywordList c) {
                return c.getAccountContentNegativeKeywordList().getName();
            }
        });
    }
}
