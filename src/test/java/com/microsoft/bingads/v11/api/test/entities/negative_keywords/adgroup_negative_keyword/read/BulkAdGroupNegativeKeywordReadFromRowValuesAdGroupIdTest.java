package com.microsoft.bingads.v11.api.test.entities.negative_keywords.adgroup_negative_keyword.read;

import com.microsoft.bingads.v11.api.test.entities.negative_keywords.adgroup_negative_keyword.BulkAdGroupNegativeKeywordTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupNegativeKeyword;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

public class BulkAdGroupNegativeKeywordReadFromRowValuesAdGroupIdTest extends BulkAdGroupNegativeKeywordTest {

    @Parameter(value = 1)
    public Long expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"123", 123L},
            {"9223372036854775807", 9223372036854775807L},});
    }

    @Test
    public void testRead() {
        this.<Long>testReadProperty("Parent Id", this.datum, this.expectedResult, new Function<BulkAdGroupNegativeKeyword, Long>() {
            @Override
            public Long apply(BulkAdGroupNegativeKeyword c) {
                return c.getAdGroupId();
            }
        });
    }
}
