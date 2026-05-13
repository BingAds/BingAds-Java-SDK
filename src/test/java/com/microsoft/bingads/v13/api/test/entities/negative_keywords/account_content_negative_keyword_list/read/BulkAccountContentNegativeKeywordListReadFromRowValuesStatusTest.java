package com.microsoft.bingads.v13.api.test.entities.negative_keywords.account_content_negative_keyword_list.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.negative_keywords.account_content_negative_keyword_list.BulkAccountContentNegativeKeywordListTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAccountContentNegativeKeywordList;
import com.microsoft.bingads.v13.bulk.entities.Status;

@RunWith(Parameterized.class)
public class BulkAccountContentNegativeKeywordListReadFromRowValuesStatusTest extends BulkAccountContentNegativeKeywordListTest {

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
        this.<Status>testReadProperty("Status", this.datum, this.expectedResult, new Function<BulkAccountContentNegativeKeywordList, Status>() {
            @Override
            public Status apply(BulkAccountContentNegativeKeywordList c) {
                return c.getStatus();
            }
        });
    }
}
