package com.microsoft.bingads.v13.api.test.entities.negative_keywords.account_negative_keyword_list.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.negative_keywords.account_negative_keyword_list.BulkAccountNegativeKeywordListTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAccountNegativeKeywordList;

public class BulkAccountNegativeKeywordListReadFromRowValuesNameTest extends BulkAccountNegativeKeywordListTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Test Keyword 1", "Test Keyword 1"},
            {"", ""},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Name", this.datum, this.expectedResult, new Function<BulkAccountNegativeKeywordList, String>() {
            @Override
            public String apply(BulkAccountNegativeKeywordList c) {
                return c.getAccountNegativeKeywordList().getName();
            }
        });
    }
}
