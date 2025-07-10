package com.microsoft.bingads.v13.api.test.entities.account_placement_exclusion_list.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.account_placement_exclusion_list.BulkAccountPlacementInclusionListTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAccountPlacementInclusionList;

@RunWith(Parameterized.class)
public class BulkAccountPlacementInclusionListWriteToRowValuesIdTest extends BulkAccountPlacementInclusionListTest {

    @Parameter(value = 1)
    public Long propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
    	return Arrays.asList(new Object[][]{
            {"123", 123L},
            {"9223372036854775807", 9223372036854775807L},
            {null, null}
    	});
    }

    @Test
    public void testWrite() {
        this.<Long>testWriteProperty("Id", this.datum, this.propertyValue, new BiConsumer<BulkAccountPlacementInclusionList, Long>() {
            @Override
            public void accept(BulkAccountPlacementInclusionList c, Long v) {
                c.getAccountPlacementInclusionList().setId(v);
            }
        });
    }
}
