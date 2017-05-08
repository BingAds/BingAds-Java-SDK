package com.microsoft.bingads.v11.api.test.entities.keyword.read;

import com.microsoft.bingads.v11.api.test.entities.keyword.BulkKeywordTest;
import com.microsoft.bingads.v11.bulk.entities.BulkKeyword;
import com.microsoft.bingads.v11.campaignmanagement.MatchType;
import com.microsoft.bingads.internal.functionalinterfaces.Function;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

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
            {"Content", MatchType.CONTENT},
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
