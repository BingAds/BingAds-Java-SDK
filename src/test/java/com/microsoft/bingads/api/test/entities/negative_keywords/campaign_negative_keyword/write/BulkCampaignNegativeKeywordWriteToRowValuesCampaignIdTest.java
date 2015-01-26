package com.microsoft.bingads.api.test.entities.negative_keywords.campaign_negative_keyword.write;

import com.microsoft.bingads.api.test.entities.negative_keywords.campaign_negative_keyword.BulkCampaignNegativeKeywordTest;
import com.microsoft.bingads.bulk.entities.BulkCampaignNegativeKeyword;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkCampaignNegativeKeywordWriteToRowValuesCampaignIdTest extends BulkCampaignNegativeKeywordTest {

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
        this.<Long>testWriteProperty("Parent Id", this.datum, this.propertyValue, new BiConsumer<BulkCampaignNegativeKeyword, Long>() {
            @Override
            public void accept(BulkCampaignNegativeKeyword c, Long v) {
                c.setCampaignId(v);
            }
        });
    }
}
