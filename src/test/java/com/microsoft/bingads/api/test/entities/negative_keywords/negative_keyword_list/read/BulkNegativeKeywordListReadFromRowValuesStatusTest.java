package com.microsoft.bingads.api.test.entities.negative_keywords.negative_keyword_list.read;

import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.Function;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.api.test.entities.negative_keywords.negative_keyword_list.BulkNegativeKeywordListTest;
import com.microsoft.bingads.bulk.entities.Status;
import com.microsoft.bingads.bulk.entities.BulkNegativeKeywordList;

@RunWith(Parameterized.class)
public class BulkNegativeKeywordListReadFromRowValuesStatusTest extends BulkNegativeKeywordListTest {

    @Parameter
    public String datum;

    @Parameter(value = 1)
    public Status expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Active", Status.ACTIVE},
            {"Deleted", Status.DELETED},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<Status>testReadProperty("Status", this.datum, this.expectedResult, new Function<BulkNegativeKeywordList, Status>() {
            @Override
            public Status apply(BulkNegativeKeywordList c) {
                return c.getStatus();
            }
        });
    }
}
