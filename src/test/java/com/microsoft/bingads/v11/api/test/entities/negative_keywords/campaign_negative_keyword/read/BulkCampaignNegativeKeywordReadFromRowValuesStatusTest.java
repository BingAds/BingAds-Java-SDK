package com.microsoft.bingads.v11.api.test.entities.negative_keywords.campaign_negative_keyword.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.negative_keywords.campaign_negative_keyword.BulkCampaignNegativeKeywordTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignNegativeKeyword;
import com.microsoft.bingads.v11.bulk.entities.Status;

@RunWith(Parameterized.class)
public class BulkCampaignNegativeKeywordReadFromRowValuesStatusTest extends BulkCampaignNegativeKeywordTest {

    @Parameter
    public String datum;

    @Parameter(value = 1)
    public Status expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Active", Status.ACTIVE},
            {"Deleted", Status.DELETED},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<Status>testReadProperty("Status", this.datum, this.expectedResult, new Function<BulkCampaignNegativeKeyword, Status>() {
            @Override
            public Status apply(BulkCampaignNegativeKeyword c) {
                return c.getStatus();
            }
        });
    }
}
