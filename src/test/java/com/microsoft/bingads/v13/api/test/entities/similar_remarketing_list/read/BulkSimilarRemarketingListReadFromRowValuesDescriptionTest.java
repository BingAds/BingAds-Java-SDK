package com.microsoft.bingads.v13.api.test.entities.similar_remarketing_list.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.similar_remarketing_list.BulkSimilarRemarketingListTest;
import com.microsoft.bingads.v13.bulk.entities.BulkSimilarRemarketingList;

public class BulkSimilarRemarketingListReadFromRowValuesDescriptionTest extends BulkSimilarRemarketingListTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Test Description 1", "Test Description 1"},
            {"", ""},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Description", this.datum, this.expectedResult, new Function<BulkSimilarRemarketingList, String>() {
            @Override
            public String apply(BulkSimilarRemarketingList c) {
                return c.getSimilarRemarketingList().getDescription();
            }
        });
    }
}
