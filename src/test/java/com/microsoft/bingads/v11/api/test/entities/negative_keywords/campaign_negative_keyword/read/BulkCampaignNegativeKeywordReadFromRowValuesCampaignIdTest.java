package com.microsoft.bingads.v11.api.test.entities.negative_keywords.campaign_negative_keyword.read;

import com.microsoft.bingads.v11.api.test.entities.negative_keywords.campaign_negative_keyword.BulkCampaignNegativeKeywordTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignNegativeKeyword;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

public class BulkCampaignNegativeKeywordReadFromRowValuesCampaignIdTest extends BulkCampaignNegativeKeywordTest {

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
        this.<Long>testReadProperty("Parent Id", this.datum, this.expectedResult, new Function<BulkCampaignNegativeKeyword, Long>() {
            @Override
            public Long apply(BulkCampaignNegativeKeyword c) {
                return c.getCampaignId();
            }
        });
    }
}
