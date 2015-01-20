package com.microsoft.bingads.api.test.entities.negative_keywords.campaign_negative_keyword.write;

import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.api.test.entities.negative_keywords.campaign_negative_keyword.BulkCampaignNegativeKeywordTest;
import com.microsoft.bingads.bulk.entities.BulkCampaignNegativeKeyword;

@RunWith(Parameterized.class)
public class BulkCampaignNegativeKeywordWriteToRowValuesCampaignNameTest extends BulkCampaignNegativeKeywordTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Test Campaign 1", "Test Campaign 1"},
            {"", ""},
            {null, null},});
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Campaign", this.datum, this.propertyValue, new BiConsumer<BulkCampaignNegativeKeyword, String>() {
            @Override
            public void accept(BulkCampaignNegativeKeyword c, String v) {
                c.setEntityName(v);
            }
        });
    }
}
