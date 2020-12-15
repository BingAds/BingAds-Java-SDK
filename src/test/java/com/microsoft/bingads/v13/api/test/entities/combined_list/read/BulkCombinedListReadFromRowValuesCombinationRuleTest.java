package com.microsoft.bingads.v13.api.test.entities.combined_list.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.combined_list.BulkCombinedListTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCombinedList;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;

public class BulkCombinedListReadFromRowValuesCombinationRuleTest extends BulkCombinedListTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"AND(4)&Or(1,2,3)&not(5)", "And(4)&Or(1,2,3)&Not(5)"},
            {"", null},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Combination Rule", this.datum, this.expectedResult, new Function<BulkCombinedList, String>() {
            @Override
            public String apply(BulkCombinedList c) {
                return StringExtensions.writeCombinationRulesBulkString(c.getCombinedList().getCombinationRules());
            }
        });
    }
}
