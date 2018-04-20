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
import com.microsoft.bingads.v12.campaignmanagement.MatchType;

@RunWith(Parameterized.class)
public class BulkKeywordReadFromRowValuesMatchTypeTest extends BulkKeywordTest {

    @Parameter
    public String datum;

    @Parameter(value = 1)
    public MatchType expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Broad", MatchType.BROAD},
            {"Exact", MatchType.EXACT},
            {"Phrase", MatchType.PHRASE},
            {"", null},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<MatchType>testReadProperty("Match Type", this.datum, this.expectedResult, new Function<BulkKeyword, MatchType>() {
            @Override
            public MatchType apply(BulkKeyword c) {
                return c.getKeyword().getMatchType();
            }
        });
    }
}
