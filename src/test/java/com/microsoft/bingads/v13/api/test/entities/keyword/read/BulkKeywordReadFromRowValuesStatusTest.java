package com.microsoft.bingads.v13.api.test.entities.keyword.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.keyword.BulkKeywordTest;
import com.microsoft.bingads.v13.bulk.entities.BulkKeyword;
import com.microsoft.bingads.v13.campaignmanagement.KeywordStatus;

@RunWith(Parameterized.class)
public class BulkKeywordReadFromRowValuesStatusTest extends BulkKeywordTest {

    @Parameter
    public String datum;

    @Parameter(value = 1)
    public KeywordStatus expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Active", KeywordStatus.ACTIVE},
            {"Deleted", KeywordStatus.DELETED},
            {"Inactive", KeywordStatus.INACTIVE},
            {"Paused", KeywordStatus.PAUSED},
            {"", null},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<KeywordStatus>testReadProperty("Status", this.datum, this.expectedResult, new Function<BulkKeyword, KeywordStatus>() {
            @Override
            public KeywordStatus apply(BulkKeyword c) {
                return c.getKeyword().getStatus();
            }
        });
    }
}
