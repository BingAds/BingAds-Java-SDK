package com.microsoft.bingads.v12.api.test.entities.similar_remarketing_list.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v12.api.test.entities.similar_remarketing_list.BulkSimilarRemarketingListTest;
import com.microsoft.bingads.v12.bulk.entities.BulkSimilarRemarketingList;
import com.microsoft.bingads.v12.bulk.entities.Status;

@RunWith(Parameterized.class)
public class BulkSimilarRemarketingListWriteToRowValuesStatusTest extends BulkSimilarRemarketingListTest {

    @Parameter
    public String datum;

    @Parameter(value = 1)
    public Status propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Active", Status.ACTIVE},
            {"Deleted", Status.DELETED},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<Status>testWriteProperty("Status", this.datum, this.propertyValue, new BiConsumer<BulkSimilarRemarketingList, Status>() {
            @Override
            public void accept(BulkSimilarRemarketingList c, Status v) {
                c.setStatus(v);
            }
        });
    }
}
