package com.microsoft.bingads.v12.api.test.entities.adgroup.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.api.test.entities.adgroup.BulkAdGroupTest;
import com.microsoft.bingads.v12.bulk.entities.BulkAdGroup;

@RunWith(Parameterized.class)
public class BulkAdGroupReadFromRowValuesIsExpiredTest extends BulkAdGroupTest {

    @Parameter
    public String datum;

    @Parameter(value = 1)
    public Boolean expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Active", false},
            {"Deleted", false},
            {"Paused", false},
            {"Expired", true},
            {"", false},
            {null, false}
        });
    }

    @Test
    public void testRead() {
        this.<Boolean>testReadProperty("Status", this.datum, this.expectedResult, new Function<BulkAdGroup, Boolean>() {
            @Override
            public Boolean apply(BulkAdGroup c) {
                return c.getIsExpired();
            }
        });
    }
}
