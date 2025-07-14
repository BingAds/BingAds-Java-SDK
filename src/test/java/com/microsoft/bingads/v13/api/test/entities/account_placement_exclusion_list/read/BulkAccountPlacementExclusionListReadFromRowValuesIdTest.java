package com.microsoft.bingads.v13.api.test.entities.account_placement_exclusion_list.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.account_placement_exclusion_list.BulkAccountPlacementExclusionListTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAccountPlacementExclusionList;

@RunWith(Parameterized.class)
public class BulkAccountPlacementExclusionListReadFromRowValuesIdTest extends BulkAccountPlacementExclusionListTest {

    @Parameter(value = 1)
    public Long expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"123", 123L},
            {"9223372036854775807", 9223372036854775807L},
            {"", null},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<Long>testReadProperty("Id", this.datum, this.expectedResult, new Function<BulkAccountPlacementExclusionList, Long>() {
            @Override
            public Long apply(BulkAccountPlacementExclusionList c) {
                return c.getAccountPlacementExclusionList().getId();
            }
        });
    }
}
