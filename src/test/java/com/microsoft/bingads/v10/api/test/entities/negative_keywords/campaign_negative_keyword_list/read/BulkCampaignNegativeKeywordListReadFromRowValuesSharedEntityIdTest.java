package com.microsoft.bingads.v10.api.test.entities.negative_keywords.campaign_negative_keyword_list.read;

import com.microsoft.bingads.v10.api.test.entities.negative_keywords.campaign_negative_keyword_list.BulkCampaignNegativeKeywordListTest;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaignNegativeKeywordList;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkCampaignNegativeKeywordListReadFromRowValuesSharedEntityIdTest extends BulkCampaignNegativeKeywordListTest {

    @Parameter(value = 1)
    public Long expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"123", 123L},
            {"9223372036854775807", 9223372036854775807L}
        });
    }

    @Test
    public void testRead() {
        this.<Long>testReadProperty("Id", this.datum, this.expectedResult, new Function<BulkCampaignNegativeKeywordList, Long>() {
            @Override
            public Long apply(BulkCampaignNegativeKeywordList c) {
                return c.getSharedEntityAssociation().getSharedEntityId();
            }
        });
    }
}
