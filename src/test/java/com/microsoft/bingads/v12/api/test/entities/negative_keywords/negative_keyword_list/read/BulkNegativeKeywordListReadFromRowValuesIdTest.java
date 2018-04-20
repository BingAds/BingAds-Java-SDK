package com.microsoft.bingads.v12.api.test.entities.negative_keywords.negative_keyword_list.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.api.test.entities.negative_keywords.negative_keyword_list.BulkNegativeKeywordListTest;
import com.microsoft.bingads.v12.bulk.entities.BulkNegativeKeywordList;

@RunWith(Parameterized.class)
public class BulkNegativeKeywordListReadFromRowValuesIdTest extends BulkNegativeKeywordListTest {

    @Parameter(value = 1)
    public Long expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"123", 123L},
            {"9223372036854775807", 9223372036854775807L}
        });
    }

    @Test
    public void testRead() {
        this.<Long>testReadProperty("Id", this.datum, this.expectedResult, new Function<BulkNegativeKeywordList, Long>() {
            @Override
            public Long apply(BulkNegativeKeywordList c) {
                return c.getNegativeKeywordList().getId();
            }
        });
    }
}
