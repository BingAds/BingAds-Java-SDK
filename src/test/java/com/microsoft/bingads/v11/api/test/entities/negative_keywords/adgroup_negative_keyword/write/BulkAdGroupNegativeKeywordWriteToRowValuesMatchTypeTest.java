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
import com.microsoft.bingads.v11.campaignmanagement.MatchType;

@RunWith(Parameterized.class)
public class BulkAdGroupNegativeKeywordWriteToRowValuesMatchTypeTest extends BulkAdGroupNegativeKeywordTest {

    @Parameter(value = 1)
    public MatchType propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Broad", MatchType.BROAD},
            {"Content", MatchType.CONTENT},
            {"Exact", MatchType.EXACT},
            {"Phrase", MatchType.PHRASE},
            {null, null},});
    }

    @Test
    public void testWrite() {
        this.<MatchType>testWriteProperty("Match Type", this.datum, this.propertyValue, new BiConsumer<BulkAdGroupNegativeKeyword, MatchType>() {
            @Override
            public void accept(BulkAdGroupNegativeKeyword c, MatchType v) {
                c.getNegativeKeyword().setMatchType(v);
            }
        });
    }
}
