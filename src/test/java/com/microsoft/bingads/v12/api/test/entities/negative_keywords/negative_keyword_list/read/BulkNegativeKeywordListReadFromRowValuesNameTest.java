package com.microsoft.bingads.v12.api.test.entities.negative_keywords.negative_keyword_list.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.api.test.entities.negative_keywords.negative_keyword_list.BulkNegativeKeywordListTest;
import com.microsoft.bingads.v12.bulk.entities.BulkNegativeKeywordList;

public class BulkNegativeKeywordListReadFromRowValuesNameTest extends BulkNegativeKeywordListTest {

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
        this.<String>testReadProperty("Name", this.datum, this.expectedResult, new Function<BulkNegativeKeywordList, String>() {
            @Override
            public String apply(BulkNegativeKeywordList c) {
                return c.getNegativeKeywordList().getName();
            }
        });
    }
}
