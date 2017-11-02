package com.microsoft.bingads.v11.api.test.entities.keyword.read;

import com.microsoft.bingads.v11.api.test.entities.keyword.BulkKeywordTest;
import com.microsoft.bingads.v11.bulk.entities.BulkKeyword;
import com.microsoft.bingads.v11.campaignmanagement.KeywordStatus;
import com.microsoft.bingads.internal.functionalinterfaces.Function;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

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
