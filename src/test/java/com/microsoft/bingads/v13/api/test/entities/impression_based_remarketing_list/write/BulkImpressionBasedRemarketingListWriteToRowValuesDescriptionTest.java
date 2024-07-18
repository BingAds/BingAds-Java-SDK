package com.microsoft.bingads.v13.api.test.entities.impression_based_remarketing_list.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.impression_based_remarketing_list.BulkImpressionBasedRemarketingListTest;
import com.microsoft.bingads.v13.bulk.entities.BulkImpressionBasedRemarketingList;

public class BulkImpressionBasedRemarketingListWriteToRowValuesDescriptionTest extends BulkImpressionBasedRemarketingListTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Test Description 1", "Test Description 1"},
            {"", ""},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Description", this.datum, this.propertyValue, new BiConsumer<BulkImpressionBasedRemarketingList, String>() {
            @Override
            public void accept(BulkImpressionBasedRemarketingList c, String v) {
                c.getImpressionBasedRemarketingList().setDescription(v);
            }
        });
    }
}
