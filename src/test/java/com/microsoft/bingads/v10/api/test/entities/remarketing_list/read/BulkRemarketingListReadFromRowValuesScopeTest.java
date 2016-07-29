package com.microsoft.bingads.v10.api.test.entities.remarketing_list.read;

import com.microsoft.bingads.v10.api.test.entities.remarketing_list.BulkRemarketingListTest;
import com.microsoft.bingads.v10.bulk.entities.BulkRemarketingList;
import com.microsoft.bingads.v10.campaignmanagement.EntityScope;
import com.microsoft.bingads.internal.functionalinterfaces.Function;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkRemarketingListReadFromRowValuesScopeTest extends BulkRemarketingListTest {

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
        this.<EntityScope>testReadProperty("Scope", this.datum, this.expectedResult, new Function<BulkRemarketingList, EntityScope>() {
            @Override
            public EntityScope apply(BulkRemarketingList c) {
                return c.getRemarketingList().getScope();
            }
        });
    }
}
