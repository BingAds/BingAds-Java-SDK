package com.microsoft.bingads.v13.api.test.entities.label.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.label.BulkLabelTest;
import com.microsoft.bingads.v13.bulk.entities.BulkLabel;
import com.microsoft.bingads.v13.bulk.entities.Status;

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
