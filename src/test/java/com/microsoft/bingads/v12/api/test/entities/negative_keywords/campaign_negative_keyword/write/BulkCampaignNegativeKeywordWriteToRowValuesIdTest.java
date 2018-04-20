package com.microsoft.bingads.v12.api.test.entities.negative_keywords.campaign_negative_keyword.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v12.api.test.entities.negative_keywords.campaign_negative_keyword.BulkCampaignNegativeKeywordTest;
import com.microsoft.bingads.v12.bulk.entities.BulkCampaignNegativeKeyword;

@RunWith(Parameterized.class)
public class BulkCampaignNegativeKeywordWriteToRowValuesIdTest extends BulkCampaignNegativeKeywordTest {

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
        this.<Long>testWriteProperty("Id", this.datum, this.propertyValue, new BiConsumer<BulkCampaignNegativeKeyword, Long>() {
            @Override
            public void accept(BulkCampaignNegativeKeyword c, Long v) {
                c.getNegativeKeyword().setId(v);
            }
        });
    }
}
