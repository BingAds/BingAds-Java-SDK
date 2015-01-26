package com.microsoft.bingads.api.test.entities.negative_keywords.campaign_negative_keyword.read;

import com.microsoft.bingads.api.test.entities.negative_keywords.campaign_negative_keyword.BulkCampaignNegativeKeywordTest;
import com.microsoft.bingads.bulk.entities.BulkCampaignNegativeKeyword;
import com.microsoft.bingads.campaignmanagement.MatchType;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkCampaignNegativeKeywordReadFromRowValuesMatchTypeTest extends BulkCampaignNegativeKeywordTest {

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
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<MatchType>testReadProperty("Match Type", this.datum, this.expectedResult, new Function<BulkCampaignNegativeKeyword, MatchType>() {
            @Override
            public MatchType apply(BulkCampaignNegativeKeyword c) {
                return c.getNegativeKeyword().getMatchType();
            }
        });
    }
}
