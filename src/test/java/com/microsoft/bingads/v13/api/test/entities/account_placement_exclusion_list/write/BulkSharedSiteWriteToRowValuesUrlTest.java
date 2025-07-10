package com.microsoft.bingads.v13.api.test.entities.account_placement_exclusion_list.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.account_placement_exclusion_list.BulkSharedSiteTest;
import com.microsoft.bingads.v13.internal.bulk.entities.BulkSharedSite;

@RunWith(Parameterized.class)
public class BulkSharedSiteWriteToRowValuesUrlTest extends BulkSharedSiteTest {

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
        this.<String>testWriteProperty("Site List Item Url", this.datum, this.propertyValue, new BiConsumer<BulkSharedSite, String>() {
            @Override
            public void accept(BulkSharedSite c, String v) {
                c.getSite().setUrl(v);
            }
        });
    }
}
