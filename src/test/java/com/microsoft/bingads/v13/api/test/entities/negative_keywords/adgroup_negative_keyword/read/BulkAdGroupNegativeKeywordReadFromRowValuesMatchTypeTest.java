package com.microsoft.bingads.v13.api.test.entities.negative_keywords.adgroup_negative_keyword.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.negative_keywords.adgroup_negative_keyword.BulkAdGroupNegativeKeywordTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupNegativeKeyword;
import com.microsoft.bingads.v13.campaignmanagement.MatchType;

@RunWith(Parameterized.class)
public class BulkAdGroupNegativeKeywordReadFromRowValuesMatchTypeTest extends BulkAdGroupNegativeKeywordTest {

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
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<MatchType>testReadProperty("Match Type", this.datum, this.expectedResult, new Function<BulkAdGroupNegativeKeyword, MatchType>() {
            @Override
            public MatchType apply(BulkAdGroupNegativeKeyword c) {
                return c.getNegativeKeyword().getMatchType();
            }
        });
    }
}
