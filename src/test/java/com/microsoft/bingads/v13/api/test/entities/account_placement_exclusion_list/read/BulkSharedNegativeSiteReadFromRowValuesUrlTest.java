package com.microsoft.bingads.v13.api.test.entities.account_placement_exclusion_list.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.account_placement_exclusion_list.BulkSharedNegativeSiteTest;
import com.microsoft.bingads.v13.internal.bulk.entities.BulkSharedNegativeSite;

@RunWith(Parameterized.class)
public class BulkSharedNegativeSiteReadFromRowValuesUrlTest extends BulkSharedNegativeSiteTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"https://www.google.com", "https://www.google.com"},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Site List Item Url", this.datum, this.expectedResult, new Function<BulkSharedNegativeSite, String>() {
            @Override
            public String apply(BulkSharedNegativeSite c) {
                return c.getNegativeSite().getUrl();
            }
        });
    }
}
