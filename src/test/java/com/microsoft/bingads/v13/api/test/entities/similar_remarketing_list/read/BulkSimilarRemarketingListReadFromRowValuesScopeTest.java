package com.microsoft.bingads.v13.api.test.entities.similar_remarketing_list.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.similar_remarketing_list.BulkSimilarRemarketingListTest;
import com.microsoft.bingads.v13.bulk.entities.BulkSimilarRemarketingList;
import com.microsoft.bingads.v13.campaignmanagement.EntityScope;

@RunWith(Parameterized.class)
public class BulkSimilarRemarketingListReadFromRowValuesScopeTest extends BulkSimilarRemarketingListTest {

    @Parameter
    public String datum;

    @Parameter(value = 1)
    public EntityScope expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Account", EntityScope.ACCOUNT},
            {"Customer", EntityScope.CUSTOMER},
            {"", null},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<EntityScope>testReadProperty("Scope", this.datum, this.expectedResult, new Function<BulkSimilarRemarketingList, EntityScope>() {
            @Override
            public EntityScope apply(BulkSimilarRemarketingList c) {
                return c.getSimilarRemarketingList().getScope();
            }
        });
    }
}
