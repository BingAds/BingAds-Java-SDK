package com.microsoft.bingads.v13.api.test.entities.bid_suggestion_data.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.bid_suggestion_data.BulkKeywordBidSuggestionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkKeywordBidSuggestion;

@RunWith(Parameterized.class)
public class BulkKeywordBidSuggestionReadFromRowValuesBidTest extends BulkKeywordBidSuggestionTest {

    @Parameter(value = 1)
    public Double expectedResult;

    /*
     * Test data generator.
     * This method is called the the JUnit parameterized test runner and
     * returns a Collection of Arrays.  For each Array in the Collection,
     * each array element corresponds to a parameter in the constructor.
     */
    @Parameters
    public static Collection<Object[]> data() {
        // In this example, the parameter generator returns a List of
        // arrays.  Each array has two elements: { datum, expected }.
        // These data are hard-coded into the class, but they could be
        // generated or loaded in any way you like.
        return Arrays.asList(new Object[][]{
            {"12.34", 12.34},
            {"", null},});
    }

    @Test
    public void testRead() {
        this.<Double>testReadProperty("Bid", this.datum, this.expectedResult, new Function<BulkKeywordBidSuggestion, Double>() {
            @Override
            public Double apply(BulkKeywordBidSuggestion c) {
                return c.getBid();
            }
        });
    }
}
