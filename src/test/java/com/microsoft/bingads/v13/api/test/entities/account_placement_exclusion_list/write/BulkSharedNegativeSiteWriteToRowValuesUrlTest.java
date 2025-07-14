package com.microsoft.bingads.v13.api.test.entities.account_placement_exclusion_list.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.account_placement_exclusion_list.BulkSharedNegativeSiteTest;
import com.microsoft.bingads.v13.internal.bulk.entities.BulkSharedNegativeSite;

@RunWith(Parameterized.class)
public class BulkSharedNegativeSiteWriteToRowValuesUrlTest extends BulkSharedNegativeSiteTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
    	return Arrays.asList(new Object[][]{
    		{"https://www.google.com", "https://www.google.com"},
            {null, null}
    	});
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Site List Item Url", this.datum, this.propertyValue, new BiConsumer<BulkSharedNegativeSite, String>() {
            @Override
            public void accept(BulkSharedNegativeSite c, String v) {
                c.getNegativeSite().setUrl(v);
            }
        });
    }
}
