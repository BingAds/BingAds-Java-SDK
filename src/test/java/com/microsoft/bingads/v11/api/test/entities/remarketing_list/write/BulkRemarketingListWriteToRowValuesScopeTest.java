package com.microsoft.bingads.v11.api.test.entities.remarketing_list.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.remarketing_list.BulkRemarketingListTest;
import com.microsoft.bingads.v11.bulk.entities.BulkRemarketingList;
import com.microsoft.bingads.v11.campaignmanagement.EntityScope;

@RunWith(Parameterized.class)
public class BulkRemarketingListWriteToRowValuesScopeTest extends BulkRemarketingListTest {

    @Parameter
    public String datum;

    @Parameter(value = 1)
    public EntityScope propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Customer", EntityScope.CUSTOMER},
            {"Account", EntityScope.ACCOUNT},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<EntityScope>testWriteProperty("Scope", this.datum, this.propertyValue, new BiConsumer<BulkRemarketingList, EntityScope>() {
            @Override
            public void accept(BulkRemarketingList c, EntityScope v) {
                c.getRemarketingList().setScope(v);
            }
        });
    }
}
