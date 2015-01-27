package com.microsoft.bingads.api.test.entities.account.read;

import com.microsoft.bingads.api.test.entities.account.BulkAccountTest;
import com.microsoft.bingads.bulk.entities.BulkAccount;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkAccountReadFromRowValuesIdTest extends BulkAccountTest {

    @Parameter(value = 1)
    public Long expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"123", 123L},
            {"9223372036854775807", 9223372036854775807L},
        });
    }

    @Test
    public void testRead() {
        this.<Long>testReadProperty("Id", this.datum, this.expectedResult, new Function<BulkAccount, Long>() {
            @Override
            public Long apply(BulkAccount c) {
                return c.getId();
            }
        });
    }
}
