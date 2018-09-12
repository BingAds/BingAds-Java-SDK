package com.microsoft.bingads.v12.api.test.entities.similar_remarketing_list.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.api.test.entities.similar_remarketing_list.BulkSimilarRemarketingListTest;
import com.microsoft.bingads.v12.bulk.entities.BulkSimilarRemarketingList;

public class BulkSimilarRemarketingListReadFromRowValuesNameTest extends BulkSimilarRemarketingListTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Test Audience 1", "Test Audience 1"},
            {"", ""},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Audience", this.datum, this.expectedResult, new Function<BulkSimilarRemarketingList, String>() {
            @Override
            public String apply(BulkSimilarRemarketingList c) {
                return c.getSimilarRemarketingList().getName();
            }
        });
    }
}
