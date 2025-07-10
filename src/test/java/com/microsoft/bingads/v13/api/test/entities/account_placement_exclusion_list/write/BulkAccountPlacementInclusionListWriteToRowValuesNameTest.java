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
public class BulkAccountPlacementInclusionListWriteToRowValuesNameTest extends BulkAccountPlacementInclusionListTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
    	return Arrays.asList(new Object[][]{
    		{"AccountPlacementInclusionListName", "AccountPlacementInclusionListName"},
            {null, null}
    	});
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Name", this.datum, this.propertyValue, new BiConsumer<BulkAccountPlacementInclusionList, String>() {
            @Override
            public void accept(BulkAccountPlacementInclusionList c, String v) {
                c.getAccountPlacementInclusionList().setName(v);
            }
        });
    }
}
