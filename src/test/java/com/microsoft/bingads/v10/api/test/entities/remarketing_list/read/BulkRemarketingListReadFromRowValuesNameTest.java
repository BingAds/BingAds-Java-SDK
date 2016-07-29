package com.microsoft.bingads.v10.api.test.entities.remarketing_list.read;

import com.microsoft.bingads.v10.api.test.entities.remarketing_list.BulkRemarketingListTest;
import com.microsoft.bingads.v10.bulk.entities.BulkRemarketingList;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

public class BulkRemarketingListReadFromRowValuesNameTest extends BulkRemarketingListTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Test RemarketingList 1", "Test RemarketingList 1"},
            {"", ""},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Remarketing List", this.datum, this.expectedResult, new Function<BulkRemarketingList, String>() {
            @Override
            public String apply(BulkRemarketingList c) {
                return c.getRemarketingList().getName();
            }
        });
    }
}
