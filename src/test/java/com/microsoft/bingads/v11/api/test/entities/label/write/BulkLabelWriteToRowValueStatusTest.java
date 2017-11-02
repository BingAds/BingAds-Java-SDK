package com.microsoft.bingads.v11.api.test.entities.label.write;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.label.BulkLabelTest;
import com.microsoft.bingads.v11.bulk.entities.BulkLabel;
import com.microsoft.bingads.v11.bulk.entities.Status;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BulkLabelWriteToRowValueStatusTest extends BulkLabelTest {

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
        this.<Status>testWriteProperty("Status", this.datum, this.expectedResult, new BiConsumer<BulkLabel, Status>() {
            @Override
            public void accept(BulkLabel c, Status v) {
                c.setStatus(v);
            }
        });
    }
}
