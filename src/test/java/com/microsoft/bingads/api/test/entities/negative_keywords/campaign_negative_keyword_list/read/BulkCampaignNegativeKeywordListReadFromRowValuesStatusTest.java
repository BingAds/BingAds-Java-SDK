package com.microsoft.bingads.api.test.entities.negative_keywords.campaign_negative_keyword_list.read;

import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.Function;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.api.test.entities.negative_keywords.campaign_negative_keyword_list.BulkCampaignNegativeKeywordListTest;
import com.microsoft.bingads.bulk.entities.Status;
import com.microsoft.bingads.bulk.entities.BulkCampaignNegativeKeywordList;

@RunWith(Parameterized.class)
public class BulkCampaignNegativeKeywordListReadFromRowValuesStatusTest extends BulkCampaignNegativeKeywordListTest {

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
        this.<Status>testReadProperty("Status", this.datum, this.expectedResult, new Function<BulkCampaignNegativeKeywordList, Status>() {
            @Override
            public Status apply(BulkCampaignNegativeKeywordList c) {
                return c.getStatus();
            }
        });
    }
}
