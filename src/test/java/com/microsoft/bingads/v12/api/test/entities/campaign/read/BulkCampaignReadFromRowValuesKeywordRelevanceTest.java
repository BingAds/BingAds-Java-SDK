package com.microsoft.bingads.v12.api.test.entities.campaign.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.api.test.entities.campaign.BulkCampaignTest;
import com.microsoft.bingads.v12.bulk.entities.BulkCampaign;

@RunWith(Parameterized.class)
public class BulkCampaignReadFromRowValuesKeywordRelevanceTest extends BulkCampaignTest {

    @Parameter(value = 1)
    public Integer expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"123", 123},
            {"2147483647", 2147483647}
        });
    }

    @Test
    public void testRead() {
        this.<Integer>testReadProperty("Keyword Relevance", this.datum, this.expectedResult, new Function<BulkCampaign, Integer>() {
            @Override
            public Integer apply(BulkCampaign c) {
                return c.getQualityScoreData().getKeywordRelevance();
            }
        });
    }
}
