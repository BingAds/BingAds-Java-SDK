package com.microsoft.bingads.v13.api.test.entities.impression_based_remarketing_list.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.impression_based_remarketing_list.BulkImpressionBasedRemarketingListTest;
import com.microsoft.bingads.v13.bulk.entities.BulkImpressionBasedRemarketingList;

public class BulkImpressionBasedRemarketingListReadFromRowValuesDescriptionTest extends BulkImpressionBasedRemarketingListTest {

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
        this.<String>testReadProperty("Description", this.datum, this.expectedResult, new Function<BulkImpressionBasedRemarketingList, String>() {
            @Override
            public String apply(BulkImpressionBasedRemarketingList c) {
                return c.getImpressionBasedRemarketingList().getDescription();
            }
        });
    }
}
