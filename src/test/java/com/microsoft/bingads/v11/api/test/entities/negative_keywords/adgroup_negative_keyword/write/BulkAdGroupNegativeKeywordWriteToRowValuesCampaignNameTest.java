package com.microsoft.bingads.v11.api.test.entities.negative_keywords.adgroup_negative_keyword.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.negative_keywords.adgroup_negative_keyword.BulkAdGroupNegativeKeywordTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupNegativeKeyword;

@RunWith(Parameterized.class)
public class BulkAdGroupNegativeKeywordWriteToRowValuesCampaignNameTest extends BulkAdGroupNegativeKeywordTest {

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
        this.<String>testWriteProperty("Ad Group", this.datum, this.propertyValue, new BiConsumer<BulkAdGroupNegativeKeyword, String>() {
            @Override
            public void accept(BulkAdGroupNegativeKeyword c, String v) {
                c.setAdGroupName(v);
            }
        });
    }
}
