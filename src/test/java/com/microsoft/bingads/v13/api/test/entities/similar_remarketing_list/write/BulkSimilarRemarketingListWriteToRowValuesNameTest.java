package com.microsoft.bingads.v13.api.test.entities.similar_remarketing_list.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.similar_remarketing_list.BulkSimilarRemarketingListTest;
import com.microsoft.bingads.v13.bulk.entities.BulkSimilarRemarketingList;

public class BulkSimilarRemarketingListWriteToRowValuesNameTest extends BulkSimilarRemarketingListTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Test Audience 1", "Test Audience 1"},
            {"", ""},
            {null, null}
        });
    }
    
    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Audience", this.datum, this.propertyValue, new BiConsumer<BulkSimilarRemarketingList, String>() {
            @Override
            public void accept(BulkSimilarRemarketingList c, String v) {
                c.getSimilarRemarketingList().setName(v);
            }
        });
    }
}
