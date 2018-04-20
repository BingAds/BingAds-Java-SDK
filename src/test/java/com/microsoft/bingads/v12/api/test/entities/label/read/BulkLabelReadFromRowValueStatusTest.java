package com.microsoft.bingads.v12.api.test.entities.label.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.api.test.entities.label.BulkLabelTest;
import com.microsoft.bingads.v12.bulk.entities.BulkLabel;
import com.microsoft.bingads.v12.bulk.entities.Status;

@RunWith(Parameterized.class)
public class BulkLabelReadFromRowValueStatusTest extends BulkLabelTest {

    @Parameter(value = 1)
    public Status expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Active", Status.ACTIVE},
                {"Deleted", Status.DELETED},
                {"", null},
                {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<Status>testReadProperty("Status", this.datum, this.expectedResult, new Function<BulkLabel, Status>() {
            @Override
            public Status apply(BulkLabel c) {
                return c.getStatus();
            }
        });
    }
}
