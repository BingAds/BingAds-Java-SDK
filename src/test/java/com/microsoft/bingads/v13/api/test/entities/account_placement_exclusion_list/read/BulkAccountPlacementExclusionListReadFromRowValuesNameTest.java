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
public class BulkAccountPlacementExclusionListReadFromRowValuesNameTest extends BulkAccountPlacementExclusionListTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"AccountPlacementExclusionListName", "AccountPlacementExclusionListName"},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Name", this.datum, this.expectedResult, new Function<BulkAccountPlacementExclusionList, String>() {
            @Override
            public String apply(BulkAccountPlacementExclusionList c) {
                return c.getAccountPlacementExclusionList().getName();
            }
        });
    }
}
