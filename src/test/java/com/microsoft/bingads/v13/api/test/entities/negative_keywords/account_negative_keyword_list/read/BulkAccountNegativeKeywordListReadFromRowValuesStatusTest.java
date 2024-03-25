package com.microsoft.bingads.v13.api.test.entities.negative_keywords.account_negative_keyword_list.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.negative_keywords.account_negative_keyword_list.BulkAccountNegativeKeywordListTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAccountNegativeKeywordList;
import com.microsoft.bingads.v13.bulk.entities.Status;

@RunWith(Parameterized.class)
public class BulkAccountNegativeKeywordListReadFromRowValuesStatusTest extends BulkAccountNegativeKeywordListTest {

    @Parameter
    public String datum;

    @Parameter(value = 1)
    public Status expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Active", Status.ACTIVE},
                {"Deleted", Status.DELETED},
                {null, null},
                {"", null}
        });
    }

    @Test
    public void testRead() {
        this.<Status>testReadProperty("Status", this.datum, this.expectedResult, new Function<BulkAccountNegativeKeywordList, Status>() {
            @Override
            public Status apply(BulkAccountNegativeKeywordList c) {
                return c.getStatus();
            }
        });
    }
}
