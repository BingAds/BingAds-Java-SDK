package com.microsoft.bingads.api.test.entities.keyword.write;

import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.api.test.entities.keyword.BulkKeywordTest;
import com.microsoft.bingads.bulk.entities.BulkKeyword;
import com.microsoft.bingads.campaignmanagement.MatchType;

@RunWith(Parameterized.class)
public class BulkKeywordWriteToRowValuesMatchTypeTest extends BulkKeywordTest {

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
        this.<MatchType>testWriteProperty("Match Type", this.datum, this.propertyValue, new BiConsumer<BulkKeyword, MatchType>() {
            @Override
            public void accept(BulkKeyword c, MatchType v) {
                c.getKeyword().setMatchType(v);
            }
        });
    }
}
