package com.microsoft.bingads.v13.api.test.entities.keyword.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.keyword.BulkKeywordTest;
import com.microsoft.bingads.v13.bulk.entities.BulkKeyword;

public class BulkKeywordReadFromRowValuesCampaignIdTest extends BulkKeywordTest {

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
        this.<Long>testReadProperty("Campaign Id", this.datum, this.expectedResult, new Function<BulkKeyword, Long>() {
            @Override
            public Long apply(BulkKeyword c) {
                return c.getCampaignId();
            }
        });
    }
}
