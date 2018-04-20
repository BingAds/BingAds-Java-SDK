package com.microsoft.bingads.v12.api.test.entities.keyword.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.api.test.entities.keyword.BulkKeywordTest;
import com.microsoft.bingads.v12.bulk.entities.BulkKeyword;
import com.microsoft.bingads.v12.campaignmanagement.KeywordEditorialStatus;

@RunWith(Parameterized.class)
public class BulkKeywordReadFromRowValuesEditorialStatusTest extends BulkKeywordTest {

    @Parameter
    public String datum;

    @Parameter(value = 1)
    public KeywordEditorialStatus expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Active", KeywordEditorialStatus.ACTIVE},
            {"ActiveLimited", KeywordEditorialStatus.ACTIVE_LIMITED},
            {"Disapproved", KeywordEditorialStatus.DISAPPROVED},
            {"Inactive", KeywordEditorialStatus.INACTIVE},
            {"", null},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<KeywordEditorialStatus>testReadProperty("Editorial Status", this.datum, this.expectedResult, new Function<BulkKeyword, KeywordEditorialStatus>() {
            @Override
            public KeywordEditorialStatus apply(BulkKeyword c) {
                return c.getKeyword().getEditorialStatus();
            }
        });
    }
}
