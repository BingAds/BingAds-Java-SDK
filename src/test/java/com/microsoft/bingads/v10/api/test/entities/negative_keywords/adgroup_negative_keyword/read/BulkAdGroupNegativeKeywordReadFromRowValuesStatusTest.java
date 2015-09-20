package com.microsoft.bingads.v10.api.test.entities.negative_keywords.adgroup_negative_keyword.read;

import com.microsoft.bingads.v10.api.test.entities.negative_keywords.adgroup_negative_keyword.BulkAdGroupNegativeKeywordTest;
import com.microsoft.bingads.v10.bulk.entities.BulkAdGroupNegativeKeyword;
import com.microsoft.bingads.v10.bulk.entities.Status;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkAdGroupNegativeKeywordReadFromRowValuesStatusTest extends BulkAdGroupNegativeKeywordTest {

    @Parameter
    public String datum;

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
        this.<Status>testReadProperty("Status", this.datum, this.expectedResult, new Function<BulkAdGroupNegativeKeyword, Status>() {
            @Override
            public Status apply(BulkAdGroupNegativeKeyword c) {
                return c.getStatus();
            }
        });
    }
}
