package com.microsoft.bingads.v11.api.test.entities.negative_keywords.campaign_negative_keyword_list.write;

import com.microsoft.bingads.v11.api.test.entities.negative_keywords.campaign_negative_keyword_list.BulkCampaignNegativeKeywordListTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignNegativeKeywordList;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkCampaignNegativeKeywordListWriteToRowValuesSharedEntityIdTest extends BulkCampaignNegativeKeywordListTest {

    @Parameter(value = 1)
    public Long propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"123", 123L},
            {"9223372036854775807", 9223372036854775807L}
        });
    }

    @Test
    public void testWrite() {
        this.<Long>testWriteProperty("Id", this.datum, this.propertyValue, new BiConsumer<BulkCampaignNegativeKeywordList, Long>() {
            @Override
            public void accept(BulkCampaignNegativeKeywordList c, Long v) {
                c.getSharedEntityAssociation().setSharedEntityId(v);
            }
        });
    }
}
