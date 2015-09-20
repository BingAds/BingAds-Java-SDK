package com.microsoft.bingads.v10.api.test.entities.negative_keywords.campaign_negative_keyword.read;

import com.microsoft.bingads.v10.api.test.entities.negative_keywords.campaign_negative_keyword.BulkCampaignNegativeKeywordTest;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaignNegativeKeyword;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

public class BulkCampaignNegativeKeywordReadFromRowValuesCampaignNameTest extends BulkCampaignNegativeKeywordTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Test AdGroup 1", "Test AdGroup 1"},
            {"", ""},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Campaign", this.datum, this.expectedResult, new Function<BulkCampaignNegativeKeyword, String>() {
            @Override
            public String apply(BulkCampaignNegativeKeyword c) {
                return c.getCampaignName();
            }
        });
    }
}
