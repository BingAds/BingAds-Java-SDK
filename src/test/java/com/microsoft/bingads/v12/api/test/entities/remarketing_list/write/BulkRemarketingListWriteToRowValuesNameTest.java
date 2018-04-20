package com.microsoft.bingads.v12.api.test.entities.remarketing_list.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v12.api.test.entities.remarketing_list.BulkRemarketingListTest;
import com.microsoft.bingads.v12.bulk.entities.BulkRemarketingList;

public class BulkRemarketingListWriteToRowValuesNameTest extends BulkRemarketingListTest {

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
        this.<String>testWriteProperty("Audience", this.datum, this.propertyValue, new BiConsumer<BulkRemarketingList, String>() {
            @Override
            public void accept(BulkRemarketingList c, String v) {
                c.getRemarketingList().setName(v);
            }
        });
    }
}
